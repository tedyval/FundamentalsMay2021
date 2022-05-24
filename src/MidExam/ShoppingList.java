package MidExam;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ShoppingList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> products = Arrays.stream(scanner.nextLine().split("!")).collect(Collectors.toList());

        String input = scanner.nextLine();
        while(!input.equals("Go Shopping!")){
            String[] commands = input.split("\\s+");
            String command = commands[0];
            String product = commands[1];
            String newProduct ="";
            if(commands.length == 3){
               newProduct = commands[2];
            }
            boolean isExisted = products.contains(product);
            int index;
            if(isExisted == true){
                index = products.indexOf(product);
                switch(command){
                    case "Unnecessary":
                        products.remove(index);
                        break;
                    case "Correct":
                        products.set(index,newProduct);
                        break;
                    case "Rearrange":
                        products.remove(index);
                        products.add(product);
                        break;
                }

            } else{
                if ("Urgent".equals(command)) {
                    products.add(0, product);
                }
            }

            input = scanner.nextLine();
        }

        System.out.println(String.join(", ",products));






    }
}
