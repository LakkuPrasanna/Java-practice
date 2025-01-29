package multiDarrays;

import java.util.Scanner;

public class CommonElements {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the rows of first matrix");
		int m=sc.nextInt();
		System.out.println("Enter the columns of first matrix");
		int n=sc.nextInt();
		System.out.println("Enter the rows of second matrix");
		int p=sc.nextInt();
		System.out.println("Enter the columns of second matrix");
		int q=sc.nextInt();
		
		int a[][]=new int[m][n];
		System.out.println("Enter the elements of first matrix");
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				a[i][j]=sc.nextInt();
			}
		}
		int b[][]=new int[p][q];
		System.out.println("enter the elements of second matrix");
		for(int i=0;i<p;i++) {
			for(int j=0;j<q;j++) {
				b[i][j]=sc.nextInt();
			}
		}
		System.out.println("First Matrix:");
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("Seocnd Matrix:");
		for(int i=0;i<p;i++) {
			for(int j=0;j<q;j++) {
				System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("Common elements:");
		boolean isFound=false;
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				int target_element=a[i][j];
				for(int k=0;k<p;k++) {
					isFound=false;
					for(int l=0;l<q;l++) {
						if(target_element==b[k][l]) {
							System.out.print(b[k][l]+" ");
							isFound=true;
							break;
						}
					}
					if(isFound)
						break;
				}
			}
		}
		
        sc.close();
	}

}
