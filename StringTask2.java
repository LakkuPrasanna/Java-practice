package strings;

import java.util.Scanner;

public class StringTask2 {
    
    public static String transformString(String inputString) {
       
        if (inputString.length() % 2 != 0) {
            int mid = inputString.length() / 2;
            String firstHalf = inputString.substring(0, mid).toUpperCase();
            String secondHalf = inputString.substring(mid).toLowerCase();
            return firstHalf + secondHalf;
        } else {
            return inputString;
        }
    }

    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String inputString = scanner.nextLine();
        String transformedString = transformString(inputString);
        System.out.println("Original: " + inputString);
        System.out.println("Transformed: " + transformedString);
        scanner.close();
    }
}

