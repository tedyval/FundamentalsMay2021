package DataTypesAndVariablesExer;

import java.util.Scanner;

public class TriplesOfLatinLetters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num  = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i <num  ; i++) {
            for (int j = 0; j < num ; j++) {
                for (int k = 0; k < num; k++) {
                    char firstLetter = (char)('a' + i);
                    char secondLetter = (char)('a' + j);
                    char thirdLetter = (char)('a' + k);
                    System.out.printf("%c%c%c%n",firstLetter,secondLetter,thirdLetter);

                }

            }


        }
    }
}
