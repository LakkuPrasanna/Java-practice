package singleDarrays;

import java.util.Arrays;
import java.util.Scanner;

public class EvenandOddnosInArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array size");
		int arrSize=sc.nextInt();
		int arr[]=new int[arrSize];
		for(int i=0;i<arrSize;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Input: "+Arrays.toString(arr));
		int Esum=0,Osum=0,ecount=0,ocount=0;
		for(int i=0;i<arrSize;i++) {
			if(arr[i]%2==0) {
				ecount++;
				Esum+=arr[i];
			}
			else {
				ocount++;
				Osum+=arr[i];
			}
		}
		System.out.println("even nos:"+ecount+" and their sum: "+Esum);
		System.out.println("odd nos:"+ocount+" and their sum: "+Osum);
		
		sc.close();

	}
}
