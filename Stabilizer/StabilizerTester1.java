package com.xworkz.collection.Stabilizer;

import java.util.ArrayList;
import java.util.List;

import com.xworkz.collection.Stabilizer.DTO.Stabilizer;

public class StabilizerTester1 {
	public static void main(String[] args) {

		List arrayList = new ArrayList();

		Stabilizer S1 = new Stabilizer("Vguard", 123, 1200, 224);
		Stabilizer S2 = new Stabilizer("Vguard", 123, 1200, 224);
		boolean equals = S1.equals(S2);
		System.out.println(equals);
	}
}
