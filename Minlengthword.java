package singleDarrays;

import java.util.Scanner;

public class Minlengthword {

	public static void main(String[] args) {
		
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter array size:");
			int a=sc.nextInt();
			String arr[]=new String[a];
			System.out.println("Enter array Elements:");
			for(int i=0;i<arr.length;i++) {
				arr[i]=sc.next();
			}
			String max=arr[0];
			String min=arr[0];
		    for(int i=0;i<arr.length;i++) {
		    	if(max.length()<arr[i].length()) {
		    		max=arr[i];
		    	}
		    	if(min.length()>arr[i].length()) {
		    		min=arr[i];
		    	}
		    }
		   
			System.out.println("Maximum Length Word: "+max);
			System.out.println("Minimum Length Word: "+min);
			sc.close();

		}

	

}
