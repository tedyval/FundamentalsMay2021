package DataTypesAndVariablesLab;

import java.util.Scanner;

public class CharsToString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String result = "";
        for (int i = 1; i <=3 ; i++) {
            char symbol = scanner.nextLine().charAt(0);
            result += symbol;
        }

        System.out.println(result);


    }
}
