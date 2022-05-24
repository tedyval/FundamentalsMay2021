package ArrayLab;

import java.util.Scanner;

public class ReverseArrayOfStrigs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String[] stringsArray = input.split(" ");
        String[] reversedArray = new String[stringsArray.length];
        String temp = "";
        for (int i = 0; i < reversedArray.length ; i++) {
            temp = stringsArray[i];
            reversedArray[i] = stringsArray[stringsArray.length - 1 - i];
            stringsArray[stringsArray.length - 1 - i] = temp;
            System.out.print(reversedArray[i] + " ");
        }

    }
}
