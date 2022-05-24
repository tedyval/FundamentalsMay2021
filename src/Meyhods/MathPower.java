package Meyhods;

import java.util.Scanner;

public class MathPower {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double number = Double.parseDouble(scanner.nextLine());
        int power = Integer.parseInt(scanner.nextLine());
        double result = getPoweredNumber(number,power);
        int decimal = (int)result;
        double fractional = Math.abs(result) - Math.abs(decimal);
        if(fractional == 0.000){
            System.out.printf("%.0f",result);
        }else{
            System.out.printf("%.3f",result);

        }

    }
    private static Double getPoweredNumber(double number, int power){
        double result = Math.pow(number,power);

        return result;
    }
}
