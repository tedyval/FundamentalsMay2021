package RegexExer;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Furniture {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String regex = ">>([A-Za-z]+)<<(\\d+.?\\d*)!(\\d+)";
        Pattern pattern = Pattern.compile(regex);
        String input =scanner.nextLine();
        List<String> names = new ArrayList<>();
        double price = 0;
        double sum = 0;
        while(!input.equals("Purchase")){
            Matcher matcher = pattern.matcher(input);
            while(matcher.find()){
               names.add(matcher.group(1));
                price = Double.parseDouble(matcher.group(2));
                sum += price * Double.parseDouble(matcher.group(3));
            }



            input =scanner.nextLine();
        }

        System.out.println("Bought furniture:");
        names.forEach(n-> System.out.println(n));
        System.out.printf("Total money spend: %.2f",sum);


    }
}
