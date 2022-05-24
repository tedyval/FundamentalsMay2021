package MethodsExercise;

import java.util.Scanner;

public class CharactersInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char first = scanner.nextLine().charAt(0);
        char second = scanner.nextLine().charAt(0);
       printChartsBetween(first,second);
    }
    private static void printChartsBetween(char symbol1, char symbol2){
        int character1 = (int)symbol1;
        int character2 = (int)symbol2;
        if(character1 < character2) {
            for (int i = character1 + 1; i < character2; i++) {
                System.out.printf("%c ", i);
            }
        }else{
            for (int i = character2 + 1; i < character1; i++) {
                System.out.printf("%c ", i);
            }

        }
    }
}
