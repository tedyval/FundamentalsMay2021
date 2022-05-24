package Meyhods;

import java.lang.reflect.Array;
import java.util.Scanner;

public class RepeatString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int repetitions = Integer.parseInt(scanner.nextLine());
        System.out.println(getRepeatedString(input, repetitions));


    }

    private static String getRepeatedString(String input, int repetitions) {
        String[] repeatedString = new String[repetitions];
        for (int i = 0; i < repeatedString.length; i++) {
            repeatedString[i] = input;
        }


        return String.join("",repeatedString);
        }

}
