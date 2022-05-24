package TextProcessingExercise;

import java.util.Scanner;

public class LettersChangeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] substrings = input.split("\\s+");
        double result = 0;
        double sum = 0;
        for (int i = 0; i < substrings.length; i++) {
            String numAsStr = substrings[i].substring(1,substrings[i].length()-1);
            int number = Integer.parseInt(numAsStr);
            int position = 0;
            if(Character.isUpperCase(substrings[i].charAt(0))){
                position = (int)substrings[i].charAt(0) -64;
               result = number * 1.0 / position;
            }else{
                position = (int)substrings[i].charAt(0) -96;
             result = number * 1.0 * position;
            }


            if(Character.isUpperCase(substrings[i].charAt(substrings[i].length()-1))){
                position = (int)substrings[i].charAt(substrings[i].length()-1) -64;
                result -= position;
            }else{
                position = (int)substrings[i].charAt(substrings[i].length()-1) -96;
                result += position;
            }

            sum += result;

        }

        System.out.printf("%.2f",sum);



    }
}
