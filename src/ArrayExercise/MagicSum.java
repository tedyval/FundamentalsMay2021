package ArrayExercise;

import java.util.Arrays;
import java.util.Scanner;

public class MagicSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] input = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int magicNumber = Integer.parseInt(scanner.nextLine());

        ;
        for (int i = 0; i < input.length; i++) {


            for (int j = i+1; j < input.length; j++) {

                if (input[i] + input[j] == magicNumber) {

                     System.out.printf("%d %d%n", input[i], input[j]);


                }

            }


        }
    }
}
