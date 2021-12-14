package com.xworkz.collection;

import java.util.ArrayList;
import java.util.List;

public class Remove {
	public static void main(String[] args) {
		List arrayList = new ArrayList();
		arrayList.add("kavya");
		arrayList.add(8);
		arrayList.add(true);
		arrayList.add(25.12);
		arrayList.add('K');
		arrayList.add(2);
		//Object remove = arrayList.remove(2);
		//System.out.println(remove);
		//System.out.println(arrayList.size());
		Object remove = arrayList.remove(true);
		System.out.println(remove);
		System.out.println(arrayList.size());
	}
}
