package strings;

import java.util.Arrays;

public class StringMethods {

	public static void main(String[] args) {
		String s1="hello";
		String s2=new String("hello");
		String s3="hello";
		//String s5;
		String s4=new String(" HEl#lo i# am p#ushk#ar ");
		System.out.println(s1==s2);
		System.out.println(s1==s3);
		System.out.println(s2==s4);
		System.out.println(s1==s4);
		System.out.println(s1.equals(s4));
		//startsWith
		System.out.println(s1.startsWith("e"));
		System.out.println(s2.endsWith("o"));
		System.out.println(s3.contains("u"));
		System.out.println(s1.equals(s4));
		System.out.println(s1.equalsIgnoreCase(s4));
		System.out.println(s1.length());
		System.out.println(s4);
		System.out.println(s4.trim());
		System.out.println(s1.toCharArray());
		System.out.println(s1.toString());
		System.out.println(s3.toUpperCase());
		System.out.println(s4.toLowerCase());
		System.out.println(s1.indexOf("l"));
		System.out.println(s1.lastIndexOf("l"));
		System.out.println(s2.substring(2));
		System.out.println(s2.substring(2,4));
		System.out.println(Arrays.toString(s4.split("#")));
		System.out.println(Arrays.toString(s4.split(" ")));
		System.out.println(s1.charAt(4));
		System.out.println(s1.replace("l", "p"));
		System.out.println(s1.replaceAll("l","h"));
		String k="12345";
		System.out.println(Integer.valueOf(k));
		int i=20;
		System.out.println(String.valueOf(i));
		//System.out.println();
		String s5=" ";
		String s6="";
		System.out.println(s5.isBlank());
		System.out.println(s5.isEmpty());
		System.out.println(s6.isEmpty());
		System.out.println(s6.isBlank());
		
	}

}
