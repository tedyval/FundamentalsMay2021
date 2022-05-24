package Meyhods;

import java.util.Scanner;

public class Calculatins {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String mathematicalOperation = scanner.nextLine();
        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());
        printResultOfOperation(mathematicalOperation,firstNumber,secondNumber);

    }
    private static void printResultOfOperation(String text, int number1,int number2){
        int result = 0;
        switch(text){
            case "add":
                result = number1 + number2;
                break;
            case "subtract":
                result = number1 - number2;
                break;
            case "multiply":
                result = number1 * number2;
                break;
            case "divide":
                result = number1 / number2;
                break;
        }
        System.out.println(result);
    }
}
