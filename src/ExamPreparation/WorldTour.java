package ExamPreparation;

import java.util.Scanner;

public class WorldTour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String stopsInput = scanner.nextLine();
        String input = scanner.nextLine();
        while (!input.equals("Travel")) {
            String[] commandParts = input.split(":");
            String command = commandParts[0];
            switch (command) {
                case "Add Stop":
                    int index = Integer.parseInt(commandParts[1]);
                    String insertString = commandParts[2];
                    if (index >= 0 && index < stopsInput.length()) {
                        StringBuilder newStr = new StringBuilder(stopsInput);
                        newStr.insert(index, insertString);
                        stopsInput = newStr.toString();
                    }
                    System.out.println(stopsInput);
                    break;
                case "Remove Stop":
                    int startIndex = Integer.parseInt(commandParts[1]);
                    int endIndex = Integer.parseInt(commandParts[2]);
                    if (isValid(startIndex, stopsInput.length() - 1) && isValid(endIndex, stopsInput.length() - 1)) {

                            StringBuilder newStr1 = new StringBuilder(stopsInput);
                            newStr1.delete(startIndex, endIndex + 1);
                            stopsInput = newStr1.toString();

                    }
                    System.out.println(stopsInput);
                    break;
                case "Switch":
                    String oldString = commandParts[1];
                    String newString = commandParts[2];
                    if (stopsInput.contains(oldString)){
                        stopsInput = stopsInput.replace(oldString, newString);
                    }
                    System.out.println(stopsInput);
                    break;

            }


            input = scanner.nextLine();

        }

        System.out.printf("Ready for world tour! Planned stops: %s", stopsInput);


    }

    public static boolean isValid(int index, int length) {
        return (index >= 0 && index <= length);
    }
}
