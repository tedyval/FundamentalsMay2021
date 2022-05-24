package ArrayLab;

import java.util.Arrays;
import java.util.Scanner;

public class EvenAndOddSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbersArray = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(e -> Integer.parseInt(e)).toArray();

        int evenSum = 0;
        int oddSum = 0;
        for (int i = 0; i < numbersArray.length; i++) {
            if(numbersArray[i] % 2 == 0){
                evenSum += numbersArray[i];
            } else {
                oddSum += numbersArray[i];
            }
        }
        System.out.println(evenSum - oddSum);





        }






    }