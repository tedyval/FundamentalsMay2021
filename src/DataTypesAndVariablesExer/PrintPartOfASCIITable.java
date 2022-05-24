package DataTypesAndVariablesExer;

import java.util.Scanner;

public class PrintPartOfASCIITable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

         int first = Integer.parseInt(scanner.nextLine());
         int second = Integer.parseInt(scanner.nextLine());

        for (int i = first; i <= second ; i++) {

            System.out.printf("%c ",i);
            
        }
    }
}
