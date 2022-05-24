package DataTypesAndVariablesAdditonal;

import java.util.Scanner;

public class DecryptingMessages {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int key = Integer.parseInt(scanner.nextLine());
        int numberOfCharacters = Integer.parseInt(scanner.nextLine());


        int result = 0;
        String message = "";
        ;
        for (int i = 1; i <=numberOfCharacters ; i++) {
            char letter = scanner.nextLine().charAt(0);
            if((letter >= 65 && letter <= 90) || (letter >=97 && letter<= 122)){
                result = letter + key;
                char newLetter = (char)result;
                message = "" + newLetter;
            }

            System.out.print(message);





        }













    }
}
