package MethodsExercise;

import java.util.Scanner;

public class AddAndSubtract {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());
        int thirdNumber = Integer.parseInt(scanner.nextLine());

        int result = getSubtractedResult(firstNumber,secondNumber,thirdNumber);
        System.out.println(result);

    }


    private  static int getSubtractedResult(int number1,int number2, int third){
        return getSum(number1,number2) -third;
    }
    private static int getSum(int number1,int number2){
        return  number1 + number2;
    }

}
