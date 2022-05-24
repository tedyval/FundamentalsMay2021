package MidExam;

import java.util.*;
import java.util.stream.Collectors;

public class TreasureHunt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> items = Arrays.stream(scanner.nextLine().split("\\|")).collect(Collectors.toList());
        String input = scanner.nextLine();
        boolean isEmpty = false;
        while(!input.equals("Yohoho!")){
            String[] commands = input.split(" ");
            String command = commands[0];

            switch(command){
                case "Loot":

                    for (int i = 1; i < commands.length ; i++) {
                        String item = commands[i];
                        if(!items.contains(item)){
                            items.add(0,item);
                        }
                    }
                    break;
                case "Drop":
                    int index = Integer.parseInt(commands[1]);
                    if(index >= 0 && index < items.size()){
                        String removedElement = items.get(index);
                        items.remove(index);
                        items.add(removedElement);
                    }
                    break;
                case "Steal":
                    List<String> stolenElements = new ArrayList<>();
                    int count = Integer.parseInt(commands[1]);
                    if(count < items.size()){
                        for (int i = 1; i <= count ; i++) {
                            stolenElements.add(items.get(items.size() - 1));
                            items.remove(items.size() - 1);
                        }
                        Collections.reverse(stolenElements);
                        String output = String.join(", ",stolenElements);
                        System.out.println(output);
                    }else{
                        isEmpty = true;
                        String output = String.join(", ",items);
                        System.out.println(output);
                    }
                    break;

            }


            input = scanner.nextLine();
        }
        int sum = 0;

        for (String item : items) {
            sum += item.length();
        }

        double averageGain = sum * 1.0 / items.size();

        if(isEmpty == true){
            System.out.println("Failed treasure hunt.");
        }else{
            System.out.printf("Average treasure gain: %.2f pirate credits.",averageGain);
        }









    }
}
