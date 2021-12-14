package com.xworkz.ArrayList;

public class MaxNum {
	public static void main(String[] args) {
		int[] intArray = { 70, 26, 75, 63, 87, 62, 21 };
		int maxNum = intArray[0];
		for (int i : intArray) {
			if (i > maxNum)
				maxNum = i;
		}
		System.out.println("maximum number among the given array is :" + maxNum);
	}
}
