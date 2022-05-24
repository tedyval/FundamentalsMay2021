package DataTypesAndVariablesExer;

import java.util.Scanner;

public class BeerKegs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfKegs = Integer.parseInt(scanner.nextLine());

        double volumeOfKeg = 0;
        double maxValue = Double.NEGATIVE_INFINITY;
        String searchedModel = "";
        for (int i = 1; i <=numberOfKegs ; i++) {
            String model = scanner.nextLine();
            double radius = Double.parseDouble(scanner.nextLine());
            int height = Integer.parseInt(scanner.nextLine());
            volumeOfKeg = Math.PI * Math.pow(radius,2) * height;
            if(volumeOfKeg > maxValue){
                maxValue = volumeOfKeg;
                searchedModel = model;
            }
        }
        System.out.printf("%s",searchedModel);

    }
}
