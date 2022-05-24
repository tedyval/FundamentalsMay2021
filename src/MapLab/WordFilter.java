package MapLab;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class WordFilter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] words = scanner.nextLine().split(" ");
        Map<String, Integer> wordsByLength = new LinkedHashMap<>();
        for (int i = 0; i < words.length; i++) {
            int length = words[i].length();
            if(!wordsByLength.containsKey(words[i])){
                wordsByLength.put(words[i],length);
            }
        }
        wordsByLength.entrySet().stream().filter(e -> e.getValue() % 2 == 0).forEach(e -> System.out.println(e.getKey()));





    }
}
