package com.Ian;

public class StringTest {

	public static void main(String[] args) {
		String w = "abcd";
		String w2 = "abcd";
		// System.out.println(w==w2);
		String r1 = new String("abcde");
		String r2 = new String("abcde");
		// System.out.println(r1==r2);
		String s = "pneumonoultramicroscopicsilicovolcanoconiosis";
		String p = "Jack Tom Eric Jane Hank Tom Ben";
		//          0123456789
		// System.out.println(s.substring(20,35));

		String m = "";
		for (int i = s.length() -1; i >= 0; i--) {
			m = m + s.charAt(i);

// 		    System.out.print(s.charAt(i));
			
		}
		    System.out.println(p.indexOf("k"));
		    System.out.println(p.lastIndexOf("k"));
		    String name = "Tom";
		    int index = p.indexOf(name);
		    System.out.println(p.substring(0,index)+"boss"+p.substring(index+name.length()));
		    int n = Integer.parseInt("100");
		    n++;
		    float f = Float.parseFloat("99.88");
		    System.out.println(n+" "+f);

	} 

}
