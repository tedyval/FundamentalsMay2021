package DataTypesAndVariablesExer;

import java.util.Scanner;

public class SpiceMustFlow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startingYield = Integer.parseInt(scanner.nextLine());
        int totalSpice = 0;
        int counter = 0;

        while (startingYield >= 100) {
            counter++;
            totalSpice += startingYield;
            startingYield -= 10;
            totalSpice -= 26;

        }

        if (totalSpice >=26) {
            totalSpice -= 26;

        }
        System.out.printf("%d%n", counter);
        System.out.printf("%d", totalSpice);
    }
}
