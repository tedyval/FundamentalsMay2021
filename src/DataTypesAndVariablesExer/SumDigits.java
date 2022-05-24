package DataTypesAndVariablesExer;

import java.util.Scanner;

public class SumDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());
        int num1 = num;
        int sum = 0;
        int digit = 0;
        while(num1 > 0){
            digit = num1 % 10;
            sum += digit;
            num1 = num1 / 10;
        }

        System.out.println(sum);
    }
}
