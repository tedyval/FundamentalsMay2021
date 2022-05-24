package Mid;

import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int students = Integer.parseInt(scanner.nextLine());
        double flourPrice = Double.parseDouble(scanner.nextLine());
        double eggPrice = Double.parseDouble(scanner.nextLine());
        double apronPrice = Double.parseDouble(scanner.nextLine());

        double total = students * flourPrice + 10 * eggPrice * students + Math.ceil(students * 1.2) * apronPrice;


        int count = students / 5;
        total -= flourPrice * count;


        if (total <= budget) {
            System.out.printf("Items purchased for %.2f$.", total);
        } else {
            System.out.printf("%.2f$ more needed.", Math.abs(total - budget));
        }


    }
}
