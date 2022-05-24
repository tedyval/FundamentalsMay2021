package TextProcessingExercise;

import java.util.Scanner;

public class ReplaceRepeatingChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


       String input = scanner.nextLine();
       StringBuilder newInput = new StringBuilder(input);
        for (int i = 0; i <= newInput.length()-2; i++) {
            if(newInput.charAt(i) == newInput.charAt(i +1)){
                newInput.deleteCharAt(i+1);
                   i--;
            }

        }
        System.out.println(newInput);



    }
}
