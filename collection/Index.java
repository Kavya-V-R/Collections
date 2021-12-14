package com.xworkz.collection;

import java.util.ArrayList;
import java.util.List;

public class Index {
	public static void main(String[] args) {
		List arrayList = new ArrayList();
		arrayList.add("kavya");
		arrayList.add(8);
		arrayList.add(true);
		arrayList.add(25.12);
		arrayList.add('K');
		arrayList.add(2);
		int indexof = arrayList.indexOf('K');
		System.out.println(indexof);
	}
}