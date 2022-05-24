package ArrayExercise;

import java.util.Scanner;

public class Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfWagons = Integer.parseInt(scanner.nextLine());

        int[] peopleInEachWagon = new int[numberOfWagons];
        int sum = 0;
        for (int i = 0; i < numberOfWagons; i++) {
            peopleInEachWagon[i] = Integer.parseInt(scanner.nextLine());
            sum += peopleInEachWagon[i];
            System.out.print(peopleInEachWagon[i] + " ");
        }
        System.out.println();
        System.out.println(sum);




    }
}
