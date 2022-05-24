package ArrayExercise;

import java.util.Arrays;
import java.util.Scanner;

public class ZigZagArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int[] firstArray = new int[n];
        int[] secondArray = new int[n];

        for (int i = 0; i < n ; i++) {
            String[] input = scanner.nextLine().split("\\s+");
            int firstNumber = Integer.parseInt(input[0]);
            int secondNumber = Integer.parseInt(input[1]);
            if((i + 1) % 2 != 0){
                firstArray[i] = firstNumber;
                secondArray[i] = secondNumber;
            }else if((i+1) % 2 == 0){
                firstArray[i] = secondNumber;
                secondArray[i] = firstNumber;
            }

        }
        for (int elem1: firstArray) {
            System.out.printf("%d ",elem1);
        }


        System.out.println();
        for (int elem1: secondArray) {
            System.out.printf("%d ",elem1);
        }






    }
}
