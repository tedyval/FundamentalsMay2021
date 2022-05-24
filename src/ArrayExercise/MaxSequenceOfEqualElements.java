package ArrayExercise;

import java.util.Scanner;

public class MaxSequenceOfEqualElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s+");
        int maxSequence = Integer.MIN_VALUE;
        boolean isIdentical = false;
        int index = 0;
        for (int i = 0; i < input.length; i++) {
            int counter = 0;

            for (int j = 0; j < input.length; j++) {
                if (input[i].equals(input[j])) {
                    counter++;
                } else {
                    if (counter > maxSequence) {
                        index = i;
                        maxSequence = counter;
                    }
                    counter = 0;
                }
            }
            if(counter == input.length){
                System.out.println(String.join(" ",input));
                isIdentical = true;
                break;
            }



        }

            for (int i = 1; i <= maxSequence; i++) {
                System.out.print(input[index] + " ");
            }






    }

}

