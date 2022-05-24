package ListExercise;

import java.util.*;
import java.util.stream.Collectors;

public class AnonymousThreat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> strings = Arrays.stream(scanner.nextLine().split("\\s+")).collect(Collectors.toList());
        for (int i = 0; i < strings.size(); i++) {
            if(strings.get(i).contains(" ")){
                return;
            }

        }



        String input = scanner.nextLine();

        while(!input.equals("3:1")){
            String[] commands = input.split("\\s+");
            String command = commands[0];
            int startIndex= Integer.parseInt(commands[1]);
            int endIndexOrPartitions= Integer.parseInt(commands[2]);


            List<String> merging = new ArrayList<>();
            if(command.equals("merge")){

                if(!(startIndex >= 0 && startIndex <strings.size())){
                    if(startIndex < 0){
                        startIndex = 0;
                    }
                }
                if(!(endIndexOrPartitions >=0 && endIndexOrPartitions < strings.size())){
                    if(endIndexOrPartitions >= strings.size()){
                        endIndexOrPartitions = strings.size()-1;
                    }
                }
            if(startIndex < endIndexOrPartitions) {
                for (int i = startIndex; i <= endIndexOrPartitions; i++) {
                    merging.add(strings.get(i));
                }

                String output = merging.toString().replaceAll("[\\[\\] ,]", "").replaceAll("\\s+", "").trim();
                strings.set(startIndex, output);
                int count = 0;
                for (int i = startIndex + 1; ; ) {
                    if (count == endIndexOrPartitions-startIndex) {
                        break;
                    }
                    if (i >= 0 && i <= strings.size() - 1) {
                        count++;
                        strings.remove(i);
                        i = startIndex + 1;
                    } else {
                        break;
                    }
                }
            }


            }else if(command.equals("divide")){
                if(!(startIndex >= 0 && startIndex <strings.size())){
                    if(startIndex < 0){
                        startIndex = 0;
                    }
                }
                String dividingString = strings.get(startIndex);

                List<String> partitions = new ArrayList<>();
                int partLength = dividingString.length() / endIndexOrPartitions;
                int rest = dividingString.length() % endIndexOrPartitions;
                if(dividingString.length() % endIndexOrPartitions == 0){
                    for (int i = 0; i < dividingString.length(); i += partLength) {
                            partitions.add(dividingString.substring(i, i + partLength));
                    }
                }else{

                   int  count =0;
                    for (int i = 0; i < dividingString.length() ; i += partLength) {


                            if (i <= dividingString.length() - 2) {
                                count++;
                                partitions.add(dividingString.substring(i, i + partLength));
                            } else {
                                int res = dividingString.length() - count * partLength;
                                partitions.add(dividingString.substring(dividingString.length() - res));

                            }
                    }
                }

                strings.remove(startIndex);
                for (int i = partitions.size() -1; i>=0   ; i--) {
                    strings.add(startIndex,partitions.get(i));
                }

            }
            input = scanner.nextLine();
        }


        for (String string : strings) {
            System.out.print(string + " ");

        }


    }
}
