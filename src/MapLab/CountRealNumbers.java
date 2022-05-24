package MapLab;

import java.util.*;

public class CountRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToDouble(Double::parseDouble).toArray();

        Map<Double,Integer> doubleNumbers = new LinkedHashMap<>();
        for (int i = 0; i < numbers.length; i++) {
            if(!doubleNumbers.containsKey(numbers[i])){
                doubleNumbers.put(numbers[i],1);
            } else{
                int counter = doubleNumbers.get(numbers[i]);
                doubleNumbers.put(numbers[i],counter + 1);
            }
        }

        doubleNumbers.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(e -> System.out.printf("%.0f -> %d%n",e.getKey(),e.getValue()));







    }
}
