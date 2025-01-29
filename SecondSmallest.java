package singleDarrays;

import java.util.Scanner;

public class SecondSmallest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter array size:");
		int arrSize=sc.nextInt();
		int arr[]=new int[arrSize];
		System.out.println("enter array elements");
		for(int i=0;i<arrSize;i++) {
			arr[i]=sc.nextInt();
		}
		int first_min=arr[0],second_min=arr[1];
		for(int i=0;i<arrSize;i++) {
			if(arr[i]<first_min) {
				 second_min=first_min;
				 first_min=arr[i];
			}
			else if(arr[i]<second_min && arr[i]!=first_min) {
				second_min=arr[i];
			}
		}
		System.out.println("Second minimum: "+second_min);
		sc.close();

	}

}
