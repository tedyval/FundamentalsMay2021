package ArrayMore;

import java.util.Arrays;
import java.util.Scanner;

public class Encrypt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int[] resultsInArray = new int[n];
        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();


            int multipliedVowel = 0;
            int dividedConsonant = 0;
            int sum = 0;
            for (int j = 0; j < input.length(); j++) {
                char letter = input.charAt(j);


                if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u' || letter == 'y' ||
                        letter == 'A' || letter == 'E' || letter == 'I' || letter == 'O' || letter == 'U' || letter == 'Y') {
                    multipliedVowel = letter * input.length();
                    sum += multipliedVowel;
                } else {
                    dividedConsonant = letter / input.length();
                    sum += dividedConsonant;
                }
                if (j == input.length() - 1) {
                    resultsInArray[i] = sum;
                }
            }
        }

            Arrays.sort(resultsInArray);
            for (int elem:resultsInArray) {
                System.out.println(elem);
            }








    }
}
