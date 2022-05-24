package ExamPreparation;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FancyBarcodes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n  = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n ; i++) {
            String input = scanner.nextLine();
            String regex = "([@][#]+)[A-Z][A-Za-z0-9]{4,}[A-Z]([@][#]+)";
            if (input.matches(regex)) {
                String regexDigit = "\\d";
                Pattern regDigit = Pattern.compile(regexDigit);
                Matcher matcherDigit = regDigit.matcher(input);
                StringBuilder barcod = new StringBuilder();
                while(matcherDigit.find()){
                   barcod.append(matcherDigit.group());
                }

                if(barcod.length() != 0){
                    System.out.printf("Product group: %s%n",barcod );
                }else{
                    System.out.println("Product group: 00");
                }


            } else {
                System.out.println("Invalid barcode");
            }
        }





    }
}
