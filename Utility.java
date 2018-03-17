package com.bridgeit.utility;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;
import org.json.simple.parser.JSONParser;

import com.bridgeit.datastructure.LinkedList1;

public class Utility {
	Scanner scanner;

	public Utility() {
		scanner = new Scanner(System.in);

	}

	// INPUT STRING
	/**
	 * @return
	 */
	public String inputString() {
		try {
			return scanner.next();
		} catch (Exception e) {
			System.out.println(e);
		}
		return "";
	}

	// INPUT INTEGER
	/**
	 * @return
	 */
	public int inputInteger() {
		try {
			return scanner.nextInt();
		} catch (Exception e) {
			System.out.println(e);
		}
		return 0;
	}

	// Double value
	/**
	 * @return
	 */
	public double inputDouble() {
		try {
			return scanner.nextDouble();
		} catch (Exception e) {
			System.out.println(e);
		}
		return 0.0;
	}

	public boolean inputBoolean() {
		try {
			return scanner.nextBoolean();
		} catch (Exception e) {
			System.out.println(e);
		}
		return true;
	}

	public float inputFloat() {
		try {
			return scanner.nextFloat();
		} catch (Exception e) {
			System.out.println(e);
		}
		return (float) 0.0;
	}
	public long inputLong() {
		try {
			return scanner.nextLong();
		} catch (Exception e) {
			System.out.println(e);
		}
		return 0;
		
	}


	/**
	 * @param username
	 */
	public static void replaceUsername(String username) {
		String str = "Hello<<UserName>>, How are you?";

		if (username.length() > 3) {
			System.out.println("valid string");
			String replaceString = str.replace("<<UserName>>", username);
			System.out.println(replaceString);
		} else {
			System.out.println("Enter valid username greater than 3");
		}

	}

