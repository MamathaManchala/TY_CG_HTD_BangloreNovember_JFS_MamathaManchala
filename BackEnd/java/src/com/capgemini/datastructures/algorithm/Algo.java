package com.capgemini.datastructures.algorithm;


import java.time.Duration;
import java.time.Instant;

public class Algo {

	public static void main(String[] args) {
		long number = 99999999L;
		System.out.println(addUptoQuick(number));
		System.out.println("----------------------------");
     	System.out.println(addUpto(number));
     	System.out.println("----------------------------");
		countingDuration1();
		System.out.println("----------------------------");
		countingDuration2();
		System.out.println("----------------------------");
		addUpto(number);
		
		System.out.println("----------------------------");
		addUptoQuick(number);
		System.out.println("----------------------------");
		
	}
		public static long addUpto(Long number) {//occuping more space and time
			long total=0L;
			for(long i= 0;i <= number; i++) {
				total = total + i;
			}
			return total;
		}
	public static long addUptoQuick(Long number) {//less space and time
		return number *(number+1)/2;
		
	}
	public static void countingDuration1() {
		long number =9999999999L;
		Instant start = Instant.now();
		System.out.println("addUpto: "+ addUpto(number));
		Instant end = Instant.now();
		long duration =Duration.between(start, end).toMillis();
		double seconds=duration/1000.0;
		System.out.println("addUpto time: "+seconds +"seconds");
	}
	
	public static void countingDuration2() {
		long number =99999999L;
		Instant start = Instant.now();
		System.out.println("addUpto: "+ addUpto(number));
		Instant end = Instant.now();
		long duration =Duration.between(start, end).toMillis();
		double seconds=duration/1000.0;
		System.out.println("addUpto time: "+seconds +"seconds");
	}
}
