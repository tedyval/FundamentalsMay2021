package RegexExer;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SoftUniBarIncome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String reg = "%(?<customer>[A-Z][a-z]+)%[^|$%.]*<(?<product>\\w+)>[^|$%.]*\\|(?<count>\\d+)\\|[^|$%.]*?(?<price>\\d+\\.?\\d+)\\$";
        Pattern pattern = Pattern.compile(reg);
        String input = scanner.nextLine();
        double sum = 0;
        while(!input.equals("end of shift")){
            Matcher matcher = pattern.matcher(input);
            while(matcher.find()){
                String name = matcher.group("customer");
                String product = matcher.group("product");
                int count = Integer.parseInt(matcher.group("count"));
                double price = Double.parseDouble(matcher.group("price"));
                sum += count * price;
                System.out.printf("%s: %s - %.2f%n",name,product,count*price);
            }



            input = scanner.nextLine();
        }

        System.out.printf("Total income: %.2f",sum);


    }
}
