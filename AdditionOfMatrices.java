package multiDarrays;

import java.util.Arrays;
import java.util.Scanner;

public class AdditionOfMatrices {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int rsize=sc.nextInt();
		int csize=sc.nextInt();
		int arr[][]=new int[rsize][csize];
		for(int i=0;i<rsize;i++) {
			for(int j=0;j<csize;j++) {
				arr[i][j]=sc.nextInt();
			}
			}
		for(int i=0;i<rsize;i++) {
			System.out.println(Arrays.toString(arr[i]));
		}
		
		int rsize2=sc.nextInt();
		int csize2=sc.nextInt();
		int arr2[][]=new int[rsize2][csize2];
		for(int i=0;i<rsize2;i++) {
			for(int j=0;j<csize2;j++) {
				arr2[i][j]=sc.nextInt();
			}
			}
		for(int i=0;i<rsize2;i++) {
			for(int j=0;j<csize2;j++) {
				System.out.print(arr2[i][j]+" ");
			}
			System.out.println();
			
		}
		if(rsize==rsize2 && csize==csize2) {
		int arr3[][]=new int[rsize][csize];
		  for(int i=0;i<rsize;i++) {
			  for(int j=0;j<csize;j++) {
				  arr3[i][j]=arr[i][j]+arr2[i][j];
			  }
		  }
		  
		  for(int i=0;i<rsize;i++) {
			  for(int j=0;j<csize;j++) {
				  System.out.print(arr3[i][j]+" ");
			  }
			  System.out.println();
		  }
		}
		else {
			System.out.println("Not possible");
		}
		
		
		sc.close();



	}

}
