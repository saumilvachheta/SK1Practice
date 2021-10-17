package com.phoenix.collections.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.phoenix.comparators.ProductNameComparator;
import com.phoenix.models.Product;


public class ProductListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Product> productList = new ArrayList<Product>();
		// List<Product> productList = new ArrayList<Product>(); // same as above
		productList.add(new Product(1002, "Mobile", "Nokia", 23500.00f));
		productList.add(new Product(1005, "Laptop", "Lenovo", 28700.00f));
		productList.add(new Product(1006, "Refrigerator", "Whirlpool", 39800.00f));
		productList.add(new Product(1001, "UHD TV", "Sony", 79999.00f));
		productList.add(new Product(1002, "Mobile", "Nokia", 23500.00f));
		
		System.out.println("Before Sorting");
		for (Product product : productList) {
			System.out.println(product);
		}
		
		System.out.println(); 
		
		Collections.sort(productList);
		
		System.out.println("Sorting according to id asc");
		for (Product product : productList) {
			System.out.println(product);
		}
		
		System.out.println();
 		
		Collections.sort(productList, Collections.reverseOrder()); 
		System.out.println("Sorting according to id desc");
		for (Product product : productList) {
			System.out.println(product);
		}
		
		System.out.println();
		
		Comparator<Product> cNm = new ProductNameComparator();
		Collections.sort(productList, cNm);
		
		System.out.println("Sorting according to name asc");
		for (Product product : productList) {
			System.out.println(product);
		}
		
		Collections.sort(productList, cNm.reversed()); // newer version 
		// Collections.sort(productList, Collections.reverseOrder(cNm)); // older version
		System.out.println("Sorting according to name desc");
		for (Product product : productList) {
			System.out.println(product);
		}
		
		// try ordering the product using price also  // like CompareNum.java // Home Work
	}

}
