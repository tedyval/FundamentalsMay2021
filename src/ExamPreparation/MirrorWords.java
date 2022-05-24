package ExamPreparation;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MirrorWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        String regex = "(@|#)([A-Za-z]{3,})(\\1)(\\1)([A-Za-z]{3,})(\\1)";
        Pattern validReg = Pattern.compile(regex);
        Matcher pairs = validReg.matcher(text);
        List<List<String>> pairsInList = new ArrayList<>();
        int count = 0;
        boolean isFound = false;

        while(pairs.find()) {
            count++;
            isFound = true;


                String word = pairs.group(2);
                String word2 = pairs.group(5);




                StringBuilder reversedWord = new StringBuilder(word);
                reversedWord.reverse();
                String reversedStr = reversedWord.toString();
                if (word2.equals(reversedStr)) {
                    List<String> mirrorWords = new ArrayList<>();
                    mirrorWords.add(word);
                    mirrorWords.add(word2);
                    pairsInList.add(mirrorWords);
                }


        }



        if(isFound == false){
            System.out.println("No word pairs found!");
        }else if(isFound == true){
            System.out.printf("%d word pairs found!%n",count);
        }

        if(pairsInList.isEmpty()){
            System.out.println("No mirror words!");
        }else {
            System.out.println("The mirror words are:");
            StringBuilder output = new StringBuilder();
            for (var strin : pairsInList) {
                output.append(strin.get(0)).append(" <=> ").append(strin.get(1)).append(", ");
            }
            output.deleteCharAt(output.length()-1).deleteCharAt(output.length()-1);
            String finalOutput = output.toString();
            System.out.println(finalOutput);

        }




    }
}
