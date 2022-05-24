package TextProcessingLab;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        while (!input.equals("end")){
            char[] symbols = input.toCharArray();
            StringBuilder str = new StringBuilder();
            for (int i = symbols.length-1; i >=0 ; i--) {
                str.append(symbols[i]);
            }
            System.out.printf("%s = %s%n",input,str);

            input = scanner.nextLine();
        }










    }
}
