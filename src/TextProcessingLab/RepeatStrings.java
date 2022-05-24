package TextProcessingLab;

import java.util.Scanner;

public class RepeatStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] strings = input.split("\\s+");
        StringBuilder newString = new StringBuilder();

        for (String str : strings) {
           int length = str.length();
            for (int i = 0; i < length; i++) {
                newString.append(str);
            }
        }

        System.out.println(newString);


    }
}
