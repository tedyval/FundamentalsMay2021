package Meyhods;

import java.util.Scanner;

public class MultiplyEvensByOdds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Math.abs(Integer.parseInt(scanner.nextLine()));

        int result = getEvenSumMultiplyByOddSum(number);
        System.out.println(result);

    }
    private  static int getEvenSumMultiplyByOddSum(int number){
        int sumEvenDigit = getEvenSum(number);
        int sumOddDigit = getOddSum(number);
        return sumEvenDigit * sumOddDigit;
    }

    private static int getEvenSum(int number) {
        int sumEvenDigit = 0;

        while (number > 0) {
            int digit = number % 10;
            if (digit % 2 == 0) {
                sumEvenDigit += digit;
            }
            number = number / 10;
        }
        return sumEvenDigit;
    }
    private static int getOddSum(int number) {
        int sumOddDigit = 0;

        while (number > 0) {
            int digit = number % 10;
            if (digit % 2 != 0) {
                sumOddDigit += digit;
            }
            number = number / 10;
        }
        return sumOddDigit;
    }


}


