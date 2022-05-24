package MapExercise;

import java.util.*;

public class Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        Map<String, List<Double>> productPrice = new LinkedHashMap<>();
        while(!input.equals("buy")){
         String[] data = input.split("\\s");
         String product = data[0];
         double price = Double.parseDouble(data[1]);
         double quantity = Double.parseDouble(data[2]);
         if(!productPrice.containsKey(product)){
             productPrice.put(product,new ArrayList<Double>());
             productPrice.get(product).add(0,price);
             productPrice.get(product).add(1,quantity);

         }else{
             productPrice.get(product).set(0,price);
             productPrice.get(product).set(1,productPrice.get(product).get(1) + quantity);

         }

         input = scanner.nextLine();
        }

        Map<String, Double> productQuantity = new LinkedHashMap<>();
        for (Map.Entry<String, List<Double>> s : productPrice.entrySet()) {
            double sum = s.getValue().get(0) *  s.getValue().get(1);
            productQuantity.put(s.getKey(),sum);
        }

        productQuantity.entrySet().forEach(e -> System.out.printf("%s -> %.2f%n",e.getKey(),e.getValue()));


    }
}
