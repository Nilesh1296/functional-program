package com.bridgeit.datastructure;

import com.bridgeit.utility.Utility;

public class BinarySearchTree 
{
  public static void main(String args[])
  {
	  Utility utility = new Utility();
		System.out.println("Enter the number of node: ");
		int node = utility.inputInteger();
		Utility.NumberOfBinarySearchTree(node);
  }
}
