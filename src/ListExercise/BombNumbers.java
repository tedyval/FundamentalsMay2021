package ListExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BombNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> commands = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());

        int bombNum = commands.get(0);
        int power = commands.get(1);
        boolean isFound = false;
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) == bombNum) {
                isFound = true;
                numbers.remove(i);
                if (i == 0) {
                    for (int j = 1; j <= power; j++) {
                        numbers.remove(0);
                    }
                } else {
                    for (int j = 1; j <= power; j++) {
                        int newPosition = i - j;
                        if (newPosition >= 0 && newPosition < numbers.size()) {
                            numbers.remove(i - j);
                        }
                    }
                }

                if (i == (numbers.size() - 1)) {
                    for (int k = 1; k <= power ; k++) {
                        numbers.remove(numbers.size() - 1);
                    }

                } else {
                    for (int j = 1; j <= power; j++) {
                        int newPosition = i - power;
                        if (newPosition >= 0 && newPosition < numbers.size()) {
                            numbers.remove(i - power);
                        }
                    }
                }
            }

        }
        if(isFound == true) {
            int sum = 0;
            for (int i = 0; i < numbers.size(); i++) {
                sum += numbers.get(i);
            }
            System.out.println(sum);
        }
    }

}
