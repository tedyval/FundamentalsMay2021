package ListExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ChangeList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());

        String input = scanner.nextLine();
        while(!input.equals("end")){
            String[] commands = input.split("\\s+");
            switch(commands[0]){
                case "Delete":
                    for (int i = 0; i < numbers.size(); i++) {
                        int numToRemove = Integer.parseInt(commands[1]);
                        if(numbers.get(i).equals(numToRemove)){
                            numbers.remove(i);
                            i--;
                        }
                    }
                    break;
                case "Insert":
                    int numToInsert = Integer.parseInt(commands[1]);
                    int positionAtToInsert = Integer.parseInt(commands[2]);
                    numbers.add(positionAtToInsert,numToInsert);
                    break;
            }


            input = scanner.nextLine();
        }
        for(int number: numbers){
            System.out.print(number + " ");
        }



    }
}
