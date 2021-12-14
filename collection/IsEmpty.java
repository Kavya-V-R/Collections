package com.xworkz.collection;

import java.util.ArrayList;
import java.util.List;

public class IsEmpty {
	public static void main(String[] args) {
		List arrayList = new ArrayList();
		System.out.println("Before adding " + arrayList.isEmpty());
		arrayList.add("kavya");
		arrayList.add(5);
		arrayList.add(true);
		arrayList.add(25.12);
		arrayList.add('K');
		arrayList.add(2);
		System.out.println("After adding " + arrayList.isEmpty());
	}
}
