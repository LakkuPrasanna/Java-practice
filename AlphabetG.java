package patterns;

public class AlphabetG {

	public static void main(String[] args) {
		for(int i=0;i<7;i++) {
			for(int j=0;j<6;j++) {
				if((j==0) || ((i==0 || i==6) && (j>0 && j<5)) || ((j==4) && (i==4 || i==5 || i==3)) || (i==3 && (j==3 || j==5))){
					System.out.print("*");
					
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.print("\n");
		}

}

}
