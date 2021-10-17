package com.phoenix.collections.set;

import java.util.HashSet;
import java.util.Set;

import com.phoenix.models.Product;

/*
 * @author saumil.vachheta@stltech.in
 * @version 1.0
 * @creation_date 14-Jul-2021
 * @copyright SterliteTechnologies Ltd.
 */

public class ProductSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<Product> productSet = new HashSet<Product>(); 
		// internally set calls hashCode method of object. So here we are passing duplicate objects, but their address is different.
		// That's why both object are added, because according to set , their hashCode is different, hence they are added.
		// This is programmer error. To remove this, we have to redefine hashCode method.
		productSet.add(new Product(1002, "Mobile", "Nokia", 23500.00f));
		productSet.add(new Product(1005, "Laptop", "Lenovo", 28700.00f));
		productSet.add(new Product(1006, "Refrigerator", "Whirlpool", 39800.00f));
		productSet.add(new Product(1001, "UHD TV", "Sony", 79999.00f));
		productSet.add(new Product(1002, "Mobile", "Nokia", 23500.00f));
		
		System.out.println("Before Sorting");
		for (Product product : productSet) {
			System.out.println(product);
		}
		
	}

}
