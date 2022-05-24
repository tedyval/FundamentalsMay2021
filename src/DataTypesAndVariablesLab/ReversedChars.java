package DataTypesAndVariablesLab;

import java.util.Scanner;

public class ReversedChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String result = "";
        for (int i = 1; i <=3 ; i++) {
            char symbol = scanner.nextLine().charAt(0);
            result += symbol;
        }

        String reversedTextWithSpaces = "";
        for (int i = result.length() - 1; i >= 0 ; i--) {
            char symbol = result.charAt(i);
            reversedTextWithSpaces += symbol + " ";

        }
        System.out.println(reversedTextWithSpaces);

    }
}
