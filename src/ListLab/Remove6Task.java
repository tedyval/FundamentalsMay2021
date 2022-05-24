package ListLab;

import java.util.*;
import java.util.stream.Collectors;

public class Remove6Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        for (int i = 0; i < numbers.size() ; i++) {
            if(numbers.get(i) < 0){
                numbers.remove(i);
                i--;
            }
        }

        if(numbers.isEmpty()){
            System.out.println("empty");
        }else{
            Collections.reverse(numbers);
            System.out.print(numbers.toString().replaceAll("[\\[\\],]","").trim());
        }



    }
}
