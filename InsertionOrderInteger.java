package com.bridgeit.algorithm;

import com.bridgeit.utility.Utility;

public class InsertionOrderInteger {
	public static void main(String args[]) {
		Utility utility = new Utility();
		int arr[] = new int[4];
		System.out.println("enter array elements");
		for (int i = 0; i < 4; i++) {
			arr[i] = utility.inputInteger();
		}
		int arr1[] = Utility.insertionSortInteger(arr);
		for (int i = 0; i < 4; i++) {
			System.out.println(arr1[i]);
		}

	}
}
