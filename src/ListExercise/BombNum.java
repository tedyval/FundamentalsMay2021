package ListExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BombNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> commands = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());

        int bombNum = commands.get(0);
        int power = commands.get(1);
        boolean isFound = false;
        while(numbers.contains(bombNum)){
            isFound = true;
            int index = numbers.indexOf(bombNum);
            int left = index - power;
            int right = index + power;
            if((index - power) < 0){
                left = 0;
            }
            if((index + power) > numbers.size() - 1 ){
                right = numbers.size() - 1;
            }

            for (int i = right; i >=left ; i--) {
                numbers.remove(i);
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