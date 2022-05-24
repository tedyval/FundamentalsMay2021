package ArrayLab;

import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String[] daysOfWeek = {"Monday", "Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};

        if(n < 1|| n>7){
            System.out.println("Invalid day!");
        } else {
            for (int i = 0; i < daysOfWeek.length; i++) {
                if (i + 1 == n) {
                    System.out.println(daysOfWeek[i]);
                }

            }

        }





    }
}
