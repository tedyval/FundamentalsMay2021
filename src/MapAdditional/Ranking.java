package MapAdditional;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Ranking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Map<String,String> contestPassword = new LinkedHashMap<>();
        Map<String,Map<String,Integer>> users = new TreeMap<>();
        getMapContestPassword(scanner, input, contestPassword);
        String input2 = scanner.nextLine();
        while(!input2.equals("end of submissions")){
            String[] data2 = input2.split("=>");
            String contest = data2[0];
            String password = data2[1];
            String user = data2[2];
            int points = Integer.parseInt(data2[3]);
            if(!contestPassword.containsKey(contest) || !contestPassword.containsValue(password)){
                input2 = scanner.nextLine();
                continue;
            }
            Map<String,Integer> course = new LinkedHashMap<>();
            if(!users.containsKey(user)){
                users.put(user,course);
                course.put(contest,points);
            }else{
                if(!users.get(user).containsKey(contest)){
                    users.get(user).put(contest,points);
                }else{
                    if(users.get(user).get(contest) < points){
                        users.get(user).put(contest,points);
                    }
                }
            }

            input2 = scanner.nextLine();
        }

        int totalSum = 0;
        for (Map.Entry<String, Map<String, Integer>> s : users.entrySet()) {
            int sum =s.getValue().values().stream().mapToInt(i->i).sum();
            if(sum > totalSum){
                totalSum = sum;
            }
        }

        for (Map.Entry<String, Map<String, Integer>> usr : users.entrySet()) {
            if(usr.getValue().values().stream().mapToInt(i->i).sum() == totalSum){
                System.out.printf("Best candidate is %s with total %d points.%n",usr.getKey(),totalSum);
            }
        }

        System.out.println("Ranking: ");
        users.forEach((key,value)-> {
            System.out.printf("%s%n",key);
            value.entrySet().stream().sorted((f,s)-> s.getValue().compareTo(f.getValue())).forEach(e-> System.out.printf("#  %s -> %d%n",e.getKey(),e.getValue()));

        });


    }

    private static void getMapContestPassword(Scanner scanner, String input, Map<String, String> contestPassword) {
        while(!input.equals("end of contests")){
            String[] dataFirst = input.split(":");
            String contest = dataFirst[0];
            String password = dataFirst[1];
            contestPassword.putIfAbsent(contest,password);
            input = scanner.nextLine();
        }
    }
}
