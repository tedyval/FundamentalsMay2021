package ArrayExercise;

import java.util.Scanner;

public class ArrayRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s+");
        int numberOfRotation = Integer.parseInt(scanner.nextLine());

        for (int k = 1; k <=numberOfRotation ; k++) {

            String temp = input[0];
            for (int i = 0; i <= input.length-2; i++) {

                input[i] = input[i+1];

            }
            input[input.length - 1] = temp;
        }

        for (String elem: input) {
            System.out.print(elem + " ");

        }








    }
}
