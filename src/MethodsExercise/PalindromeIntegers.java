package MethodsExercise;

import java.util.Scanner;

public class PalindromeIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        while(!command.equals("END")){
            String reversedCommand = reverseCommand(command);
            if(reversedCommand.equals(command)){
                System.out.println("true");
            }else{
                System.out.println("false");
            }


            command = scanner.nextLine();
        }



    } static String reverseCommand(String command){
        String reversed = "";
        for (int i = command.length()-1; i >=0 ; i--) {
            char symbol = command.charAt(i);
            reversed += symbol;
        }
        return  reversed;
    }

}
