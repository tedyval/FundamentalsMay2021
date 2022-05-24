package SyntaxLab;

import java.util.Scanner;

public class SumOfOddNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num  = Integer.parseInt(scanner.nextLine());
        int counter = 0;
        int sum = 0;
        while(num > 0){
            counter++;
            int oddNumber = 2 * counter - 1;
            System.out.println(oddNumber);
            sum += oddNumber;
            num--;
        }

        System.out.printf("Sum: %d",sum);








    }

}
