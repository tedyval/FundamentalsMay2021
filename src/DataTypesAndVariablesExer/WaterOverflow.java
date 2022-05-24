package DataTypesAndVariablesExer;

import java.util.Scanner;

public class WaterOverflow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfPour = Integer.parseInt(scanner.nextLine());
        int capacityOfTank= 255;

        int sumOfLitersInTank = 0;

        for (int i = 1; i <=numberOfPour ; i++) {
            int litersPerPour = Integer.parseInt(scanner.nextLine());
            capacityOfTank -= litersPerPour;
            if(capacityOfTank >= 0){
                sumOfLitersInTank += litersPerPour;
            }else {
                System.out.println("Insufficient capacity!");
                capacityOfTank += litersPerPour;
            }



        }
        System.out.printf("%d",sumOfLitersInTank);

    }
}
