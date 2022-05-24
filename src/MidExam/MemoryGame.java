package MidExam;


import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MemoryGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> elements = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());
        int leftElements = elements.size();
        int currentMove = 0;
        String input = scanner.nextLine();
        while (!input.equals("end")) {
            currentMove++;
            String[] twoElements = input.split(" ");
            int firstIndex = Integer.parseInt(twoElements[0]);
            int secondIndex = Integer.parseInt(twoElements[1]);

            if (!(firstIndex >= 0 && firstIndex < elements.size()) || !(secondIndex >= 0 && secondIndex < elements.size())) {
                addNewElements(elements, currentMove);
            } else if (firstIndex == secondIndex) {
              addNewElements(elements,currentMove);
            } else if (elements.get(firstIndex).equals(elements.get(secondIndex))) {
                String removedElement = elements.get(firstIndex);
                if (firstIndex < secondIndex) {
                    elements.remove(secondIndex);
                    elements.remove(firstIndex);
                } else {
                    elements.remove(firstIndex);
                    elements.remove(secondIndex);
                }
                leftElements -= 2;

                System.out.printf("Congrats! You have found matching elements - %s!%n", removedElement);
                if (leftElements == 0) {
                    System.out.printf("You have won in %d turns!", currentMove);
                    break;
                }
            }else if(!elements.get(firstIndex).equals(elements.get(secondIndex))){
                System.out.println("Try again!");

            }
            input = scanner.nextLine();
        }
        String output = String.join(" ", elements);
        if (leftElements > 0) {
            System.out.printf("Sorry you lose :(\n" + "%s", output);
        }


    }

    private static void addNewElements(List<String> elements, int currentMove) {
        System.out.println("Invalid input! Adding additional elements to the board");
        int indexOfAddition = elements.size() / 2;
        String newElement = String.format("-%da", currentMove);
        elements.add(indexOfAddition, newElement);
        elements.add(indexOfAddition + 1, newElement);
    }


}



