package com.Ian;

import java.util.Scanner;

public class Signup {

	public static void main(String[] args) {
		System.out.println("Are you an adult? (y/N)");
		Scanner s = new Scanner(System.in);
		String line = s.nextLine();
		boolean adult = line.toUpperCase().equals("Y");
		if (adult) {
			System.out.println("Your age?");
			Scanner w = new Scanner(System.in);
			int age = w.nextInt();
			System.out.println("Your name, nickname?");
			String name = w.nextLine();
			String nickname = w.nextLine();
			/*System.out.println("Your age,Your name,nickname?");
			Scanner w = new Scanner(System.in);
			int age = w.nextInt();
			String name = w.nextLine();
			String nickname = w.nextLine();*/

		} else {
			System.out.println("Go home");
		}

	}

}
