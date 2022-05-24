package ListLab;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SumAdjacentEqualNumber1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        List<Double> numbers = Arrays.stream(input.split( "\\s+")).map(Double::parseDouble).collect(Collectors.toList());
        int index = 0;
        while(index < numbers.size()-1){
            if(numbers.get(index).equals(numbers.get(index+1))){
                numbers.set(index,numbers.get(index)+numbers.get(index+1));
                numbers.remove(index+1);
                index =0;
            }else{
                index++;
            }
        }
        DecimalFormat df = new DecimalFormat("0.#");
        for (Double number : numbers) {
            System.out.print(df.format(number) + " ");
        }


    }
}
