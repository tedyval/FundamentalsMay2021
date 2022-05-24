package DataTypesAndVariablesAdditonal;

import java.util.Scanner;

public class FloatingEquality {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double a = Double.parseDouble(scanner.nextLine());
        double b = Double.parseDouble(scanner.nextLine());

        double result = Math.abs(a) - Math.abs(b);
        String message = "";
        if(Math.abs(result) <= 0.000001){
            message = "True";
        } else{
            message = "False";
        }

        System.out.println(message);

    }
}
