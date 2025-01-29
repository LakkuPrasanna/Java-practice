package patterns;

public class AlphabetY {

	public static void main(String[] args) {
		int row=0,col=4;
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				
				if((i==row && j==col)) {
					System.out.print("*");
					row++;
					col--;
				}
				else if(i==j && (i>=0 && i<2)) {
					System.out.print("*");
				}
				
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}
}
