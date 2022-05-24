package ArrayLab;

import java.util.Scanner;

public class NumbersInReverseOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countOfNumbers = Integer.parseInt(scanner.nextLine());

        String[] numbersArray = new String[countOfNumbers];
        for (int i = 0; i < numbersArray.length; i++) {
            numbersArray[i] = scanner.nextLine();
        }

        for (int i = numbersArray.length - 1; i >= 0 ; i--) {
            System.out.print(numbersArray[i] + " ");

        }








    }
}
