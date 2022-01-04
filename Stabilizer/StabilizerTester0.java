package com.xworkz.collection.Stabilizer;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.xworkz.collection.Stabilizer.DTO.Stabilizer;

public class StabilizerTester0 {

	public static void main(String[] args) {
		
		List arrayList = new ArrayList();
		
		Stabilizer S = new Stabilizer("Vguard", 123, 1200, 244);
		Stabilizer S2 = new Stabilizer("sony", 123, 1200, 234);
		Stabilizer S3 = new Stabilizer("bpl", 123, 1200, 224);
		Stabilizer S4 = new Stabilizer("mi", 123, 1200, 214);
		
		arrayList.add(S);
		arrayList.add(S2);
		arrayList.add(S3);
		arrayList.add(S4);
		arrayList.add(12);

		
		Iterator iterator = arrayList.iterator();
		while (iterator.hasNext()) {
			Object next = iterator.next();
			Stabilizer stab = (Stabilizer) next;
			System.out.println(stab.getBrand());
			System.out.println(stab.getPrice());
			System.out.println(stab.getSerialNumber());
			System.out.println(stab.getVolt());
			System.out.println("-------------------------------");
		}
}
}