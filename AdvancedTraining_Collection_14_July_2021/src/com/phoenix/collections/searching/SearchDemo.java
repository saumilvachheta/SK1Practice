package com.phoenix.collections.searching;

import java.util.Arrays;

public class SearchDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] arr1 = {50, 20, 80, 40, 10, 90};
		
		int searchIdx1 = Arrays.binarySearch(arr1, 20);
		System.out.println("element is found at index no : " + searchIdx1);
		
		int [] arr2 = {50, 20, 80, 40, 10, 90};
		
		Arrays.sort(arr2);
		
		System.out.println("Sorted Array : ");
		Arrays.stream(arr2).forEach(System.out::println); 
		
		int searchIdx2 = Arrays.binarySearch(arr2, 85);
		System.out.println("element is found at index no : " + searchIdx2);
		
		
		// List and use this same practical using list and Collections
		
	}

}
