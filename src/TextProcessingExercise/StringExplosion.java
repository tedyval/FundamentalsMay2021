package TextProcessingExercise;

import java.util.Scanner;

public class StringExplosion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String[] texts = input.split("\\>");
        int leftStrength = 0;
        int strength = 0;
        char num = 300;
        String charAsString = "";
        for (int i = 0; i < texts.length; i++) {
            if(Character.isDigit(texts[i].charAt(0))){
                num = texts[i].charAt(0);
                charAsString = Character.toString(num);

                strength = Integer.parseInt(charAsString) + leftStrength;
                if(texts[i].length() > strength){
                    texts[i] = texts[i].substring(strength);

                }else if(texts[i].length() == strength){
                    texts[i] = "";
                }else if(texts[i].length() < strength){
                    leftStrength=0;
                    leftStrength= strength - texts[i].length();
                    texts[i] = "";
                }
            }
        }
        System.out.println(String.join(">",texts));


    }
}
