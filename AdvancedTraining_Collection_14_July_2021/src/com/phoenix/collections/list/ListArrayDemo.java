package com.phoenix.collections.list;

import java.util.Arrays;
import java.util.List;

public class ListArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// List<Integer> numList = new ArrayList<Integer>();
		List<Integer> numList = Arrays.asList(100, 600, 300, 200, 800, 500);
		numList.forEach(System.out::println);
		// numList.add(120);
		// numList.remove(2);
		System.out.println();
		numList.set(2, 2000); // this operation is allowed, because it doesn't change the size of the array.
		numList.forEach(System.out::println);
		
		System.out.println();
		System.out.println();
		
		// List to array Conversion
		Integer [] iArr = new Integer[numList.size()];
		iArr = numList.toArray(iArr);
		for(int ele : iArr)
			System.out.println(ele); 
	}

}
