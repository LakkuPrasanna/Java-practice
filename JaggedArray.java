package multiDarrays;

import java.util.Arrays;
import java.util.Scanner;

public class JaggedArray {

	public static void main(String[] args) {
		Scanner  sc=new Scanner(System.in);
		System.out.println("Enter no.of rows");
		int r=sc.nextInt();
		int arr[][]=new int[r][];
		for(int i=0;i<r;i++) {
		System.out.println("Enter no.of columns in row"+i);
		int c=sc.nextInt();
		arr[i]=new int[c];
		for(int j=0;j<c;j++) {
			arr[i][j]=sc.nextInt();
		}
		}
		for(int i=0;i<r;i++) {
		System.out.println(Arrays.toString(arr[i]));
		}
		
		sc.close();

	}

}
