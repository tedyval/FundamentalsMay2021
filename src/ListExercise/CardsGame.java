package ListExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CardsGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> firstDeck = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> secondDeck = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        boolean isFailFirst = false;
        boolean isFailSecond = false;
        for (int i = 0; i < firstDeck.size(); i++) {
            int firstCard = firstDeck.get(0);
            if (i >= 0 && i < secondDeck.size()) {
                int secondCard = secondDeck.get(0);
                if (firstCard > secondCard) {
                    firstDeck.add(firstCard);
                    firstDeck.add(secondCard);
                    firstDeck.remove(0);
                    secondDeck.remove(0);
                } else if (firstCard < secondCard) {
                    secondDeck.add(secondCard);
                    secondDeck.add(firstCard);
                    firstDeck.remove(0);
                    secondDeck.remove(0);
                } else if (firstCard == secondCard) {
                    firstDeck.remove(0);
                    secondDeck.remove(0);
                }
                if (firstDeck.isEmpty()) {
                    isFailFirst = true;
                    break;
                } else if (secondDeck.isEmpty()) {
                    isFailSecond = true;
                }

                i=-1;


            }

        }
        String player = "";
        if (isFailFirst == false) {
            player = "First";
            int sum = 0;
            for (Integer integer : firstDeck) {
                sum += integer;
            }
            System.out.printf("%s player wins! Sum: %d", player, sum);
        } else if (isFailSecond == false) {
            player = "Second";
            int sum = 0;
            for (Integer integer : secondDeck) {
                sum += integer;
            }
            System.out.printf("%s player wins! Sum: %d", player, sum);
        }


    }
}
