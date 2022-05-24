package MidExam1;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Iventory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> items = Arrays.stream(scanner.nextLine().split(", ")).collect(Collectors.toList());
        String input = scanner.nextLine();
        while (!input.equals("Craft!")) {
            String[] commands = input.split(" - ");
            String command = commands[0];
            switch (command) {
                case "Collect":
                    if (!items.contains(commands[1])) {
                        items.add(commands[1]);
                    }
                    break;
                case "Drop":
                    if (items.contains(commands[1])) {
                        items.remove(commands[1]);
                    }
                    break;
                case "Combine Items":
                    String[] twoItems = commands[1].split(":");
                    if (items.contains(twoItems[0])) {
                        int index = items.indexOf(twoItems[0]);
                        items.add(index + 1, twoItems[1]);
                    }
                    break;
                case "Renew":
                    if (items.contains(commands[1])) {
                        int index = items.indexOf(commands[1]);
                        items.add(commands[1]);
                        items.remove(index);
                    }
                    break;

            }

            input = scanner.nextLine();
        }

        String output = items.toString().replaceAll("[\\[\\],]","").trim();
        System.out.println(output.replaceAll(" ",", "));
    }
}
