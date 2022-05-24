package TextProcessingExercise;

import java.util.Scanner;

public class CharacterMultiplier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] strings = scanner.nextLine().split("\\s+");
        String first = strings[0];
        String second = strings[1];
        char[] symbols1 = first.toCharArray();
        char[] symbols2 = second.toCharArray();
        int restLength = Math.abs(first.length() - second.length());


        int maxLength = Math.max(symbols1.length, symbols2.length);
        int minLength = Math.min(symbols1.length, symbols2.length);
        int sum = 0;
        for (int i = 0; i < maxLength; i++) {
            int result = 0;
            for (int j = 0; j < minLength; j++) {
                result = (char) symbols1[i] * (char) symbols2[i];
                sum += result;
                i += 1;
            }
            break;
        }
        if (symbols1.length == maxLength) {
            for (int j = symbols1.length - restLength; j < symbols1.length; j++) {
                sum += symbols1[j];
            }
        } else if (symbols2.length == maxLength) {
            for (int j = symbols2.length - restLength; j < symbols2.length; j++) {
                sum += symbols2[j];
            }
        }

        System.out.println(sum);


    }
}
