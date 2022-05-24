package TextProcessingLab;

import java.util.Scanner;

public class TextFilter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String bannedInput = scanner.nextLine();
        String[] bannedWords = bannedInput.split(", ");
        String text = scanner.nextLine();
        for (int i = 0; i < bannedWords.length; i++) {
            String replacedWord = bannedWords[i];
            int lengthReplacedWord = replacedWord.length();
            String stars = "*".repeat(lengthReplacedWord);
            text = text.replace(replacedWord,stars);
        }

        System.out.println(text);






    }
}
