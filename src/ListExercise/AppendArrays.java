package ListExercise;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class AppendArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> numAsStrings = Arrays.stream(scanner.nextLine().split("\\|")).collect(Collectors.toList());
        Collections.reverse(numAsStrings);
        String ordered = numAsStrings.toString().replaceAll("[\\[\\] ,]"," ").replaceAll("\\s+"," ").trim();

        System.out.println(ordered);

    }
}
