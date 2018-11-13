package com.Ian;

import java.util.Random;
import java.util.Scanner;

public class Nubmer {

	public static void main(String[] args) {
		Random r = new Random();
		int secret = r.nextInt(10) + 1;
		Scanner s = new Scanner(System.in);
		while (1 != 0) {
			System.out.print("Your guess:");
			int number = s.nextInt();
			if (number < secret) {
				System.out.println("higher");
			} else if (number > secret) {
				System.out.println("lower");
			} else {
				if (number == secret) {
					System.out.println("Great!The secret number is:" + secret);
					break;
				}
				
			}
		}
	}
}

