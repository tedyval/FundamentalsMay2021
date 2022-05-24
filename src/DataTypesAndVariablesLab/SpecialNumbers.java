package DataTypesAndVariablesLab;

import java.util.Scanner;

public class SpecialNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int num = Integer.parseInt(scanner.nextLine());



        for (int i = 1; i <= num; i++) {

                int num1 = i;

                int sum = 0;
                while (num1 > 0) {

                    int digit = num1 % 10;
                    sum += digit;
                    num1 = num1 / 10;
                }



            if (sum == 5 || sum == 7 || sum == 14) {
                System.out.printf("%d -> True%n", i);
            } else {
                System.out.printf("%d -> False%n", i);
            }

        }


    }

}
