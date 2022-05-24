package MethodsExercise;

import java.util.Scanner;

public class MiddleCharacters2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        printMiddleSymbols(input);
    }
    private static void printMiddleSymbols(String input){
        if(input.length() % 2 == 0){
            int index1 =(input.length() / 2) - 1;
            int index2 =input.length() / 2;
            System.out.printf("%c%c",input.charAt(index1),input.charAt(index2));
        } else{
            int index = input.length() / 2;
            System.out.printf("%c",input.charAt(index));
        }
    }
}
