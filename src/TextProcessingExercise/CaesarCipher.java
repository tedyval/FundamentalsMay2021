package TextProcessingExercise;

import java.util.Scanner;

public class CaesarCipher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        char[] symbols = input.toCharArray();
        StringBuilder encryptedString = new StringBuilder();
        for (char symbol : symbols) {
            char newChar =(char)(symbol + 3);
            encryptedString.append(newChar);
        }
        System.out.println(encryptedString);


    }
}
