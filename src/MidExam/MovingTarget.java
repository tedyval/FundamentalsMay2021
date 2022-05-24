package MidExam;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MovingTarget {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> targets = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        for (Integer target : targets) {
            if(!(target >= 1 && target <= 10000)){
                return;
            }
        }

        String input = scanner.nextLine();
        while (!input.equals("End")) {
            String[] commands = input.split(" ");
            if(commands.length < 3){
                return;
            }
            String command = commands[0];
            int index = Integer.parseInt(commands[1]);
            int value = Integer.parseInt(commands[2]);

            switch (command) {
                case "Shoot":
                    if (index >= 0 && index < targets.size()) {
                        int changedValue = targets.get(index) - value;
                        if (changedValue <= 0) {
                            targets.remove(index);
                        }else{
                            targets.set(index, changedValue);
                        }
                    }
                    break;
                case "Add":
                    if (index >= 0 && index < targets.size()) {
                        targets.add(index, value);
                    } else {
                        System.out.println("Invalid placement!");
                    }
                    break;
                case "Strike":
                    if (index >= 0 && index < targets.size()) {
                        int start = index - value;
                        int end = index + value;
                        if (start >= 0 && end < targets.size()) {
                            for (int i = end; i >= start; i--) {
                                targets.remove(i);
                            }
                        } else {
                            System.out.println("Strike missed!");
                        }
                    } else {
                        System.out.println("Strike missed!");
                    }
                    break;
            }

            input = scanner.nextLine();
        }
        String output = targets.toString().replaceAll("[\\[\\],]","").trim();
        output = output.replaceAll(" ","\\|");
        System.out.println(output);



    }

}
