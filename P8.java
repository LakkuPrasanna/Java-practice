package numberpatterns;

import java.util.Scanner;

public class P8{
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter rows:");
		int n=sc.nextInt();
		char ch='A';
		for(int i=1;i<=n;i++) {
			//ch='A';
			for(int j=1;j<=i;j++) {
				System.out.print(ch+" ");
				ch+=1;
			}System.out.println();
			
		}
		sc.close();
	}
}
