package patterns;

public class AlphabetA {

	public static void main(String[] args) {
		for(int i=0;i<8;i++) {
			for(int j=0;j<7;j++) {
				if(((j==0||j==6) && i!=0) || ((i==0 || i==4) && (j>0 && j<6)) ){
					System.out.print("*");
					
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.print("\n");
		}

}}
