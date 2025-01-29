package multiDarrays;

import java.util.Scanner;

public class TransposeOfMatrix {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the rows of first matrix");
		int m=sc.nextInt();
		System.out.println("Enter the columns of first matrix");
		int n=sc.nextInt();
		int a[][]=new int[m][n];
		System.out.println("Enter the elements of first matrix");
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				a[i][j]=sc.nextInt();
			}
		}
		int transpose[][]=new int[m][n];
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				transpose[i][j]=a[j][i];
			}
		}
		System.out.println("Input:");
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(a[i][j]+" ");;
			}System.out.println();
		}
		
		System.out.println("Transpose:");
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(transpose[i][j]+" ");;
			}System.out.println();
		}
        sc.close();
	}

}
