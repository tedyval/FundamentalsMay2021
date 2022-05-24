package yoanna;

import java.util.Scanner;

public class ZigZagArrays {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int[] evenArray = new int[n];
        int[] oddArray = new int[n];
        for (int i = 0; i < n; i++) {
            String[] array1 = scan.nextLine().split(" ");
            int firstNumber = Integer.parseInt(array1[0]);
            int secondNumber = Integer.parseInt(array1[1]);
            if((i+1) % 2 == 0){
               evenArray[i] = firstNumber;
               oddArray[i] = secondNumber;
            } else {
                evenArray[i] = secondNumber;
                oddArray[i] = firstNumber;
            }
        }
        for(int first: oddArray){
            System.out.print(first + " ");

        }
        System.out.println();
        for(int second: evenArray) {
            System.out.print(second + " ");
        }
    }
}
