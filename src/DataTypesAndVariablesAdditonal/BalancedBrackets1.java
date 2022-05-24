package DataTypesAndVariablesAdditonal;

import java.util.Scanner;

public class BalancedBrackets1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        int counter = 0;
        int counter1 = 0;
        boolean notValid = false;


        boolean isBalanced = true;
        for (int i = 1; i <= n; i++) {
            String input = scanner.nextLine();


            if (input.equals(")")) {
                counter++;

                if (counter % 2 != 0) {
                    isBalanced = false;
                    break;
                }


            } else if (input.equals("(")) {
                counter++;
                if (counter % 2 == 0) {
                    isBalanced = false;
                    break;
                }
            }

        }
        if (isBalanced) {
            System.out.println("BALANCED");
        } else {
            System.out.println("UNBALANCED");
        }


    }
}
