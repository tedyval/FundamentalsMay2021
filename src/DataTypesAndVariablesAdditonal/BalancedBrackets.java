package DataTypesAndVariablesAdditonal;

import java.util.Scanner;

public class BalancedBrackets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        int counter = 0;
        int counter1 = 0;
        int counter2 = 0;
        boolean isBalanced = true;
        for (int i = 1; i <= n; i++) {
            String input = scanner.nextLine();
            counter++;
            if(counter == 4){
                counter =0;
            }
            if (input.equals(")")) {
                counter1++;
            } else if (input.equals("(")) {
                counter2++;
            }


            if (counter1 == 1 && counter == 1) {
                isBalanced = false;
                break;
            } else if (counter2 == 2 && counter1 == 1 && counter == 3) {
                isBalanced = true;
            } else if (counter2 == 2 && counter1 == 0) {
                isBalanced = false;
                break;
            } else if (counter2 == 1 && counter1 == 2 && counter == 3) {
                isBalanced = false;
            }


        }
        if (isBalanced = true) {
            System.out.println("BALANCED");
        } else {
            System.out.println("UNBALANCED");
        }

    }
}
