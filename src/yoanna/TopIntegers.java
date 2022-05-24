package yoanna;

import java.util.Scanner;

public class TopIntegers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        String[] array = scan.nextLine().split(input);
        int[] intArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            intArray[i] = Integer.parseInt(array[i]);
        }

        for (int j = 0; j < intArray.length; j++) {
            int k = intArray[j];
            if(intArray[j+1] > k){
                int[] biggerArray = new int[intArray.length];
                for (int m = 0; m < biggerArray.length; m++) {
                    
                }
            }
        }
    }
}
