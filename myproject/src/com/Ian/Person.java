package com.Ian;

public class Person {
	float weight;
	float height;

	public Person(float weight, float height) {
		weight = weight;
		height = height;
		this.weight = weight;
		this.height = height;

	}

	public void hello() {
		System.out.println("Hello");

	}

	public float bmi() {
		float bmi = weight / (height * height);
		return bmi;
	}

}
