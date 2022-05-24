package MapAdditional;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Judge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Map<String, Map<String,Integer>> contests = new LinkedHashMap<>();
        while(!input.equals("no more time")){
            String[] data = input.split(" -> ");
            String user = data[0];
            String contest = data[1];
            int points = Integer.parseInt(data[2]);
            Map<String,Integer> users = new TreeMap<>();
            if(!contests.containsKey(contest)){
                contests.put(contest,users);
                users.put(user,points);
            }else{
                if(!contests.get(contest).containsKey(user)){
                    contests.get(contest).put(user,points);
                }else{
                    if (contests.get(contest).get(user) < points){
                        contests.get(contest).put(user,points);
                    }
                }
            }

            input = scanner.nextLine();
        }

        AtomicInteger num = new AtomicInteger(1);
        for (Map.Entry<String, Map<String, Integer>> s: contests.entrySet()) {
            num.set(1);
            System.out.printf("%s: %d participants%n",s.getKey(),s.getValue().size());
            s.getValue().entrySet().stream().sorted((f,se)->{
                int sort = se.getValue() - f.getValue();
                if(sort == 0){
                    sort = sort= se.getValue().compareTo(f.getValue());
                }
                return sort;
            }).forEach(e->{

                System.out.printf("%d. %s <::> %d%n",num.getAndIncrement() ,e.getKey(),e.getValue());
                    });

        }

        System.out.println("Individual standings:");
        Map<String,Integer> totalPointsPerPerson = new LinkedHashMap<>();
        for (Map.Entry<String, Map<String, Integer>> st : contests.entrySet()) {
            for (Map.Entry<String, Integer> innerElem : st.getValue().entrySet()) {
              String name =  innerElem.getKey();
              totalPointsPerPerson.putIfAbsent(name,0);
              totalPointsPerPerson.put(name,totalPointsPerPerson.get(name) + innerElem.getValue());
            }
        }

        num.set(1);
        totalPointsPerPerson.entrySet().stream().sorted((f,se)->{
            int sort = se.getValue() - f.getValue();
            if(sort == 0){
                sort= se.getValue().compareTo(f.getValue());
            }
            return sort;
        }).forEach(e-> System.out.printf("%d. %s -> %d%n",num.getAndIncrement(),e.getKey(),e.getValue()));


    }
}
