package TextProcessingExercise;

import java.util.Scanner;

public class explosion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int leftStrength = 0;

        while(input.contains(">")){
            int indexOfCharacterBigger = input.indexOf(">");
            int strength = (int) input.charAt(indexOfCharacterBigger + 1) + leftStrength;
            leftStrength = 0;
            StringBuilder newInput = new StringBuilder(input);

            if ((indexOfCharacterBigger +1) <= newInput.length() - 1) {
                int counter = 0;
                for (int j = indexOfCharacterBigger + 1; j <= Math.min(strength, newInput.length() - 1); j++) {
                    if (newInput.charAt(j) != '>') {
                        counter++;
                        newInput.deleteCharAt(j);
                    } else {
                        leftStrength = strength - counter;
                        break;
                    }
                }
            }

            input = newInput.toString();


        }
        System.out.println(input);












    }
}
