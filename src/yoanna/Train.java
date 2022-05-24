package yoanna;

import java.util.Scanner;

public class Train {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int sum = 0;
        int[] peopleInWagons = new int [n];
        for (int i = 0; i < peopleInWagons.length; i++) {
            peopleInWagons[i] = Integer.parseInt(scan.nextLine());
            sum += peopleInWagons[i];
            System.out.print(peopleInWagons[i] + " ");
        }
        System.out.println();
        System.out.println(sum);
    }
}
