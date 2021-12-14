package com.xworkz.ArrayList;

public class CountWords {
	public static void main(String[] args) {
		String str = "xworkz is  Training centre located in rajajinagar banglore";
		int count = 1;
		for (int i = 0; i < str.length() - 1; i++) {
			if ((str.charAt(i) == ' ') && (str.charAt(i + 1) != ' ')) {
				count++;
			}
		}
		System.out.println("total number of words in the given string=" + count);
	}
}
