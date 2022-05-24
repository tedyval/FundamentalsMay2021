package TextProcessingLab;

import java.sql.SQLOutput;
import java.util.Scanner;

public class DigitsLetterOther {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        char[] symbols = input.toCharArray();
        StringBuilder numbers = new StringBuilder();
        StringBuilder letters = new StringBuilder();
        StringBuilder others = new StringBuilder();
        for (char symbol : symbols) {
            if(Character.isDigit(symbol)){
                numbers.append(symbol);
            }else if(Character.isLetter(symbol)){
                letters.append(symbol);
            }else{
                others.append(symbol);
            }
        }

        System.out.println(numbers);
        System.out.println(letters);
        System.out.println(others);


    }
}
