package ExamPreparation;

import java.math.BigInteger;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class EmojiDetector {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        String regexDigit = "(\\d)";
        Pattern regDigit = Pattern.compile(regexDigit);
        Matcher matcherDigit = regDigit.matcher(text);
        BigInteger threshold = BigInteger.valueOf(1);
        while(matcherDigit.find()){
            BigInteger digit = BigInteger.valueOf(Integer.parseInt(matcherDigit.group(1)));
            threshold = threshold.multiply(digit);

        }

        System.out.printf("Cool threshold: %d%n",threshold);

        String regexEmoji = "([:*]{2})([A-Z][a-z]{2,})\\1";
        Pattern regEmoji = Pattern.compile(regexEmoji);
        Matcher matcherEmoji = regEmoji.matcher(text);
        Map<String,Integer> emojiCoolness = new LinkedHashMap<>();
        Map<String,String> emojiSeparator = new LinkedHashMap<>();

        int count = 0;
        while(matcherEmoji.find()){
            count++;
            String emoji = matcherEmoji.group(2);
            int sum = 0;
            for (int i = 0; i < emoji.length() ; i++) {
                char letter = emoji.charAt(i);
                sum += (int)letter;
            }

            if(!emojiCoolness.containsKey(emoji)){
                emojiCoolness.put(emoji, sum);
                emojiSeparator.put(emoji, matcherEmoji.group(1));
            }
        }

        System.out.printf("%d emojis found in the text. The cool ones are:%n",count);
        BigInteger finalThreshold1 = threshold;
        Map<String,Integer> filtered = emojiCoolness.entrySet().stream().filter(e-> BigInteger.valueOf(e.getValue()).compareTo(finalThreshold1)>0)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1,e2)-> e1, LinkedHashMap::new));

        for (Map.Entry<String, Integer> st : filtered.entrySet()) {
                System.out.printf("%s%s%s%n",emojiSeparator.get(st.getKey()),st.getKey(),emojiSeparator.get(st.getKey()));

        }


    }
}


//.sorted((e2,e1)-> {
//        if(e2.getValue() != e1.getValue()) {
//        return Integer.compare(e2.getValue(), e1.getValue());
//        }
//        return 0;
//        })