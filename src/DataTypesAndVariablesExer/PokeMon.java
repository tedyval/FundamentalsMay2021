package DataTypesAndVariablesExer;

import java.util.Scanner;

public class PokeMon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int m = Integer.parseInt(scanner.nextLine());
        int y = Integer.parseInt(scanner.nextLine());
        int count = 0;

        int leftN = n;
        while(leftN >= m) {
            leftN -= m;
            count++;
            if ((leftN == 0.50 * n) && leftN >= y) {
                leftN = leftN  / y;
            }
        }



        System.out.println(leftN);
        System.out.println(count);







    }
}
