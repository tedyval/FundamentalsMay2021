package TextProcessingExercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ValidUserNames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] usernames = scanner.nextLine().split(", ");
        List<String> validUsername = new ArrayList<>();
        for (String username : usernames) {
            if (username.length() >= 3 && username.length() <= 16) {
                char[] symbols = username.toCharArray();
                int counter = 0;
                for (char symbol : symbols) {
                    if (!(Character.isLetterOrDigit(symbol) || symbol == '-' || symbol == '_')) {
                        counter++;
                    }


                }
                if(counter == 0) {
                    validUsername.add(username);
                }


            }

        }

        validUsername.forEach(e-> System.out.println(e));


    }
}
