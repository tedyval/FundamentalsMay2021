package ListLab;

import java.util.*;
import java.util.stream.Collectors;

public class RemoveNegativesAndReverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> nonNegativeNumbers = new ArrayList<>();
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());

        for (Integer number : numbers) {
            if (number >= 0) {
                nonNegativeNumbers.add(number);
            }
        }

        if(nonNegativeNumbers.isEmpty()){
            System.out.println("empty");
        }else{
            Collections.reverse(nonNegativeNumbers);
            System.out.print(nonNegativeNumbers.toString().replaceAll("[\\[\\],]","").trim());
        }



    }
}
