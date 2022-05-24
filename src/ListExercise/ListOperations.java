package ListExercise;

import java.util.Arrays;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        String input = scanner.nextLine();
        while (!input.equals("End")) {
            String[] commands = input.split("\\s+");
            String command = commands[0];

            switch (command) {
                case "Add":
                    numbers.add(Integer.parseInt(commands[1]));
                    break;
                case "Insert":
                    int index = Integer.parseInt(commands[2]);
                    int number = Integer.parseInt(commands[1]);
                    if (!(index >= 0 &&  index <numbers.size())) {
                        System.out.println("Invalid index");
                    } else {
                        numbers.add(index,number);
                    }
                    break;
                case "Remove":
                    int index1 = Integer.parseInt(commands[1]);
                    if (!(index1 >= 0 &&  index1 <numbers.size())) {
                        System.out.println("Invalid index");
                    } else {
                        numbers.remove(index1);
                    }
                    break;
                case "Shift":
                    int count = Integer.parseInt(commands[2]);

                        if (commands[1].equals("left")) {

                            for (int i = 0; i < count; i++) {
                                    int num = numbers.get(0);
                                    numbers.add(num);
                                    numbers.remove(0);
                            }
                        } else if(commands[1].equals("right")){

                            for (int i = 0; i < count; i++) {
                                int num = numbers.get(numbers.size() - 1);
                                    numbers.add(0, num );
                                    numbers.remove(numbers.size() - 1);

                            }

                        }

                    break;

            }

            input = scanner.nextLine();
        }

        for (Integer number : numbers) {
            System.out.print(number + " ");

        }

    }
}



