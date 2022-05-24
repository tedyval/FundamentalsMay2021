package MidExam1;

import java.util.Arrays;
import java.util.Scanner;

public class MuOnline {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] battles = scanner.nextLine().split("\\|");
        int initialHealth = 100;
        int bitcoins = 0;
        int counter = 0;
        for (int i = 0; i < battles.length; i++) {
            String[] commands = battles[i].split(" ");
            String command = commands[0];
            int value = Integer.parseInt(commands[1]);
            switch (command) {
                case "potion":
                    System.out.printf("You healed for %d hp.%n", value);
                    if (initialHealth + value <= 100) {
                        initialHealth += value;
                    } else {
                    }
                    System.out.printf("Current health: %d hp.%n", initialHealth);
                    break;
                case "chest":
                    System.out.printf("You found %d bitcoins.%n", value);
                    bitcoins += value;

                    break;
                default:
                    if (initialHealth - value > 0) {
                        initialHealth -= value;
                        System.out.printf("You slayed %s.%n", command);
                    } else {
                        System.out.printf("You died! Killed by %s.%n", command);
                        System.out.printf("Best room: %d%n", i +1);
                        return;
                    }
                    break;
            }
           counter++;
        }
        if(counter == battles.length) {
            System.out.printf("You've made it!%n" + "Bitcoins: %d%n" + "Health: %d", bitcoins, initialHealth);
        }


    }
}
