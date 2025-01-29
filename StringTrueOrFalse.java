package strings;

import java.util.Scanner;

public class StringTrueOrFalse {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int t=sc.nextInt();
	char ch[]=new char[t];
	for(int i=0;i<t;i++) {
		ch[i]=sc.next().charAt(0);
	}
	//System.out.println(s[i]);
		for(int i=0;i<t;i++) {
			if(Character.isUpperCase(ch[i]))
				System.out.println("True");
			else
				System.out.println("False");
		}
	
	sc.close();

	}

}
