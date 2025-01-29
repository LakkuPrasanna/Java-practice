package strings;

import java.util.*;

public class Task3{

    public static void findSecondAndFourthGreatest(List<Integer> numbers) {
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;
        int fourth = Integer.MIN_VALUE;
        for (int num : numbers) {
            if (num > first) {
                fourth = third;
                third = second;
                second = first;
                first = num;
            } else if (num > second) {
                fourth = third;
                third = second;
                second = num;
            } else if (num > third) {
                fourth = third;
                third = num;
            } else if (num > fourth) {
                fourth = num;
            }
        }
        System.out.println("Second Greatest Number: " + second);
        System.out.println("Fourth Greatest Number: " + fourth);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of elements in the list: ");
        int n = scanner.nextInt();
        if (n < 4) {
            System.out.println("Error: List must contain at least 4 elements.");
        }
        else {
        List<Integer> numbers = new ArrayList<>();
        System.out.println("Enter the numbers: ");
        for (int i = 0; i < n; i++) {
            numbers.add(scanner.nextInt());
        }
        findSecondAndFourthGreatest(numbers);
        }
        scanner.close();
    }
}

