package DataTypesAndVariablesExer;

import java.util.Scanner;

public class Elevator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfPerson = Integer.parseInt(scanner.nextLine());
        int capacityOfElevator = Integer.parseInt(scanner.nextLine());

        double courses = numberOfPerson * 1.0 / capacityOfElevator;
        System.out.printf("%.0f",Math.ceil(courses));







    }
}
