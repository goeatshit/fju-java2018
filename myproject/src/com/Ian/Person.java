package com.Ian;

public class Person {
	float math;
	float english;

	public void hello() {
		System.out.println("Hello");

	}

	public float average() {
		float average = (math + english) / 2;
		return average;
	}

}
