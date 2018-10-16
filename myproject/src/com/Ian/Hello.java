package com.Ian;

public class Hello {

	public static void main(String[] args) {
		Student stu = new Student("Ian", 70, 90);
		stu.print();
		System.out.println(stu.a + "\t" + stu.m + "\t" + stu.e + "\t" + (stu.m + stu.e) / 2);
		System.out.println(50 <= 30);
		String r1 = "pig";
		String r2 = "pig";
		System.out.println(r1 == r2);

		String w1 = new String("orz");
		String w2 = new String("orz");
		System.out.println(w1.equals(w2));
		System.out.println(w1 == w2);

		// int age=-100;
		// age=-200;
		// short bytes=8000;
		// age=bytes++;
		// float height=20000.98765f;
		// float weight=600f;
		// System.out.println("\"age\nbytes\nheight\"");
		// System.out.println(age);
		// System.out.println(bytes);
		// System.out.println(height);
		// System.out.println("Hello world");
		// float weight=600f;
		// float height=20000.98765f;
		// float bmi=weight/(height*height);
		// System.out.println(bmi);

	}

}
