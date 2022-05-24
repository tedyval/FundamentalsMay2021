package MidExam;

import java.util.Arrays;
import java.util.Scanner;

public class MuOnline {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int initialHealth = 100;
        int initialBitcoins = 0;
        String input = scanner.nextLine();
        String[] commands = input.split("\\|");
        int counter = 0;
        boolean isDead = false;
        for (int i = 0; i < commands.length; i++) {
            counter++;
            String[] subCommand = new String[2];
            subCommand = commands[i].split(" ");
            String command = subCommand[0];
            int numberInCommand = Integer.parseInt(subCommand[1]);

            switch (command) {
                case "potion":
                    System.out.printf("You healed for %d hp.%n", numberInCommand);
                    if (initialHealth < 100) {
                        initialHealth += numberInCommand;
                        if (initialHealth > 100) {
                            initialHealth = 100;
                        }
                    }
                    System.out.printf("Current health: %d hp.%n", initialHealth);
                    break;
                case "chest":
                    initialBitcoins += numberInCommand;
                    System.out.printf("You found %d bitcoins.%n", numberInCommand);
                    break;
                default:
                    initialHealth -= numberInCommand;
                    if (initialHealth > 0) {
                        System.out.printf("You slayed %s.%n", command);
                    } else {
                        System.out.printf("You died! Killed by %s.%n", command);
                        System.out.printf("Best room: %d%n", i + 1);
                        isDead = true;
                        return;
                    }
                    break;
            }


        }

        if ( isDead == false) {
            System.out.println("You've made it!");
            System.out.printf("Bitcoins: %d%n", initialBitcoins);
            System.out.printf("Health: %d", initialHealth);
        }


    }
}
