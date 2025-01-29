package singleDarrays;

import java.util.Scanner;

public class SecondLargest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array size:");
		int a=sc.nextInt();
		int arr[]=new int[a];
		System.out.println("Enter array Elements:");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		int first=arr[0],second=arr[1];
		for(int i=0;i<arr.length;i++) {
			if(first<arr[i]) {
				second=first;
				first=arr[i];
			}
		
			 else if(arr[i]>second && arr[i]!=first) { 
				second=arr[i];
				 }
			
		}
		System.out.println("Second Maximum Element: "+second);
		
		sc.close();

	}

}
