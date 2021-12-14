package com.xworkz.collection;

import java.util.ArrayList;
import java.util.List;

public class Get {
	public static void main(String[] args) {
		List arrayList = new ArrayList();
		arrayList.add("kavya");
		arrayList.add(8);
		arrayList.add(true);
		arrayList.add(25.12);
		arrayList.add('K');
		arrayList.add(2);
		Object object=arrayList.get(5);
		System.out.println(object);
	}
}