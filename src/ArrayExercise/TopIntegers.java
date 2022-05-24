package ArrayExercise;

import java.util.Arrays;
import java.util.Scanner;

public class TopIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbersArray = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        for (int i = 0; i < numbersArray.length; i++) {
            int currentNumber = numbersArray[i];
            int counter = 0;
            for (int j = i+1; j <=numbersArray.length-1 ; j++) {
                if(currentNumber > numbersArray[i+1]){
                    counter++;
                }
            }
            if(counter == numbersArray.length -1-i){
                System.out.print(currentNumber + " ");
            }

        }









    }
}
