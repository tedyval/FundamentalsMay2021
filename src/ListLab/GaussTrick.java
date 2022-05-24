package ListLab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class GaussTrick {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        List<Integer> numbers = Arrays.stream(input.split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        int length = numbers.size();
        for (int i = 0; i < length/2; i++) {
            int result = numbers.get(i) + numbers.get(numbers.size()-1);
            numbers.set(i,result);
            numbers.remove(numbers.size()-1);
        }
        for (Integer number : numbers) {
            System.out.print(number + " ");
        }

    }
}
