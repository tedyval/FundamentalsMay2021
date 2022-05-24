package MapLab;

import java.util.*;
import java.util.stream.Collectors;

public class OddOccurrences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] words = scanner.nextLine().split(" ");
        Map<String, Integer> wordsAtOddPosition = new LinkedHashMap<>();
        for (int i = 0; i < words.length; i++) {
            String wordToLowerCase = words[i].toLowerCase();
            if(!wordsAtOddPosition.containsKey(wordToLowerCase)){
                wordsAtOddPosition.put(wordToLowerCase,1);
            }else{
                wordsAtOddPosition.put(wordToLowerCase,wordsAtOddPosition.get(wordToLowerCase) + 1);
            }

        }

        Map<String,Integer> filteredMap =wordsAtOddPosition.entrySet().stream().filter(e -> e.getValue() % 2 != 0).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,(e1,e2) -> e1, LinkedHashMap::new));
        StringBuilder newString = new StringBuilder();
        for (String s : filteredMap.keySet()) {
            newString.append(s).append(", ");
        }
        System.out.println(newString.delete(newString.length()-2,newString.length()-1));


    }
}
