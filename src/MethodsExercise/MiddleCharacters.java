package MethodsExercise;

import java.util.Arrays;
import java.util.Scanner;

public class MiddleCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        char[] middleCharacter = new char[2];
        middleCharacter = Arrays.copyOf(getMiddleCharacter(input),getMiddleCharacter(input).length) ;
        for (char elem : middleCharacter) {
            System.out.print(elem);
        }

    }

    private static char[] getMiddleCharacter(String input) {
        char[] middleSymbols = new char[2];
        for (int i = 0; i <(input.length()/2)+2 ; i++) {
            if(input.length() % 2== 0) {
                middleSymbols[0] = input.charAt(input.length()/2-1);
                middleSymbols[1] = input.charAt(input.length()/2);
            }else{
                middleSymbols[0] =input.charAt(input.length()/2);
            }
        }
        return middleSymbols;
    }
}
