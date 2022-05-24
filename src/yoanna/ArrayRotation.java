package yoanna;

import java.util.Scanner;

public class ArrayRotation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] array = scan.nextLine().split(" ");
        int switches = Integer.parseInt(scan.nextLine());
        for (int k = 1; k <=switches ; k++) {
            String temp = array[0];
            for (int i = 0; i <= array.length-2; i++) {
                array[i]= array[i+1];
            }array[array.length-1]=temp;

        }
        for (String elem: array) {
            System.out.print(elem + " ");
        }




    }
}