	/**
	 * @param x1
	 * @param y1
	 * @param x2
	 * @param y2
	 */
	public static void distance(double x1, double y1, double x2, double y2) {
		double dis = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));

		System.out.println("distance between the points" + dis);
	}

	/**
	 * @param toss
	 */
	public static void percentage(int toss) {

		float b[] = new float[toss];
		int losecount = 0;
		int wincount = 0;

		for (int i = 0; i < toss; i++) {

			b[i] = (float) Math.random();
			System.out.println(b[i]);

		}
		for (int i = 0; i < toss; i++)

		{
			if (b[i] < 0.5) {
				losecount++;

			} else {
				wincount++;

			}

		}
		System.out.println("The number of head is" + losecount);
		System.out.println("The number of tails us" + wincount);
		int losingpercentage = losecount * 100 / toss;
		int winningpercentage = wincount * 100 / toss;
		System.out.println("The percentage of head is" + losingpercentage);
		System.out.println("The percentage of tail is" + winningpercentage);

	}

	/**
	 * @param leapyear
	 * @return
	 */
	public static void checkLeapyear(int leapyear)

	{
		if ((leapyear % 4 == 0) && (leapyear % 100 != 0)) {
			System.out.print("This is a Leap Year");
		} else if (leapyear % 100 == 0) {
			System.out.print("This is not a Leap Year");
		} else if (leapyear % 400 == 0) {
			System.out.print("This is a Leap Year");
		} else {
			System.out.print("This is not a Leap Year");
		}
	}

	/**
	 * @param power
	 */
	public static void powerOf2(int power) {
		int mul = 2;

		for (int i = 0; i <= power; i++) {
			if (i == 0) {
				System.out.println("2^0=1");
			} else {
				int j = 1;
				j = j * mul;

				System.out.println("2^" + i + "=" + j);
				mul = mul * 2;
			}
		}
	}

	/**
	 * @param nthNumber
	 */
	public static void harmonicuptoN(int nthNumber) {

		double sum = 0;
		for (int i = 1; i <= nthNumber; i++) {
			if (nthNumber == 0) {
				System.out.println("Enter nonzero number");
			} else {
				sum = sum + ((1.0 / i));
			}
		}
		System.out.println("The sum of " + nthNumber + "  harmonic number is  " + sum);

	}

	/**
	 * @param number
	 */
	public static void primeFactor(int number) {
		for (int i = 2; i < number; i++) {
			if (number % i == 0 && prime(i)) {
				System.out.println("The prime factors are" + i);
			}
		}
	}

	/**
	 * @param j
	 * @return
	 */
	public static boolean prime(int j) {
		boolean b = false;
		for (int i = 2; i < j; i++) {
			if (j % i == 0) {
				b = false;
				break;
			} else {
				b = true;
			}
		}
		if (j == 2) {
			b = true;
		}
		return b;
	}

	/**
	 * @param attempts
	 * @param goalamount
	 * @param amount
	 */
	public static void Gamblerwinsorloss(int attempts, int goalamount, int amount) {
		int loseCount = 0;
		int winCount = 0;
		float arr[] = new float[attempts];
		for (int i = 0; i < attempts; i++)

		{
			arr[i] = (float) Math.random();
			System.out.println(arr[i]);
			if (arr[i] < 0.5) {
				loseCount++;
				amount--;
				if (amount == 0) {
					System.out.println("player is lose");
					break;
				}

			} else {
				winCount++;
				amount++;
				if (amount == goalamount) {
					System.out.println("player win");
					break;
				}
			}

		}
		System.out.println("The number of times wins is" + winCount++);
		int winpercentage = winCount * 100 / attempts;
		System.out.println("The wining percentage is=" + winpercentage);
		System.out.println("The number of times wins is" + loseCount++);
		int losepercentage = loseCount * 100 / attempts;
		System.out.println("The wining percentage is=" + losepercentage);

	}

	/**
	 * @param totalcoupon
	 */
	public static void randomnonrepeating(int totalcoupon)

	{

		random1(totalcoupon);
		System.out.println();

	}

	/**
	 * @param totalcoupon
	 */
	public static void random1(int totalcoupon) {
		Random r = new Random();
		for (int k = 0; k < totalcoupon; k++) {
			System.out.print(" " + r.nextInt(9999) + " ");
		}
	}

	static public void numberMatrix()

	{

		Utility utility = new Utility();
		System.out.println("Enter the number of rows");
		int rows = utility.inputInteger();
		System.out.println("Enter the number of columns");
		int columns = utility.inputInteger();
		int a[][] = new int[rows][columns];
		System.out.println("Entered the values of matrix");
		for (int i = 0; i < rows; i++)

		{
			for (int j = 0; j < columns; j++)

			{
				a[i][j] = utility.inputInteger();
			}
		}
		System.out.println("The entered numbered matrix values are");
		for (int i = 0; i < rows; i++)

		{
			for (int j = 0; j < columns; j++)

			{
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}

	}

	static public void floatMatrix()

	{
		Utility utility = new Utility();
		float a[][] = new float[3][3];
		System.out.println("Enter the number of rows");
		int rows = utility.inputInteger();
		System.out.println("Enter the number of columns");
		int columns = utility.inputInteger();
		System.out.println("Enter the values of matrix");
		for (int i = 0; i < rows; i++)

		{
			for (int j = 0; j < columns; j++)

			{
				a[i][j] = utility.inputFloat();

			}
		}
		for (int i = 0; i < rows; i++)

		{
			for (int j = 0; j < columns; j++)

			{
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}

	}

	/**
	 * 
	 */
	static public void booleanMatrix() {

		Utility utility = new Utility();
		boolean a[][] = new boolean[3][3];
		System.out.println("Enter the number of rows");
		int rows = utility.inputInteger();
		System.out.println("Enter the number of columns");
		int columns = utility.inputInteger();
		System.out.println("Enter the values of matrix");
		for (int i = 0; i < rows; i++)

		{
			for (int j = 0; j < columns; j++)

			{
				a[i][j] = utility.inputBoolean();

			}
		}
		System.out.println("The entered booleanmatrix vaues is");
		for (int i = 0; i < rows; i++)

		{
			for (int j = 0; j < columns; j++)

			{
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}

	}

	/**
	 * @param number
	 */
	public static void sumofThreeInteger(int number) {
		int zeroofThreeInteger = 0;
		Utility utility = new Utility();
		int a[] = new int[number];
		System.out.println("Enter array elements");

		for (int i = 0; i < number; i++)

		{
			a[i] = utility.inputInteger();
		}
		for (int i = 0; i < number; i++)

		{
			System.out.print("The array elements is" + a[i] + "  ");
		}
		boolean found = true;
		for (int i = 0; i < number - 2; i++) {
			for (int j = i + 1; j < number - 1; j++) {
				for (int k = j + 1; k < number; k++) {
					if (a[i] + a[j] + a[k] == 0) {
						System.out.print(a[i]);
						System.out.print(" ");
						System.out.print(a[j]);
						System.out.print(" ");
						System.out.print(a[k]);
						System.out.print("\n");
						found = true;
						zeroofThreeInteger++;
					}
				}
			}
		}

		if (found == false) {
			System.out.println(" not exist ");
		}
		System.out.println("the number of triplets is " + zeroofThreeInteger);
	}

	/**
	 * @param a
	 * @param b
	 * @param c
	 */
	public static void rootsofQuadratic(int a, int b, int c) {
		int d = b * b - 4 * a * c;
		if (d > 0) {
			System.out.println("Roots of the equation are real and unequal");
			double root1 = (-b + Math.sqrt(d)) / (2 * a);
			double root2 = (-b - Math.sqrt(d)) / (2 * a);
			System.out.println("First root is:" + root1);
			System.out.println("Second root is:" + root2);
		} else if (d == 0) {
			System.out.println("Roots of the equation are real and equal");
			double root1 = (-b + Math.sqrt(d)) / (2 * a);
			System.out.println("Root:" + root1);
		} else {
			System.out.println("Roots of the given equation are imaginary");
		}

	}

	/**
	 * @param temp
	 * @param speed
	 */
	public static void nationalWeatherService(int temp, int speed) {
		if ((temp > 50) && (speed > 3 && speed < 120)) {
			System.out.println("The temperature is" + temp + "The windspeed is" + speed);
			System.out.print("The speed to the power .16 is ");
			double speepow = Math.pow(speed, 0.16);
			System.out.println(speepow);
			double windchill = (float) (35.74 + 0.6125 * temp + (0.4275 * temp - 35.75) * speepow);
			System.out.println("The Weather Service" + windchill);
		} else {
			System.out.println("Enter correct temperature and windspeed");

		}

	}

	/**
	 * @return
	 */
	public static long start() {
		Utility utility = new Utility();
		System.out.println("print 1 to start the time");
		int start = utility.inputInteger();
		System.out.println(start);
		long time = System.currentTimeMillis();
		System.out.println(time);
		return time;
	}

	/**
	 * @return
	 */
	public static long end() {
		Utility utility = new Utility();
		System.out.println("print 2 to end the time");
		int end = utility.inputInteger();
		System.out.println(end);
		long time1 = System.currentTimeMillis();
		System.out.println(time1);
		return time1;
	}

	/**
	 * @param time1
	 * @param time
	 */
	public static void duration(long time1, long time) {

		System.out.println("difference");
		long time2 = time1 - time;
		System.out.println(time2);
	}

	/**
	 * @param str
	 * @param l
	 * @param r
	 */
	public static void permutation(String str, int l, int r) {
		if (l == r) {
			System.out.println(str);
		} else {
			for (int i = l; i <= r; i++) {
				str = swap(str, l, i);
				permutation(str, l + 1, r);
				str = swap(str, l, i);
			}
		}
	}

	/**
	 * @param str
	 * @param i
	 * @param j
	 * @return
	 */
	public static String swap(String str, int i, int j) {
		char temp;
		char charArray[] = str.toCharArray();
		temp = charArray[i];
		charArray[i] = charArray[j];
		charArray[j] = temp;
		return String.valueOf(charArray);
	}

	static public void convertBinary(int decimalNumber) {
		int binary[] = new int[40];
		int index = 0;
		while (decimalNumber > 0) {
			binary[index++] = decimalNumber % 2;
			decimalNumber = decimalNumber / 2;
		}
		for (int i = index - 1; i >= 0; i--) {
			System.out.print(binary[i]);
		}
	}

	static public void SqrtNew(double n) {
		double epsilon = 1e-15;
		double t = n;

		while (Math.abs(t - n / t) > epsilon * t) {
			t = (n / t + t) / 2.0;
		}

		System.out.println("The squareroot of a given number" + t);
	}

	static public void calendarDay(int month, int date, int year) {
		int x = year + (year / 4) - (year / 100) + (year / 400);
		int mo = month + 12 * ((14 - month) / 12) - 2;

		int dateofday = (date + x + ((31 * mo) / 12)) % 7;
		System.out.println(dateofday);

	}

	public static void mergeSort(int[] elements, int low, int high) {

		if (low < high) {
			int mid = (low + high) / 2;
			mergeSort(elements, low, mid);
			mergeSort(elements, mid + 1, high);
			merge(elements, low, mid, high);
		}
	}

	static void merge(int[] subset, int low, int mid, int high) {

		int n = high - low + 1;
		int[] Temp = new int[n];

		int i = low, j = mid + 1;
		int k = 0;

		while (i <= mid || j <= high) {
			if (i > mid)
				Temp[k++] = subset[j++];
			else if (j > high)
				Temp[k++] = subset[i++];
			else if (subset[i] < subset[j])
				Temp[k++] = subset[i++];
			else
				Temp[k++] = subset[j++];
		}

		for (j = 0; j < n; j++)
			subset[low + j] = Temp[j];
	}

	public static void insertion(String[] stringArray) {
		int i, j;
		String key;

		for (j = 1; j < stringArray.length; j++) {
			key = stringArray[j];

			i = j - 1;
			while (i >= 0) {
				if (key.compareTo(stringArray[i]) > 0) {
					break;
				}
				stringArray[i + 1] = stringArray[i];

				i--;

			}
			stringArray[i + 1] = key;
			System.out.println(Arrays.toString(stringArray));
		}
	}

	public static void celsiusFarhen(double celsius, double fahrenheit) {

		double celstoFah = (celsius * 9 / 5) + 32;
		System.out.println("The celsius to fahrenheit temperature is" + celstoFah);
		double fahtoCels = (fahrenheit - 32) * 5 / 9;
		System.out.println("The fahrenheit to celsius temperature is" + fahtoCels);

	}

	public static void anagram(String firststring, String secondstring) {

		char s5;
		String s6 = "";
		char s7;
		String s8 = "";
		char[] s1 = firststring.toCharArray();
		char[] s2 = firststring.toCharArray();
		for (int i = 0; i <= s1.length - 1; i++) {
			for (int j = i + 1; j <= s1.length - 1; j++) {
				if (s1[i] > s1[j]) {
					s5 = s1[j];
					s1[j] = s1[i];
					s1[i] = s5;
				}
			}
			s6 = s6 + s1[i];
		}
		System.out.println(s6);
		for (int i = 0; i <= s2.length - 1; i++) {
			for (int j = i + 1; j <= s2.length - 1; j++) {
				if (s2[i] > s2[j]) {
					s7 = s2[j];
					s2[j] = s2[i];
					s2[i] = s7;
				}
			}
			s8 = s8 + s2[i];
		}
		System.out.println(s8);

		if (s6.equalsIgnoreCase(s8)) {
			System.out.println("entered string is anagram string");
		} else {
			System.out.println("entered string is not a anagram string");
		}
	}

	@SuppressWarnings("unused")
	public static int[] PrimeRange() 
	{    
		
		int a[] = new int[1000];
		for (int i = 3; i < 1000; i++) 
		{
			int k = 0;
			for (int j = 2; j < i; j++)
			{
				if (i % j == 0)                                                                        
				{
					k = 1;
					break;
				}

			}
			if (k == 0) 
			{
				for (int l = 0; l < 1000; l++) 
				{
					a[l] = i;
					System.out.print(i + " ");
					break;
				}
			}

		}
		
		return a;
	     
		
	}

	public static void primepalindrome()

	{
		boolean isPrime;
		int rem, temp, reversed;
		for (int number = 1; number <= 1000; number++) {
			isPrime = true;
			if (number >= 2) {
				for (int i = 2; i <= (number / 2); i++) {
					if ((number % i) == 0)
						isPrime = false;
				}
				if (isPrime) {
					temp = number;
					reversed = 0;
					while (temp != 0) {
						rem = temp % 10;
						reversed = (reversed * 10) + rem;
						temp /= 10;
					}
					if (reversed == number) {
						System.out.print(number + " ");
					}
				}
			}
		}
		System.out.println();
	}

	public static String wordsearch1(String searchWord1, List<String> list) {
		System.out.println(list);
		for (int i = 0; i < list.size(); i++) {
			int start = 0;
			int end = list.size() - 1;
			while (start <= end) {
				int mid = (start + end) / 2;
				if (searchWord1.equals(list.get(mid))) {
					System.out.println("word is found");
					return "Yes";

				}
				if (searchWord1.compareToIgnoreCase(list.get(mid)) < 0) {
					end = mid - 1;
				} else {
					start = mid + 1;
				}
			}

		}
		return searchWord1;
	}

	public static void monthlyPayment(double principal, double year, double rate) {
		double interestRate = (rate * 12) / 100;
		System.out.println(interestRate);
		double c = 1 + interestRate;
		System.out.println(c);
		double month = 12 * year;
		System.out.println(month);
		double d = Math.pow(c, month);
		System.out.println(d);
		double monthlyPayment = ((principal * interestRate) / (1 - 1 / d));
		System.out.println("The monthly payment is" + monthlyPayment);
	}

	public static void vendingMachine(int amount) {
		int count = 0;
		if (amount > 0) {

			while (amount >= 1000) {
				count++;
				amount = amount - 1000;
				System.out.println("1000");
			}
			while (amount >= 500) {
				count++;
				amount = amount - 500;
				System.out.println("500");
			}
			while (amount >= 100) {
				count++;
				amount = amount - 100;
				System.out.println("100");
			}
			while (amount >= 50) {
				count++;
				amount = amount - 50;
				System.out.println("50");
			}
			while (amount >= 10) {
				count++;
				amount = amount - 10;
				System.out.println("10");
			}
			while (amount >= 5) {
				count++;
				amount = amount - 5;
				System.out.println("5 ");
			}
			while (amount >= 2) {
				count++;
				amount = amount - 2;
				System.out.println("2 ");
			}
			while (amount >= 1) {
				count++;
				amount = amount - 1;
				System.out.println("1 ");

			}
		} else {
			System.out.println("please input right amount:" + count);
		}
		System.out.println();
		if (count > 0) {
			System.out.println("number of note:" + count);
		}
	}

	public static void binarySearchInteger(int arr[], int search) {
		int first = 0;
		int last = arr.length - 1;
		int mid = (first + last) / 2;

		while (first <= last) {
			if (arr[mid] < search) {
				first = mid + 1;
			} else if (arr[mid] == search) {
				System.out.println("Element is found at index:" + mid);
				break;
			} else {
				last = mid - 1;
			}
			mid = (first + last) / 2;
		}
		if (first > last) {
			System.out.println("element is not found");
		}
	}

	public static int binarysearchstring(String search, String[] words, int low, int high) {
		if (high <= low) {
			return -1;
		}
		if (low <= high) {
			int mid = (low + high) / 2;
			if (search.compareTo(words[mid]) == 0) {
				return mid;
			} else if (search.compareTo(words[mid]) > 0) {
				return binarysearchstring(search, words, mid + 1, high);
			} else {
				return binarysearchstring(search, words, low, mid - 1);
			}
		}
		return -1;
	}

	public static int[] insertionSortInteger(int arr[]) {
		int temp;
		for (int i = 1; i < arr.length; i++) {
			for (int j = i; j > 0; j--) {
				if (arr[j - 1] > arr[j]) {
					temp = arr[j];
					arr[j] = arr[j - 1];
					arr[j - 1] = temp;
				}

			}
		}
		return arr;

	}

	public static String[] insertionSortString1(String arr[]) {
		String temp;
		for (int i = 1; i < arr.length; i++) {
			for (int j = i; j > 0; j--) {
				if (arr[j].compareToIgnoreCase(arr[j - 1]) < 0) {
					temp = arr[j];
					arr[j] = arr[j - 1];
					arr[j - 1] = temp;

				}
			}
		}

		return arr;

	}

	public static int[] bubbleSortInt(int bubble[]) {
		for (int i = 0; i < bubble.length; i++) {
			for (int j = i + 1; j < bubble.length; j++) {
				if (bubble[i] > bubble[j]) {
					int temp = bubble[i];
					bubble[i] = bubble[j];
					bubble[j] = temp;
				}
			}
		}
		return bubble;
	}

	public static void bubblesortString(String input[]) {
		for (int i = 0; i < input.length; i++) {
			for (int j = i + 1; j < input.length; j++) {
				if (input[i].compareToIgnoreCase(input[j]) > 0) {
					String temp = input[i];
					input[i] = input[j];
					input[j] = temp;
				}
			}
			System.out.println(input[i]);
		}
	}

	


	public static String convertBinary1(int number) {

		String newnumber = "";
		int binary[] = new int[40];
		int index = 0;
		int count = 8;
		while (number > 0 || count != 0) {
			binary[index++] = number % 2;
			number = number / 2;
			count--;
		}
		for (int i = index - 1; i >= 0; i--) {

			newnumber = newnumber + binary[i];
		}
		return newnumber;

	}

	public static String newNibble(String s2) {

		String lowerNibble = s2.substring(0, 4);
		String upperNibble = s2.substring(4, 8);
		String swappedBinary = upperNibble + lowerNibble;
		return swappedBinary;

	}

	public int BinaryToDecimal(int binaryNumber) {

		int decimal = 0;
		int p = 0;
		while (true) {
			if (binaryNumber == 0) {
				break;
			} else {
				int temp = binaryNumber % 10;
				decimal += temp * Math.pow(2, p);
				binaryNumber = binaryNumber / 10;
				p++;
			}
		}
		return decimal;
	}

	public static int[] primerange(int number) {
		for (int i = 3; i < number; i++) {
			int k = 0;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					k = 1;
					break;
				}

			}
			if (k == 0) {
				System.out.print(" " + i);
			}
		}
		return null;
		

	}

	public static List<String> readFile(String searchWord) throws IOException {
		String str;
		String str1;
		List<String> list = new ArrayList<String>();
		FileReader fileReader = new FileReader("abc.text");
		BufferedReader bufferedReader = new BufferedReader(fileReader);

		String line = bufferedReader.readLine();
		System.out.println(line);
		while (line != null) {
			String[] stringArray = line.split(" ");
			for (String s11 : stringArray) {
				list.add(s11);
			}

			line = bufferedReader.readLine();
		}

		for (int i = 0; i <= list.size() - 1; i++) {
			for (int j = i + 1; j <= list.size() - 1; j++) {
				if (list.get(i).compareToIgnoreCase(list.get(j)) > 0) {
					str = list.get(j);
					str1 = list.get(i);
					list.set(j, str1);
					list.set(i, str);

				}
			}
		}
		for (int i = 0; i <= list.size() - 1; i++)

		{
			System.out.print(list.get(i));
			System.out.println(" ");
		}
		bufferedReader.close();
		wordsearch1(searchWord, list);
		return list;

	}

	public static LinkedList1 addRemove(boolean status, String searchWord, LinkedList1 ll) {

		if (status != true) {

			ll.add(searchWord);
		} else {

			ll.remove(searchWord);

		}
		return ll;
	}

	public static List<Integer> Sorting(LinkedList<Integer> ll) {
		LinkedList<Integer> ll1 = new LinkedList<Integer>();
		for (int i = 0; i <= ll.size() - 1; i++) {
			for (int j = i + 1; j <= ll.size() - 1; j++) {
				if (ll.get(i) > ll.get(j)) {
					int temp = ll.get(i);
					int temp1 = ll.get(i);
					ll.set(j, temp1);
					ll.set(i, temp);

				}
				System.out.println(ll.get(i));
			}

		}

		ll1 = ll;
		return ll1;

	}

	public static void readFile(LinkedList1 ll, String searchWord) {

		try {
			FileWriter writer = new FileWriter("abc.text", true);
			BufferedWriter write = new BufferedWriter(writer);
			write.write(searchWord);
			write.close();
			writer.close();
		} catch (Exception e) {
			System.out.println(e);
		}

	}

	public static LinkedList1 addRemoveOrder(boolean status, String searchWord, LinkedList1 ll2) {

		if (status != true) {

			ll2.add(searchWord);
		} else {

			ll2.remove(searchWord);

		}
		return ll2;
	}
    public static int[] sortArray(int arr[],int n)
    {
    	for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(arr[i]>arr[j]) 
				{
				   int temp=arr[j];
				   arr[j]=arr[i];
				   arr[i]=temp;
			    }
			
		}
    }
		return arr;
    }
   public static void put(int arr[])
   {
	   HashMap<Integer,Integer> map = new HashMap<>();
	   for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%11==0)
			{
				map.put(0,arr[i]);
			}
			if(arr[i]%11==1)
			{
				map.put(1,arr[i]);
			}
			if(arr[i]%11==2)
			{
				map.put(2,arr[i]);
			}
			if(arr[i]%11==3)
			{
			map.put(3,arr[i]);
			}
			if(arr[i]%11==4)
			{
				map.put(4,arr[i]);
			}
			if(arr[i]%11==5)
			{
				map.put(5,arr[i]);
			}
			if(arr[i]%11==6)
			{
				map.put(6,arr[i]);
			}
			if(arr[i]%11==7)
			{
				map.put(7,arr[i]);
			}
			if(arr[i]%11==8)
			{
				map.put(8,arr[i]);
			}
			if(arr[i]%11==9)
			{
				map.put(9,arr[i]);
			}
			if(arr[i]%11==10)
			{
				map.put(10,arr[i]);
			}
			
		}
	   for (Integer key : map.keySet()) {
		    System.out.println("Key = " + key);
		}

		
		for (Integer value : map.values()) {
		    System.out.println("Value = " + value);
		}
	
	   
   }
   public static void NumberOfBinarySearchTree(int node)
   {
	   long fact1=0,fact2=0,fact3=0,counter=0;
	
			   
		       fact1 = factorial((2)*(node));
		       fact2 = factorial((node+1));
		       fact3 = factorial(node);
			   
	   try
	   {
		   counter = fact1/(fact2*fact3);
	   }
	   catch(Exception e)
	   {
		   e.printStackTrace();
	   }
	   System.out.println(counter);
   }
   
   public static int factorial(int number)
   {
	   int i,fact=1;
	   for(i=1;i<=number;i++)
	   {
		   fact=fact*i;
	   }
	   
	   return fact;
	   		
   }
     public static void writeData() throws IOException
     {
    	 File file = new File("Inventory.json");
    	 try
    	 {
    		
    		 Utility utility = new Utility();
    		 FileWriter writer = new FileWriter(file);
        	 JSONObject object1 = new JSONObject();
        	 JSONObject object2 = new JSONObject();
        	 JSONObject object3 = new JSONObject();
    		 String name;
    		 double weight,price;
    		 
    		 // input for rice
    		 
    		 System.out.println("name of rice");
    		 name = utility.inputString();
    		 System.out.println("weight of rice");
    		 weight = utility.inputDouble();
    		 System.out.println("price of rice");
    		 price = utility.inputDouble();
    		 object1.put("name",name);
    		 object1.put("weight", weight);
    		 object1.put("price", price);
    		 
    		 // input for pulses
    		 
    		 System.out.println("name of pulse");
    		 name = utility.inputString();
    		 System.out.println("weight of pulse");
    		 weight = utility.inputDouble();
    		 System.out.println("price of pulse");
    		 price = utility.inputDouble();
    		 object2.put("name",name);
    		 object2.put("weight", weight);
    		 object2.put("price", price);
    		 
    		 // input for wheats
    		 
    		 System.out.println("name of wheats");
    		 name = utility.inputString();
    		 System.out.println("weight of wheats");
    		 weight = utility.inputDouble();
    		 System.out.println("price of wheats");
    		 price = utility.inputDouble();
    		 object3.put("name",name);
    		 object3.put("weight", weight);
    		 object3.put("price", price);
    		 
    		 JSONObject items = new JSONObject();
    		 items.put("rice",object1);
    		 items.put("pulse",object2);
    		 items.put("wheat",object3);
    		 writer.write(JSONValue.toJSONString(items));
    	     writer.flush();
    	     writer.close();
    		 
    	 
    	 
    	 }
    	 catch(Exception e)
    	 {
    		e.printStackTrace();
    	 }
     }

	  public static void readData()
	  {
		  File file = new File("Inventory.json");
		  try
		  {
			  FileReader reader = new FileReader(file);
			  JSONParser parser = new JSONParser();
			  JSONObject object = (JSONObject)parser.parse(reader);
			  @SuppressWarnings("rawtypes")
			Iterator iterator = object.keySet().iterator();
			  while(iterator.hasNext())
			  {
				  String key = (String)iterator.next();
				  JSONObject object1 = (JSONObject)object.get(key);
				  @SuppressWarnings("rawtypes")
				Iterator iterator1 = object.keySet().iterator();
				  while(iterator1.hasNext())
				  {
					  @SuppressWarnings("unused")
					String key1 = (String)iterator1.next();
				  }
				  System.out.println();
				  System.out.println("total cost of "+object1.get("name")+ "is"+Double.parseDouble(object1.get("weight").toString())*
				 Double.parseDouble(object1.get("price").toString()));
			  }
		  }
		  catch(Exception e)
		  {
			  e.printStackTrace();
		  }
		  
	  }
	  
	  public static String replaceNameFullname(String Sentence)
	  {
		  Utility utility =new Utility();
		  System.out.println("Enter new name");
		  String newname = utility.inputString();
		  System.out.println("Enter full name");
		  String fullname = utility.inputString();
		  String replacename=Sentence.replaceAll("<<name>>",newname);
		  String replacenamefullname=replacename.replaceAll("<<fullname>>",fullname);
		  
		return replacenamefullname;
	  }
	  public static String replaceMobilenumber(String Sentence1)
	  {
		  Utility utility =new Utility();
		  System.out.println("Enter Mobilenumber");
		  String Mobilenumber=utility.inputString();
		  String replacemobilenumber=Sentence1.replaceAll("91-xxxxxxxxxx",Mobilenumber);
		  
		  
		 
		return replacemobilenumber;
	  }
	  public static String replaceDate(String Sentence2)
	  {
		  Utility utility =new Utility();
		  System.out.println("Enter new date");
		  String newdate = utility.inputString();
		  String replacedate=Sentence2.replaceAll("01/01/2016", newdate);
		  
		return replacedate;
		  
	  }
	  public static void stockReport()
	  {
		  JSONArray jsonArray = new JSONArray();
		  Utility utility = new Utility();
		  System.out.println("Enter the number of company");
		  int number=utility.inputInteger();
		  String[] array = new String[number];
			int share[] = new int[number];
			int amount[] = new int[number];
			int total[] = new int[number];
			System.out.println("Enter Company Names: ");
			int totalStock=0;
			for(int i=0; i<number; i++){

				array[i] =utility.inputString();
			}


			for(int k=0; k<number; k++){
				System.out.println(" number of shares for company and share amount");
				share[k] = utility.inputInteger();
				amount[k] = utility.inputInteger();
				total[k] = share[k]*amount[k];
			}
			
			System.out.println("*******************Stock Report**************************");
			System.out.println();
			System.out.println("  Company Name   Shares   Price   total of each");
			System.out.println();
			PrintWriter printWriter =null;
			try {
				printWriter = new PrintWriter("/home/bridgeit/Documents/Nilesh/Filesforjson/Stock.json");
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

			for(int l=0; l<number; l++)
			{
				System.out.println("  "+array[l]+"        "+share[l]+"       "+amount[l]+"     "+total[l]+"/-");	
				JSONObject jsonObject = new JSONObject();
				jsonObject.put("Company Name",array[l]);
				jsonObject.put("Shares",share[l]);
				jsonObject.put("Price",amount[l]);
				jsonObject.put("total",total[l]);
				jsonArray.add(jsonObject);

			}	

			printWriter.write(jsonArray.toJSONString());
			printWriter.flush();
			printWriter.close();
			System.out.println();
			for(int m=0; m<number; m++){

				totalStock= totalStock+share[m]*amount[m];
			}
			System.out.println("Total stock is: "+totalStock);

	  }
	  
	 public static boolean anagram(int number,int number2)
	 {
		 String string = Integer.toString(number);
		 char[] charArray = string.toCharArray();
		 String string2 = Integer.toString(number2);
		 char[] charArray2 = string2.toCharArray();
		 Arrays.sort(charArray);
		 Arrays.sort(charArray2);
		 string = new String(charArray);
		 string2 = new String(charArray2);
		 if(string.length()==string2.length())
		 {
			 if(string.equals(string2))
			 {
				 return true;
				 
			 }	 
		 }
		return false;
		 }  


  public static LinkedList<Integer> primeNumber(int start,int end)
  {
	
	  LinkedList<Integer> list = new LinkedList<Integer>();
	  for(int a= start;a<end;a++)
	  {
		  int number=a;int count=0;
		  for(int i=1;i<=number;i++)
		  {
			  count=0;
			  for(int j=2;j<=i/2;j++)
			  {
				  if(i%j==0)
				  {
					  count++;
					  break;
				  }
			  }
		  }
		  if(count==0)
		  {
			  list.add(a);
		  }
	  }
	return list;
	  
  }
} 















