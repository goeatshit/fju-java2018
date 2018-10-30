package com.Ian;

import java.util.Random;
import java.util.Scanner;

public class P {

	public static void main(String[] args) {
		int w = 50;

		while (w > w + 1) {
			System.out.println("YOU¡@GOT A VIRIUS!!!");
		}
		if (w < w + 1) {
			System.out.println("bullshit");
		} else {

			Scanner s = new Scanner(System.in);
			System.out.println("Please guess a number:");
			int number = s.nextInt();
			System.out.println("The number I was thinking is:");
			Random r = new Random();
			int secret = r.nextInt(100) + 1;
			System.out.println(secret);
			System.out.println("You were off by:");
		}
	}
}
/*
 * float n=19.54329f; String name="Ian";
 * System.out.printf("Hi,%s\n"+"your age:%.4f",name,n);
 */

/*
 * double c = 24.00; double F = c * 9 / 5 + 32; System.out.print(c + "=" + F);
 */
