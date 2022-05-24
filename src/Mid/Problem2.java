package Mid;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Problem2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        String input = scanner.nextLine();
        while(!input.equals("Finish")){
            String[] commands = input.split(" ");
            String command = commands[0];
            int value = Integer.parseInt(commands[1]);

            switch(command){
                case "Add":
                    numbers.add(value);
                    break;
                case "Remove":
                    for (int i = 0; i < numbers.size() ; i++) {
                        if(numbers.get(i) == value){
                            numbers.remove(i);
                            break;
                        }
                    }
                    break;
                case "Replace":
                    int newValue = Integer.parseInt(commands[2]);
                    if(numbers.contains(value)){
                        int index = numbers.indexOf(value);
                        numbers.set(index,newValue);
                }
                    break;
                case "Collapse":
                    for (int i = numbers.size() - 1; i >= 0  ; i--) {
                        if(numbers.get(i) < value){
                           numbers.remove(i);
                        }

                    }

                    break;

            }
            input = scanner.nextLine();
        }
        String output = numbers.toString();
        System.out.println(output.replaceAll("[\\[\\],]",""));







    }
}
