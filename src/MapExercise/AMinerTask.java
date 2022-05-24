package MapExercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class AMinerTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int counter = 0;
        String resource = " ";

        Map<String, Integer> resourceQuantity = new LinkedHashMap<>();
        while(!input.equals("stop")){
            counter++;
            int quantity = 0;
            if(counter % 2 != 0){
                resource = input;
            }else{
                quantity = Integer.parseInt(input);
            }

            if(!resourceQuantity.containsKey(resource)){
                resourceQuantity.put(resource,quantity);
            }else{
                int currentQuantity = resourceQuantity.get(resource);
                resourceQuantity.put(resource, currentQuantity + quantity);
            }

            input = scanner.nextLine();
        }

        resourceQuantity.forEach((key, value) -> System.out.println(key + " -> " + value));








    }
}
