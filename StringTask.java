package strings;

import java.util.Scanner;

public class StringTask {
    
    public static String cleanString(String inputString) {
       
        inputString = inputString.replaceAll("\\d", "");
        inputString = inputString.replaceAll("[^a-zA-Z\\s]", " ");
        return inputString;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String inputString = scanner.nextLine();
        String cleanedString = cleanString(inputString);
        System.out.println("Given: " + inputString);
        System.out.println("Resultant: " + cleanedString);
        scanner.close();
    }
}

