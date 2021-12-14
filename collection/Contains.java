package com.xworkz.collection;

import java.util.ArrayList;
import java.util.List;

public class Contains {
	public static void main(String[] args) {
		List arrayList = new ArrayList();
		arrayList.add("kavya");
		arrayList.add(8);
		arrayList.add(true);
		arrayList.add(25.12);
		arrayList.add('K');
		arrayList.add(2);
		boolean contains=arrayList.contains(1);
		System.out.println(contains);
	}
}
