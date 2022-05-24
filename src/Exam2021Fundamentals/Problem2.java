package Exam2021Fundamentals;

import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Problem2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String regex = "(U\\$)(?<username>[A-Z][a-z]{2,})(\\1)(P@\\$)(?<password>[A-Za-z]{5,}[0-9]{1,})(\\4)";
        Pattern validReg = Pattern.compile(regex);
        int counter = 0;
        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
           if(input.matches(regex)){
               counter++;
               Matcher machReg = validReg.matcher(input);
               while(machReg.find()) {
                   System.out.println("Registration was successful");
                   System.out.printf("Username: %s, Password: %s%n",machReg.group("username"),machReg.group("password"));

               }

           }else{
               System.out.println("Invalid username or password");
           }

        }
        System.out.printf("Successful registrations: %d",counter);








    }
}
