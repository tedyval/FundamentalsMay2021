package ArrayLab;

import java.util.Arrays;
import java.util.Scanner;

public class CondenseArrayToNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbersArray = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();



        while(numbersArray.length > 1) {
            int[] condensingArray = new int[numbersArray.length - 1];
            for (int i = 0; i < condensingArray.length; i++) {
                condensingArray[i] = numbersArray[i] + numbersArray[i+1];
            }

            numbersArray =  condensingArray;
        }

        System.out.println(numbersArray[0]);




    }
}
