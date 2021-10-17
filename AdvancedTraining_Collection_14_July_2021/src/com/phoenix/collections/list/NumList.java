package com.phoenix.collections.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.phoenix.comparators.CompareNum;

public class NumList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> numList = new ArrayList<Integer>();
		// List<Integer> numList = new ArrayList<Integer>(); // same as above
		numList.add(120);
		numList.add(150);
		numList.add(90);
		numList.add(20);
		numList.add(120);
		numList.add(100);

		Collections.sort(numList, new CompareNum());
		// Iterating over list
		for (int i = 0; i < numList.size(); i++) {
			int ele = numList.get(i);
			System.out.println(ele);
		}
		
		System.out.println();
		
		Comparator<Integer> c = Collections.reverseOrder();
		Collections.sort(numList, c); 
		for (int i = 0; i < numList.size(); i++) {
			int ele = numList.get(i);
			System.out.println(ele);
		}
		/*
		// Iterating over list 
		for (int i = 0; i < numList.size(); i++) { 
			int ele = numList.get(i); 
			System.out.println(ele); 
		}
		  
		System.out.println("Using Iterator"); // Using Iterator 
		Iterator<Integer> it = numList.iterator(); 
		while (it.hasNext()) { 
			int ele = it.next();
			System.out.println(ele); 
		}
		  
		System.out.println("Using For each loop"); // Using for each loop 
		for (int ele : numList) { 
			System.out.println(ele); 
		}
		  
		// Printing list directly System.out.println(numList);
		  
		// Reverse List 
		Collections.reverse(numList);
		System.out.println("Reverse List"); // Using for each loop 
		for (int ele : numList) { 
			System.out.println(ele); 
		}
		  
		Collections.sort(numList);
		*/
		 

	}
}
