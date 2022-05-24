package RegexExer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StarEnigma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        List<String> attackedPlanet = new ArrayList();
        List<String> destroyedPlanet = new ArrayList();
        for (int i = 0; i <n ; i++) {
            String input = scanner.nextLine();
            String regex = "[STARstar]";
            List<String> letters = new ArrayList<>();
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(input);
            while(matcher.find()){
                letters.add(matcher.group());
            }

            int count = letters.size();
            char[] symbols = input.toCharArray();
            char[] newSymbols = new char[symbols.length];
            for (int j = 0; j < symbols.length; j++) {
                char newSymbol =(char)(symbols[j] - count);
                newSymbols[j] = newSymbol;
            }

            String decryptInput = new String(newSymbols);
            String regex2 = "@(?<planet>[A-Za-z]+)([^@!:>-]*):(?<population>\\d+)([^@!:>-]*)!(?<type>A|D)!([^@!:>-]*?)->(?<solders>\\d+)";
            Pattern pattern2 = Pattern.compile(regex2);
            Matcher matcher2 = pattern2.matcher(decryptInput);
            while(matcher2.find()){
                String name = matcher2.group("planet");
                String type = matcher2.group("type");
                if(type.equals("A")){
                    attackedPlanet.add(name);
                }else{
                    destroyedPlanet.add(name);
                }

            }


        }

        System.out.printf("Attacked planets: %d%n",attackedPlanet.size());
        Collections.sort(attackedPlanet);
        attackedPlanet.forEach(p-> System.out.println("-> " + p));
        System.out.printf("Destroyed planets: %d%n",destroyedPlanet.size());
        Collections.sort(destroyedPlanet);
        destroyedPlanet.forEach(p-> System.out.println("-> " + p));











    }
}
