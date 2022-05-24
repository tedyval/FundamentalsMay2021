package MapExercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CountCharsInAString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Map<Character, Integer> charCount = new LinkedHashMap<>();
        for (int i = 0; i < input.length() ; i++) {

            char currentChar = input.charAt(i);
            if(currentChar != ' ') {
                if (!charCount.containsKey(currentChar)) {
                    charCount.put(currentChar, 1);
                } else {
                    int counter = charCount.get(currentChar);
                    charCount.put(currentChar, counter + 1);
                }
            }
        }

        charCount.forEach((key, value) -> System.out.println(key + " -> " + value));








    }
}
