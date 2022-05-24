package MidExam;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Inventory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> items = Arrays.stream(scanner.nextLine().split(", ")).collect(Collectors.toList());
        boolean isFound = false;
        String input = scanner.nextLine();
        while (!input.equals("Craft!")) {
            String[] commands = input.split(" - ");
            String command = commands[0];
            String item = commands[1];
            int index;
            switch (command) {
                case "Collect":
                    if (!items.contains(item)) {
                        items.add(item);
                    }
                    break;
                case "Drop":
                    index = getIndex(items,item);
                    if(index >=0) {
                        items.remove(index);
                    }
                    break;
                case "Combine Items":
                    String[] twoItems = item.split(":");
                    String oldItem = twoItems[0];
                    String newItem = twoItems[1];
                    index = getIndex(items,oldItem);
                    if(index >=0) {
                        items.add(index + 1, newItem);
                    } else {
                        continue;
                    }
                    break;
                case "Renew":
                    index = getIndex(items,item);
                    if(index >=0) {
                        items.remove(index);
                        items.add(item);
                    }
                    break;

            }

            input = scanner.nextLine();
        }
        System.out.print(String.join(", ", items));
    }

    private static int getIndex(List<String> items, String item) {
       int index = -1;
        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).equals(item)) {
                index = i;
            }
        }
               return index;
    }
}
