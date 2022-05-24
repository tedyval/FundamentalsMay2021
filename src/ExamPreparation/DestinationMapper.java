package ExamPreparation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DestinationMapper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String places = scanner.nextLine();
        String regex = "(=|/)([A-Z][A-Za-z]{2,})(\\1)";
        Pattern regPlace = Pattern.compile(regex);
        Matcher machPlaces = regPlace.matcher(places);
        List<String> placesInList = new ArrayList<>();
        int sum = 0;
        while(machPlaces.find()){
           String name = machPlaces.group(2);
           sum += name.length();
           placesInList.add(name);
        }

       if(!placesInList.isEmpty()) {
           System.out.print("Destinations: ");
           int count = 0;

           for (String s : placesInList) {
               count++;

               if (count < placesInList.size()) {
                   System.out.printf("%s, ", s);
               } else {
                   System.out.printf("%s%n", s);
               }

           }
       }else{
           System.out.println("Destinations: ");
       }
        System.out.printf("Travel Points: %d",sum);


    }
}
