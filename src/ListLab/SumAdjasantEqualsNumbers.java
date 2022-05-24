package ListLab;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class SumAdjasantEqualsNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        List<Double> numbers = Arrays.stream(input.split("\\s+")).map(Double::parseDouble).collect(Collectors.toList());
        for (int i = 0; i < numbers.size()-1; i++) {
            if(numbers.get(i).equals(numbers.get(i + 1))){
                numbers.set(i,numbers.get(i) + numbers.get(i+1));
                numbers.remove(i+1);
                i= -1;
            }
        }
        DecimalFormat df = new DecimalFormat("0.#");
        for (Double number : numbers) {
            System.out.print(df.format(number) + " ");

        }


    }
}
