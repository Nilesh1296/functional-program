/******************************************************************************
  
 *  Purpose: Determines the number search using binary method
 *
 *  @author  Nilesh singh
 *  @version 1.0
 *  @since   27-02-2018
 *
 ******************************************************************************/

package com.bridgeit.algorithm;

import com.bridgeit.utility.Utility;

public class BinarySearchInteger {
	public static void main(String args[]) {
		Utility utility = new Utility();
		int arr[] = new int[10];
		System.out.println("enter array elements");
		for (int i = 0; i < 10; i++) {
			arr[i] = utility.inputInteger();
		}
		System.out.println("Enter the search value");
		int search = utility.inputInteger();
		Utility.binarySearchInteger(arr, search);
	}
}
