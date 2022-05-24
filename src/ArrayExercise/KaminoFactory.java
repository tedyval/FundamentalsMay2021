package ArrayExercise;

import java.util.Arrays;
import java.util.Scanner;

public class KaminoFactory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();
        int counter1 = 0;

        int[][] tempArray = new int[5][];
        while(!input.equals("Clone them!")){

            counter1++;
            int[] sequence = Arrays.stream(input.split("!+")).mapToInt(Integer::parseInt).toArray();

            int counter = 0;
            int indexFirst = 0;
            int max = -1;
            int sum = 0;
            for (int i = 0; i < sequence.length; i++) {
                sum += sequence[i];
                if(sequence[i] == 1){
                    counter++;

                    if(counter==2){
                        indexFirst = i-1;
                    }
                }else{
                    if(counter > max){
                        max = counter;
                        counter = 0;
                    }
                }

            }
            int[][] currentArray = new int[5][];
            currentArray[0] = new int[1];
            currentArray[1] = new int[1];
            currentArray[2] = new int[1];
            currentArray[3] = new int[1];
            currentArray[4] = new int[n];

            currentArray[0][0] = max;
            currentArray[1][0] = indexFirst;
            currentArray[2][0] = sum;
            currentArray[3][0] = counter1;
            currentArray[4] = sequence;

            if(counter1 == 1){
                tempArray = currentArray;
            }


            if(currentArray[0][0]>tempArray[0][0]){
                tempArray = currentArray;
            }else if(currentArray[0][0] == tempArray[0][0]){
                if(currentArray[1][0] < tempArray[1][0]){
                    tempArray = currentArray;
                }else if(currentArray[1][0] == tempArray[1][0]){
                    if(currentArray[2][0] > tempArray[2][0] ){
                        tempArray = currentArray;
                    }
                }
            }

            input = scanner.nextLine();
        }

        System.out.printf("Best DNA sample %d with sum: %d.%n",tempArray[3][0],tempArray[2][0]);


            for (int j = 0; j <tempArray[4].length ; j++) {
                System.out.print(tempArray[4][j] + " ");
            }

              






    }
}
