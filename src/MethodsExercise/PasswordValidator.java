package MethodsExercise;

import java.util.Scanner;

public class PasswordValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password = scanner.nextLine();
        boolean isValidLength =  validateLength(password);
        if(!isValidLength){
            System.out.println("Password must be between 6 and 10 characters");
        }

        boolean isValidContain = validateContain(password);
        if(!isValidContain){
            System.out.println("Password must consist only of letters and digits");
        }

        boolean isValidCountNumber = validateCountOfNumber(password);
        if(!isValidCountNumber){
            System.out.println("Password must have at least 2 digits");
        }

        if((isValidLength) && (isValidContain) && (isValidCountNumber)){
            System.out.println("Password is valid");
        }


    }
    private static boolean validateLength(String text){

        if(text.length()>=6 && text.length()<=10){
            return true;

        }else{
            return false;
        }
    }

    private static boolean validateContain(String text){
        int count = 0;

        for (int i = 0; i <text.length() ; i++) {
            char symbol = text.charAt(i);
            if(!Character.isLetterOrDigit(symbol)){
               count++;
            }
        }
        if(count == 0){
            return true;

        }else{
            return false;
        }


    }
    private static boolean validateCountOfNumber(String text){
        int count = 0;

        for (int i = 0; i <text.length() ; i++) {
            char symbol = text.charAt(i);
            if(Character.isDigit(symbol)){
                count++;
            }
        }
        if(count >= 2){
            return true;

        }else{
            return false;
        }



    }
}
