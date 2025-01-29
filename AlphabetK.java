package patterns;

public class AlphabetK {

	public static void main(String[] args) {
		int row=0,col=4;
		for(int i=0;i<7;i++) {
			for(int j=0;j<5;j++) {
				if(j==0 || (i-j==2 && (j>1))) {
					System.out.print("*");
				}
				else if((j>0) && (i==row && j==col)) {
					System.out.print("*");
					row++;
					col--;
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}
}
