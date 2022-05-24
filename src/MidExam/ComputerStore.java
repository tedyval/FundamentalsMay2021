package MidExam;

import java.util.Scanner;

public class ComputerStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        double sum = 0;
        while (!input.equals("special") && !input.equals("regular")) {
            double price = Double.parseDouble(input);
            if (price <= 0) {
                System.out.println("Invalid price!");
                input = scanner.nextLine();
                continue;
            }
            sum += price;
            input = scanner.nextLine();
        }

        double taxes = sum * 0.20;
        double totalSum = sum + taxes;


        if(input.equals("special")){
            totalSum *= 0.90;
        }

        if(totalSum == 0){
            System.out.println("Invalid order!");
        } else{
            System.out.println("Congratulations you've just bought a new computer!");
            System.out.printf("Price without taxes: %.2f$%n",sum);
            System.out.printf("Taxes: %.2f$%n",taxes);
            System.out.println("-----------");
            System.out.printf("Total price: %.2f$",totalSum);
        }



    }
}
