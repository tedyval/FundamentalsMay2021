package MethodsExercise;

import java.util.Scanner;

public class SmallestOfThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number1 = Integer.parseInt(scanner.nextLine());
        int number2 = Integer.parseInt(scanner.nextLine());
        int number3 = Integer.parseInt(scanner.nextLine());

        printSmallestNumbers(number1,number2,number3);
    }
    private static void printSmallestNumbers(int number1, int number2, int number3){

        System.out.println(Math.min(Math.min(number1,number2),number3));
    }
}
