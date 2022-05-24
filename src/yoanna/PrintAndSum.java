package yoanna;

import java.util.Scanner;

public class PrintAndSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int startingNumber = Integer.parseInt(scanner.nextLine());
        int endingNumber = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        for (int i = startingNumber; i <= endingNumber; i++) {
            System.out.print(i + " ");
            sum += i;
        }
        System.out.println();
        System.out.println("Sum: " + sum);
    }
}
