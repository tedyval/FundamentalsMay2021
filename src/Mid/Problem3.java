package Mid;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.function.DoubleFunction;
import java.util.stream.Collectors;

public class Problem3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       List<String> products = Arrays.stream(scanner.nextLine().split("\\|")).collect(Collectors.toList());
       String input = scanner.nextLine();
       while(!input.equals("Shop!")){
           String[] commands = input.split("%");
           String command = commands[0];
           String product = commands[1];

           switch(command){
               case "Important":
                   if(products.contains(product)){
                       int index = products.indexOf(product);
                       products.remove(index);
                       products.add(0,product);

                   }else{
                       products.add(0,product);
                   }

                   break;
               case "Add":
                   if(!products.contains(product)) {
                       products.add(product);
                   } else{
                       System.out.println("The product is already in the list.");
                   }
                   break;
               case "Swap":
                   String newProduct = commands[2];
                   if(products.contains(product) && products.contains(newProduct)){
                       int index1 = products.indexOf(product);
                       int index2 = products.indexOf(newProduct);
                       products.set(index1,newProduct);
                       products.set(index2,product);
                   }else if(!products.contains(product)){
                       System.out.printf("Product %s missing!%n",product);
                   } else if(!products.contains(newProduct)){
                       System.out.printf("Product %s missing!%n",newProduct);
                   }
                   break;
               case "Remove":
                   if(products.contains(product)) {
                       int index =products.indexOf(product);
                       products.remove(index);
                   }else{
                       System.out.printf("Product %s isn't in the list.%n",product);
                   }
                   break;
               case "Reversed":
                   Collections.reverse(products);
                   break;
           }

           input = scanner.nextLine();
       }

        for (int i = 0; i < products.size(); i++) {
            System.out.printf("%d. %s%n",i + 1,products.get(i));
        }


    }
}
