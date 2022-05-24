package MethodsExercise;

import java.util.Arrays;
import java.util.Scanner;

public class TopNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        printTopNumbers(n);


    }

    private static void printTopNumbers(int n) {
        int index = -1;

        for (int i = 10; i <= n; i++) {
            index = i;
            boolean isDiv8 = false;
            boolean hasOddNumber = false;
            int sum = 0;
            int digit = -1;
            int count = 0;
            while (index> 0) {
                digit = index % 10;
                sum += digit;

                if (digit == 1 || digit == 3 || digit == 5 || digit == 7 || digit == 9) {
                    count++;
                    if (count >= 1) {
                        hasOddNumber = true;
                    }
                }
                index = index / 10;
            }
            if (sum % 8 == 0) {
                isDiv8 = true;
            }
            if (isDiv8 == true && hasOddNumber == true) {
                System.out.println(i);
            }
        }

    }

}
