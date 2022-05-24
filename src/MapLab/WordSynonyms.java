package MapLab;

import java.util.*;

public class WordSynonyms {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Map<String, List<String>> wordSynonyms = new LinkedHashMap<>();
        for (int i = 0; i < n; i++) {
            String word = scanner.nextLine();
            String synonym = scanner.nextLine();

            if(!wordSynonyms.containsKey(word)){
                wordSynonyms.put(word,new ArrayList<>());
            }
                wordSynonyms.get(word).add(synonym);

        }

        for (Map.Entry<String, List<String>> stringListEntry : wordSynonyms.entrySet()) {
            System.out.print(stringListEntry.getKey() + " - ");
            System.out.println(String.join(", ",stringListEntry.getValue()));
        }


    }
}
