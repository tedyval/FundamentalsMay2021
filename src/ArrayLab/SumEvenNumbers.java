package ArrayLab;

import java.util.Scanner;

public class SumEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String[] numbersAsString = input.split(" ");
        int[] numbersArray = new int[numbersAsString.length];
        int sum = 0;
        for (int i = 0; i < numbersArray.length ; i++) {
            numbersArray[i] = Integer.parseInt(numbersAsString[i]);
            if(numbersArray[i] % 2 == 0){
                sum += numbersArray[i];
            }
        }
        System.out.println(sum);








    }
}
