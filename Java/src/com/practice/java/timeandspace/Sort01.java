package com.practice.java.timeandspace;

import java.util.Scanner;

public class Sort01 {
	// used for swapping ith and jth elements of array
	public static void swap(int[] arr, int i, int j) {
		System.out.println("Swapping " + arr[i] + " and " + arr[j]);
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	public static void print(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

	public static void main(String[] args) throws Exception {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scn.nextInt();
		}
		sort01(arr);
		print(arr);
		scn.close();
	}

	private static void sort01(int[] arr) {
		int i = 0;
		int j = 0;

		while (i < arr.length) {
			if (arr[i] == 1) {
				i++;
			} else if (arr[i] == 0) {
				swap(arr, i, j);
				i++;
				j++;
			}
		}
	}
}