package multiDarrays;

import java.util.Arrays;
import java.util.Scanner;

public class Arraysum {

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
		int sum=0;
      for(int i=0;i<rsize;i++) {
    	  for(int j=0;j<csize;j++) {
    		  sum+=arr[i][j];
    	  }
      }
      System.out.println("Sum:"+sum);
		
		
		sc.close();

	}

}
