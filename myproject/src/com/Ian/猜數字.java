package com.Ian;

import java.util.Scanner;

public class ²q¼Æ¦r {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Please guess a number bewteen 1 and 100 :");
		int n = s.nextInt();
		if (n >= 25) {
			System.out.println("Please guess a number bewteen 25 and 50:");
			int number2 = s.nextInt();
			if (n >=40) {
				System.out.println("Please guess a number bewteen 40 and 60 :");
				int number3 = s.nextInt();
				if (n >= 55) {
					System.out.println("Please guess a number bewteen 55 and 60 :");
					int number4 = s.nextInt();
					if (n == 59) {
						System.out.println("BINGO!!!:");
					} else {
						System.out.println("Please try again");

					}
				}
			}
		}
	}
}