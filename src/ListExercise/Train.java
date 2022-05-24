package ListExercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> wagons = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        int maxPassengers = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();
        while (!input.equals("end")) {
            String[] commands = input.split("\\s+");
            if (commands[0].equals("Add")) {
                wagons.add(Integer.parseInt(commands[1]));
            } else {
                for (int i = 0; i < wagons.size(); i++) {
                    if ((wagons.get(i) + Integer.parseInt(commands[0])) <= maxPassengers) {
                        wagons.set(i, Integer.parseInt(commands[0])+wagons.get(i));
                        break;
                    }
                }
            }

            input = scanner.nextLine();
        }
        for (Integer wagon : wagons) {
            System.out.print(wagon + " ");

        }


    }
}
