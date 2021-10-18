package com.bridgelab.algorithm.program;

import java.util.Scanner;

//String permutation of a String.
public class PermutationString {

	// Generate all permutations of a String
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String s = scn.nextLine();
		int length = s.length();
		permutation(s, 0, length - 1);
	}

	// Permutations of String
	public static void permutation(String s, int i, int j) {
		if (i == j) {
			System.out.println(s);
		} else {
			for (int k = i; k <= j; k++) {
				s = swap(s, i, k);
				permutation(s, i + 1, j);
			}
		}
	}

	// Swapping of String
	public static String swap(String s, int i, int j) {
		char temp;
		char ch[] = s.toCharArray();
		temp = ch[i];
		ch[i] = ch[j];
		ch[j] = temp;
		return String.valueOf(ch);

	}
}
