package DataTypesAndVariablesAdditonal;

import java.util.Scanner;

public class FromLefToTheRight2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfLines = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= numberOfLines; i++) {


            String input = scanner.nextLine();
            int index = 0;

            String numAsString1 = "";
            String numAsString2 = "";
            boolean isLong1 = false;
            for (int j = 0; j < input.length(); j++) {
                char symbol = input.charAt(j);
                if (symbol == 32) {
                    index = j;
                    break;
                }
                numAsString1 += symbol;
                if(input.length() >= 10 && (j == 0 && symbol != '1')){
                    isLong1 = true;
                }

            }
            boolean isLong2 = false;
            for (int k = index + 1; k < input.length(); k++) {
                char symbol = input.charAt(k);
                numAsString2 += symbol;
                if(input.length() >= 10 && (k == index + 1 && symbol == '2')){
                    isLong2 = true;
                }
            }




            if( isLong1 || isLong2){
                long num1 = Long.parseLong(numAsString1);
                long num2 = Long.parseLong(numAsString2);
                long num1Current = num1;
                long num2Current = num2;
                int sum = 0;
                int sum1 = 0;
                int digit = 0;
                while(num1Current>0){
                    digit = (int) (num1Current % 10);
                    sum += digit;
                    num1Current = num1Current / 10;
                }

                while(num2Current>0){
                    digit = (int) (num2Current % 10);
                    sum1 += digit;
                    num2Current = num2Current / 10;
                }




                if (num1 > num2) {
                    System.out.println(sum);
                } else {
                    System.out.println(sum1);
                }
            } else{
                int num1 =Integer.parseInt(numAsString1);
                int num2 =Integer.parseInt(numAsString2);
                int num1Current = num1;
                int num2Current = num2;
                int sum = 0;
                int sum1 = 0;
                int digit = 0;
                while(num1Current>0){
                    digit =  (num1Current % 10);
                    sum += digit;
                    num1Current = num1Current / 10;
                }

                while(num2Current>0){
                    digit = (num2Current % 10);
                    sum1 += digit;
                    num2Current = num2Current / 10;
                }




                if (num1 > num2) {
                    System.out.println(sum);
                } else {
                    System.out.println(sum1);
                }

            }









        }

    }


}
