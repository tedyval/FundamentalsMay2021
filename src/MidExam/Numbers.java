package MidExam;

import java.util.*;
import java.util.stream.Collectors;

public class Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        int sum = 0;
        for (int i = 0; i < numbers.size(); i++) {
            sum += numbers.get(i);
        }
        double average = sum * 1.0 / numbers.size();

        Collections.sort(numbers);
        Collections.reverse(numbers);
        int counter = 0;
        List<Integer> top5 = new ArrayList<>();
        for (int i = 0; i < numbers.size() ; i++) {
            if(numbers.get(i) > average){
                counter++;
                if(counter <= 5){
                    top5.add(numbers.get(i));
                }else{
                    break;
                }
            }
        }

        if(counter == 0){
            System.out.println("No");
        }else {
            String output = top5.toString().trim();
            System.out.print(output.replaceAll("[\\[\\],]", ""));
        }








    }
}
