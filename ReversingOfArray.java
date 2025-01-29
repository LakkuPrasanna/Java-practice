package singleDarrays;

import java.util.Arrays;
import java.util.Scanner;

public class ReversingOfArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array size");
		int arrSize=sc.nextInt();
		String arr[]=new String[arrSize];
		for(int i=0;i<arrSize;i++) {
			arr[i]=sc.next();
		}
		System.out.println("Input: "+Arrays.toString(arr));
		String revarr[]=new String[arrSize];
		for(int i=0;i<arr.length;i++) {
	        revarr[arr.length-i-1]=arr[i];
		}
		System.out.println("Reversed array: "+Arrays.toString(revarr));
		sc.close();

	}
}
