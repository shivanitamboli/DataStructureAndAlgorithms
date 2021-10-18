package com.bridgelab.algorithm.program;

import java.util.Arrays;
import java.util.Scanner;

//Binary search of given words
public class BinarySearchWord {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter number of words you wish to input: ");
		int n = scn.nextInt();
		String[] words = new String[n];

		System.out.println("Enter the words");
		for (int i = 0; i < words.length; i++) {
			System.out.print("WORD " + (i + 1) + ": ");
			words[i] = scn.next();
		}

		// To sort the words and print them
		Arrays.sort(words);
		for (int m = 0; m < words.length; m++) {
			System.out.print(words[m] + " ");
		}

		System.out.println("\nEnter the word you want to search for");
		String word = scn.next();
		int li = 0, hi = n - 1, mi = 0;

		// For searching the word from the given words
		while (li <= hi) {
			mi = (li + hi) / 2;
			if (words[mi].equals(word)) {
				System.out.println(word + " is word number=" + (mi + 1));
				break;
			} else if ((words[mi].compareTo(word)) < 0) {
				li = mi + 1;
			} else {
				hi = mi;
			}
		}
	}
}
