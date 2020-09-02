package com.practice.java.pattern;

import java.util.Scanner;

public class Pattern13 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		for (int i = 0; i < n; i++) {
			int icj = 1;
			for (int j = 0; j <= i; j++) {
				System.out.print(icj + "\t");
				int icjp1 = (icj * (i - j)) / (j + 1);
				icj = icjp1;
			}
			System.out.print("\n");
		}
		scn.close();
	}

}