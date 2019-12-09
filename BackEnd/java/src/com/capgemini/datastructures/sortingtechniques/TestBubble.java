package com.capgemini.datastructures.sortingtechniques;

import java.util.Scanner;

public class TestBubble {
	public static void main(String[] args) {
		
		

		int arr[]= {3,60,2,4,78,54,344,3,78,3};
		
		System.out.println(" Array Before Sorting--------------");
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		BubbleSort.bubbleSorting(arr);
		
		System.out.println("Array After Sorting-------------------");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}

	

}
