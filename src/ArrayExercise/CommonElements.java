package ArrayExercise;

import java.util.Scanner;

public class CommonElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] firstString = scanner.nextLine().split("\\s+");
        String[] secondString = scanner.nextLine().split("\\s+");

        for (int i = 0; i < secondString.length; i++) {
            for (int j = 0; j < firstString.length; j++) {
                if(secondString[i].equals(firstString[j])){
                    System.out.print(secondString[i] + " ");
                }

            }

        }









    }
}
