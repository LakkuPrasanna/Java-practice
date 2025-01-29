package singleDarrays;

import java.util.Arrays;
import java.util.Scanner;

public class Arraysum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array size");
		int arrSize=sc.nextInt();
		int arr[]=new int[arrSize];
		for(int i=0;i<arrSize;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Input: "+Arrays.toString(arr));
		int sum=0;
		for(int i=0;i<arrSize;i++) {
			sum+=arr[i];
		}
		System.out.println("sum: "+sum);
		System.out.println("average: "+sum/arr.length);
		sc.close();

	}

}
