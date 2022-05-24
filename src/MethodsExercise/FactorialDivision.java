package MethodsExercise;

import java.util.Scanner;

public class FactorialDivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNum = Integer.parseInt(scanner.nextLine());
        int secondNum = Integer.parseInt(scanner.nextLine());

        long factorialFirst = getFactorial(firstNum);
        long factorialSecond = getFactorial(secondNum);
        System.out.printf("%.2f",factorialFirst * 1.0 /factorialSecond);

    }
    static long getFactorial(int num){
        long factorial =1;
        if(num>=1) {
            for (int i = 1; i <= num; i++) {
                factorial *= i;
            }
            return  factorial;
        }
        return  factorial;
    }
}
