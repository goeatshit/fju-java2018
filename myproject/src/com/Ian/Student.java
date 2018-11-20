package com.Ian;

public class Student {
	String a = "Ian";
	int m = 90;
	int e = 70;

	public Student(String a, int m, int e) {

		this.a = a;
		this.m = m;
		this.e = e;

	}

	public Student() {

	}

	public void print() {
		System.out.print(a + "\t" + m + "\t" + e + "\t" + highest() + "\t" + average() + "\t" + grade() + "\t");

		if (average() < 60) {
			System.out.print("FAILED");
		} else {
			System.out.print("PASS");

		}

	}

	public char grade() {
		char grade = 'F';
		switch (average() / 10) {
		case 10:
		case 9:
			grade = 'A';
			break;
		case 8:
			grade = 'B';
			break;
			
		case 7:
			grade = 'C';
			break;
		case 6:
			grade = 'D';
			break;
		default:
			grade = 'F';

		}
		return grade;

	}

	public int highest() {
		if (m > e) {
			return m;
		} else {
			return e;
		}

	}

	public int average() {
		return (m + e) / 2;

	}

}
