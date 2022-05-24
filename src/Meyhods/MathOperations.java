package Meyhods;

import java.util.Scanner;

public class MathOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double firstNumber  = Double.parseDouble(scanner.nextLine());
        String operator = scanner.nextLine();
        double secondNumber  = Double.parseDouble(scanner.nextLine());


        double result = calculate(firstNumber,operator,secondNumber);
        int decimal = (int)result;
        double factorial = result - decimal;
        if(factorial ==0.000){
            System.out.printf("%.0f",result);
        }else {
            System.out.printf("%.2f", result);
        }
    }
    private static double calculate(double number1, String operator, double number2){
        double result = 0;
        switch(operator) {
            case "+":
            result = number1 + number2;
            break;
            case "-":
                result = number1 - number2;
                break;
            case "*":
                result = number1 * number2;
                break;
            case "/":
                result = number1 / number2;
                break;
        }
        return result;
    }
}
