package ExamPreparation;

import java.util.Scanner;

public class ActivationKeys {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String rowKey = scanner.nextLine();
        if(!rowKey.matches("[A-Za-z0-9]+")){

        }

        String input = scanner.nextLine();
        while (!input.equals("Generate")) {
            if(rowKey.length()== 0){
                return;
            }
            String[] commandParts = input.split(">>>");
            String instruction = commandParts[0];
            switch (instruction) {
                case "Contains":
                    String substring = commandParts[1];
                    if (rowKey.contains(substring)) {
                        System.out.printf("%s contains %s%n", rowKey, substring);
                    } else {
                        System.out.println("Substring not found!");
                    }
                    break;
                case "Flip":
                    String typeOfCase = commandParts[1];
                    int startIndex = Math.max(Integer.parseInt(commandParts[2]), 0);
                    int endIndex = Math.min(Integer.parseInt(commandParts[3]), rowKey.length() - 1);
                    if (startIndex < endIndex) {
                        String substring1 = rowKey.substring(startIndex, endIndex);
                        switch (typeOfCase) {
                            case "Upper":
                                substring1 = substring1.toUpperCase();
                                break;
                            case "Lower":
                                substring1 = substring1.toLowerCase();
                                break;
                        }

                        StringBuilder newString = new StringBuilder(rowKey);
                        newString.replace(startIndex, endIndex, substring1);
                        System.out.println(newString);
                        rowKey = newString.toString();
                    }
                    break;
                case "Slice":
                    int firstIndex = Math.max(Integer.parseInt(commandParts[1]), 0);
                    int lastIndex = Math.min(Integer.parseInt(commandParts[2]), rowKey.length() - 1);
                    if (firstIndex < lastIndex) {
                        StringBuilder newKey = new StringBuilder(rowKey);
                        newKey.delete(firstIndex, lastIndex);
                        System.out.println(newKey);
                        rowKey = newKey.toString();
                    }
                    break;

            }


            input = scanner.nextLine();
        }

        System.out.printf("Your activation key is: %s", rowKey);

    }

}
