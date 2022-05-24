package ObjectsAndClasesLab;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] words = scanner.nextLine().split("\\s+");
        Random rnd = new Random();

        for (int i = 0; i < words.length; i++) {
            int p2 = rnd.nextInt(words.length);
            String temp = words[i];
            words[i] = words[p2];
            words[p2] = temp;
        }
        Arrays.stream(words).forEach(System.out::println);







    }


}
