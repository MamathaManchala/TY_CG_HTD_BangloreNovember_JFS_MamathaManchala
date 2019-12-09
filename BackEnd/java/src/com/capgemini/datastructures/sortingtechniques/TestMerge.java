package com.capgemini.datastructures.sortingtechniques;

import java.util.Scanner;

public class TestMerge {
	public static void main(String[] args) 
    {
        int n, res,i;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number of elements in the array:");
        n = s.nextInt();
        int a[] = new int[n];
        System.out.println("Enter "+n+" elements ");
        for( i=0; i < n; i++)
        {
            a[i] = s.nextInt();
        }
 
        System.out.println( "elements in array ");
        MergeSort.printarray(a);
         MergeSort.Sort(a,0,n-1);
        System.out.println( "\nelements after sorting");
        MergeSort.printarray(a);
       
  }
}
