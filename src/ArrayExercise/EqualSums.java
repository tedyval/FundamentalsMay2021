package ArrayExercise;

import java.util.Arrays;
import java.util.Scanner;

public class EqualSums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] input = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        int counter = 0;
        for (int i = 0; i < input.length; i++) {
            int currentNumber = input[i];
            int sumLeft = 0;
            if(i != 0){
                for (int j = 0; j <= i-1; j++) {

                    sumLeft += input[j];
                }

            }


            int sumRight = 0;
            if(i != input.length -1 ) {
                for (int l = i + 1; l <= input.length - 1; l++) {

                    sumRight += input[l];
                }
            }

            if(sumLeft == sumRight){
                System.out.println(i);
            }else if(sumLeft != sumRight){
                counter++;

            }
        }
        if(counter == input.length ){
            System.out.println("no");
        }







    }
}
