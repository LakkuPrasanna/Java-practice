package problems;

import java.util.Scanner;
import java.util.*;
public class SmithNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ArrayList<Integer> primeslist=new ArrayList<>();
		System.out.println("Enter a Number:");
		int num=sc.nextInt();
		int n1=num;
		int d=0,sum=0;
		while(num>0) {
			d=num%10;
			sum+=d;
			num=num/10;
		}
		int temp=sum;
		while(sum%2==0) {
			System.out.print(2+" ");
			primeslist.add(2);
			sum=sum/2;
		}
		for(int i=3;i<=(int) Math.sqrt(sum);i++) {
			while(sum%i==0) {
				System.out.print(i+" ");
				primeslist.add(i);
				sum=sum/i;
			}
		}
		if(sum>2) {
			System.out.println(sum);
			primeslist.add(sum);
		}
		
		int primesum=0;
		for(int i=0;i<primeslist.size();i++) {
			primesum+=primeslist.get(i);
		}
		System.out.println(primesum);
		if(primesum==temp) {
			System.out.println(n1+" is a smith Number.");
		}
		else {
			System.out.println(n1+" is not a smith Number.");
		}
		
		sc.close();

	}

}
