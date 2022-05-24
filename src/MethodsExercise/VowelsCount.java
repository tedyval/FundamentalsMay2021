package MethodsExercise;

import java.util.Scanner;

public class VowelsCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        printVowelsCount(input);
    }
    private static void printVowelsCount(String text){
        int count = 0;
        for (int i = 0; i <text.length() ; i++) {
            char letter = text.charAt(i);
            if(letter == 'a' || letter == 'o'|| letter == 'e'|| letter == 'i' || letter == 'u'|| letter == 'y'
            || letter == 'A' || letter == 'O'|| letter == 'E'|| letter == 'I' || letter == 'U'|| letter == 'Y'){
                count++;
            }
        }
        System.out.println(count);
    }
}
