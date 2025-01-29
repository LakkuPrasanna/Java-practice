package singleDarrays;

import java.util.Arrays;
import java.util.Scanner;

public class MergingTwoArrays {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array1 size");
		int arrSize1=sc.nextInt();
		int arr1[]=new int[arrSize1];
		for(int i=0;i<arrSize1;i++) {
			arr1[i]=sc.nextInt();
		}
		System.out.println("Input: "+Arrays.toString(arr1));
		
		System.out.println("Enter array2 size");
		int arrSize2=sc.nextInt();
		int arr2[]=new int[arrSize2];
		for(int i=0;i<arrSize2;i++) {
			arr2[i]=sc.nextInt();
		}
		System.out.println("Input: "+Arrays.toString(arr2));
		
		int arrSize3=arrSize1+arrSize2;
		int arr3[]=new int[arrSize3];
		for(int i=0;i<arrSize1;i++) {
			arr3[i]=arr1[i];
		}
		for(int i=0;i<arrSize2;i++) {
			arr3[arrSize1+i]=arr2[i];
		}
		System.out.println("Merged Array is: "+Arrays.toString(arr3));
		
		sc.close();

	}

}
