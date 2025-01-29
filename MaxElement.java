package singleDarrays;

import java.util.Scanner;

public class MaxElement {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array size:");
		int a=sc.nextInt();
		int arr[]=new int[a];
		System.out.println("Enter array Elements:");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		int max=arr[0],min=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
			if(min>arr[i]){
				min=arr[i];
			}
		}
		System.out.println("Maximum Element: "+max);
		System.out.println("Manimum Element: "+min);
		sc.close();

	}

}
