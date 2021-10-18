package com.bridgelab.algorithm.program;

import java.util.Scanner;

public class FindYourNumber {
	static Scanner sc = new Scanner(System.in);

	public static int search(int low, int high) {
		if ((high - low) == 1)
			return low;
		int mid = (low + high) / 2;
		System.out.println("Is it less than " + mid);
		boolean rs = sc.nextBoolean();
		if (rs)
			return search(low, mid);
		else
			return search(mid, high);
	}

	public static void main(String[] args) {

		System.out.println("Enter any number : ");
		int k = sc.nextInt();
		int n = (int) Math.pow(2, k);
		System.out.println("Think of an integer between 0 and " + (n - 1));
		int secret = search(0, n);
		System.out.println("Your number is " + secret);
	}

}
