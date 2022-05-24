package Exam2021Fundamentals;

import java.util.*;

public class Problem3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        Map<String, List<String>> guests = new LinkedHashMap<>();
        int counter = 0;
        while(!input.equals("Stop")){
            String[] data = input.split("-");
            String command = data[0];
            String guest = data[1];
            String meal = data[2];
            switch(command){
                case "Like":
                    if(!guests.containsKey(guest)){
                        guests.put(guest,new ArrayList<>());
                        guests.get(guest).add(meal);
                    }else{
                        if(!guests.get(guest).contains(meal)) {
                            guests.get(guest).add(meal);
                        }
                    }

                    break;
                case "Unlike":
                    if(!guests.containsKey(guest)){
                        System.out.printf("%s is not at the party.%n",guest);
                    }else if(!guests.get(guest).contains(meal)) {
                        System.out.printf("%s doesn't have the %s in his/her collection.%n",guest,meal);

                    }else if(guests.get(guest).contains(meal)){
                        counter++;
                        guests.get(guest).remove(meal);
                        System.out.printf("%s doesn't like the %s.%n",guest,meal);
                    }

                    break;

            }

            input = scanner.nextLine();
        }

        guests.entrySet().stream().sorted((e1,e2)-> {
            int result = Integer.compare(e2.getValue().size(),e1.getValue().size());
            if(result == 0){
                result = e1.getKey().compareTo(e2.getKey());
                return  result;
            }
            return  result;
        }).forEach(e-> {
            System.out.printf("%s: ",e.getKey());
            System.out.println(String.join(", ",e.getValue()));

        });

        System.out.printf("Unliked meals: %d",counter);





    }
}
