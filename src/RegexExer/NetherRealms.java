package RegexExer;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NetherRealms {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String regexName = ",\\s*";
        String[] inputNames = input.split(",\\s+");
        String[] inputNames2 = new String[inputNames.length];

        for (int i = 0; i < inputNames.length; i++) {

            inputNames2[i] = inputNames[i].replaceAll("(\\s+)","").replaceAll(",","");
        }


        Map<String,List<Double>> namesHealthDamage = new TreeMap<>();
        for (String inputName : inputNames2) {

            String regexHealth = "[^-/*+0-9.]";
            Pattern healthReg = Pattern.compile(regexHealth);
            Matcher matcherHealth = healthReg.matcher(inputName);
            double health = 0;
            while(matcherHealth.find()){
                char symbol = matcherHealth.group().charAt(0);
                health += (double) symbol;
            }

            String regexDamage = "(\\d+[.]?\\d*|-\\d+[.]?\\d*)";
            Pattern damageReg = Pattern.compile(regexDamage);
            Matcher matcherDamage = damageReg.matcher(inputName);
            double damage = 0;
            while(matcherDamage.find()){

                damage +=Double.parseDouble(matcherDamage.group(1));
            }

            String regexOperators = "\\*|\\/";
            Pattern operatorsReg = Pattern.compile(regexOperators);
            Matcher matcherOperator = operatorsReg.matcher(inputName);
            List<String> operators = new ArrayList<>();

            while(matcherOperator.find()){
                operators.add(matcherOperator.group());
            }


            for (String operator : operators) {
                if(operator.equals("*")){
                    damage = damage * 2;
                }else{
                    damage = damage / 2;
                }
            }


         if(!namesHealthDamage.containsKey(inputName)){
             List<Double> healthDamage = new ArrayList<>();
             healthDamage.add(health);
             healthDamage.add(damage);
             namesHealthDamage.put(inputName,healthDamage);
         }

        }

        namesHealthDamage.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(e->{
            System.out.printf("%s - %.0f health, %.2f damage%n",e.getKey(),e.getValue().get(0),e.getValue().get(1));
        });





    }
}
