package ListLab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationAdvanced {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());

        String input = scanner.nextLine();
        while (!input.equals("end")) {
            String[] commands = input.split("\\s+");
            switch (commands[0]) {
                case "Contains":
                    if (numbers.contains(Integer.parseInt(commands[1]))) {
                        System.out.println("Yes");
                    } else {
                        System.out.println("No such number");
                    }
                    break;
                case "Print":
                    if (commands[1].equals("even")) {
                        List<Integer> evenNum = new ArrayList<>();
                        for (int i = 0; i < numbers.size(); i++) {
                            if (numbers.get(i) % 2 == 0) {
                                evenNum.add(numbers.get(i));
                            }
                        }
                        for (Integer integer : evenNum) {
                            System.out.print(integer + " ");
                        }
                        System.out.println();

                    } else if (commands[1].equals("odd")) {
                        List<Integer> oddNum = new ArrayList<>();
                        for (int i = 0; i < numbers.size(); i++) {
                            if (numbers.get(i) % 2 != 0) {
                                oddNum.add(numbers.get(i));
                            }
                        }
                        for (Integer integer : oddNum) {
                            System.out.print(integer + " ");
                        }
                        System.out.println();

                    }
                    break;
                case "Get":
                    int sum = 0;
                    for (Integer number : numbers) {
                        sum += number;
                    }
                    System.out.println(sum);
                    break;
                case "Filter":
                    String operators = commands[1];
                    char symbol = 200;
                    char symbol2 = 150;
                    int operatorsLength = operators.length();
                    int inputValue = Integer.parseInt(commands[2]);
                    if (operatorsLength == 1) {
                        symbol = operators.charAt(0);
                    } else {
                        symbol = operators.charAt(0);
                        symbol2 = operators.charAt(1);
                    }
                    List<Integer> filteredNum = new ArrayList<>();
                    switch (symbol) {
                        case '>':
                            if (symbol2 == '=') {
                                for (Integer number : numbers) {
                                    if (number >= inputValue) {
                                        filteredNum.add(number);
                                    }
                                }
                                for (Integer integer : filteredNum) {
                                    System.out.print(integer + " ");
                                }
                                System.out.println();
                            } else {
                                for (Integer number : numbers) {
                                    if (number > inputValue) {
                                        filteredNum.add(number);
                                    }
                                }
                                for (Integer integer : filteredNum) {
                                    System.out.print(integer + " ");
                                }
                                System.out.println();
                            }
                            break;
                        case '<':
                            if (symbol2 == '=') {
                                for (Integer number : numbers) {
                                    if (number <= inputValue) {
                                        filteredNum.add(number);
                                    }
                                }
                                for (Integer integer : filteredNum) {
                                    System.out.print(integer + " ");
                                }
                                System.out.println();
                            } else {
                                for (Integer number : numbers) {
                                    if (number < inputValue) {
                                        filteredNum.add(number);
                                    }
                                }
                                for (Integer integer : filteredNum) {
                                    System.out.print(integer + " ");
                                }
                                System.out.println();
                            }
                            break;

                    }

            }
            input = scanner.nextLine();
        }


    }


}




