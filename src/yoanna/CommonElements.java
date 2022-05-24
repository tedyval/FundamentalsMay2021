package yoanna;

import java.util.Scanner;

public class CommonElements {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] array1 = scan.nextLine().split(" ");
        String[] array2 = scan.nextLine().split(" ");
        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array1.length ; j++) {
                if(array1[j].equals(array2[i])){
                    System.out.print(array1[j] + " ");
                }
            }
        }
    }
}
