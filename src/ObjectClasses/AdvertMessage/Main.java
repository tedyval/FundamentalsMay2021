package ObjectClasses.AdvertMessage;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] phrases ={"Excellent product.", "Such a great product.", "I always use that product.", "Best product of its category.", "Exceptional product.", "I can’t live without this product."};
        String[] events = {"Now I feel good.", "I have succeeded with this product.", "Makes miracles. I am happy of the results!", "I cannot believe but now I feel awesome.", "Try it yourself, I am very satisfied.", "I feel great!"};
        String[] authors ={"Diana", "Petya", "Stella", "Elena", "Katya", "Iva", "Annie", "Eva"};
        String[] cities = {"Burgas", "Sofia", "Plovdiv", "Varna", "Ruse"};
        Random rnm = new Random();
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            int index1 = rnm.nextInt(phrases.length);
            int index2 = rnm.nextInt(events.length);
            int index3 = rnm.nextInt(authors.length);
            int index4 = rnm.nextInt(cities.length);
            String phrase = phrases[index1];
            String event = events[index2];
            String author = authors[index3];
            String city = cities[index4];
            Message message = new Message(phrase,event,author,city);
            System.out.println(message);


        }





    }
}
