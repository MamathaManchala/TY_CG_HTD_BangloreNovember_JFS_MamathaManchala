package com.capgemini.datastructures.sortingtechniques;

public class BubbleSort {
		static void bubbleSorting(int []arr) {
		
			int temp = 0;
			
			for(int i=0;i<arr.length;i++){
				for(int j=1;j<arr.length-i;j++) {
					if(arr[j-1]>arr[j]) {
						temp=arr[j-1];
						arr[j-i]=arr[j];
						arr[j]=temp;
					}
				}
			}
		}
	
}
