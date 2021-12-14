package com.xworkz.ArrayList;

public class MinNum {

	public static void main(String[] args) {
		int[] intArray = { 70, 26, 75, 63, 87, 62, 21 };
		int minNum = intArray[0];
		for (int i : intArray) {
			if (i < minNum)
				minNum = i;
		}
		System.out.println("minimum number among the given array is :" + minNum);
	}
}
