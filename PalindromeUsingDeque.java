package com.bridgeit.datastructure;

import com.bridgeit.utility.Utility;

public class PalindromeUsingDeque {
	public static void main(String[] args) {

		Utility utility = new Utility();

		System.out.println("Enter to check palindrome or not");
		String string = utility.inputString();
		char[] ch = string.toCharArray();
		Dequeue deque = new Dequeue();
		for (int i = 0; i < ch.length; i++) {
			deque.insertAtFront(ch[i]);
		}
		deque.display();

		if (string.equals(deque.display())) {
			System.out.println("Palindrome ");
		} else {
			System.out.println("not a palindrome ");
		}

		System.out.println("Thank you");
	}
}
