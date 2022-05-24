package DataTypesAndVariablesExer;

import java.util.Scanner;

public class IntegerOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());
        secondNumber += firstNumber;
        int thirdNumber = Integer.parseInt(scanner.nextLine());
        secondNumber /= thirdNumber;
        int forthNumber = Integer.parseInt(scanner.nextLine());
        secondNumber *= forthNumber;

        System.out.println(secondNumber);

    }
}
