package MapAdditional;

import java.util.*;
import java.util.stream.Collectors;

public class MOBAChallengerSecVariant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Map<String, Map<String, Integer>> players = new LinkedHashMap<>();
        while (!input.equals("Season end")) {
            if (input.contains(" -> ")) {
                String[] data = input.split(" -> ");
                String player = data[0];
                String position = data[1];
                int skill = Integer.parseInt(data[2]);
                players.putIfAbsent(player, new LinkedHashMap<>());

                if (players.get(player).containsKey(position) && players.get(player).get(position) < skill) {
                    players.get(player).put(position, skill);
                } else if (!players.get(player).containsKey(position) && players.get(player).values().stream().mapToInt(Integer::intValue).max().orElse(0) <= skill) {
                    players.get(player).put(position, skill);
                }


            } else if (input.contains(" vs ")) {
                String[] data = input.split(" vs ");
                String player1 = data[0];
                String player2 = data[1];
                if(players.containsKey(player1) && players.containsKey(player2)) {

                    List<String> positionsOfFirst = new ArrayList<>();
                    positionsOfFirst.addAll(players.get(player1).keySet());
                    List<String> positionsOfSecond = new ArrayList<>();
                    positionsOfSecond.addAll(players.get(player2).keySet());
                    List<String> copyOfFirstList = new ArrayList<>();

                    copyOfFirstList.addAll(positionsOfFirst);
                    copyOfFirstList.retainAll(positionsOfSecond);
                    if (!copyOfFirstList.isEmpty()) {
                        int sum1 = players.get(player1).values().stream().mapToInt(Integer::intValue).sum();
                        int sum2 = players.get(player2).values().stream().mapToInt(Integer::intValue).sum();
                        if (sum1 > sum2) {
                            players.remove(player2);
                        } else if (sum1 < sum2) {
                            players.remove((player1));
                        }
                    }
                }
            }
            input = scanner.nextLine();
        }

      players.entrySet().stream().sorted((e1,e2)-> {
          int sum1 = e1.getValue().values().stream().mapToInt(Integer::intValue).sum();
          int sum2 = e2.getValue().values().stream().mapToInt(Integer::intValue).sum();
          int result = Integer.compare(sum2,sum1);
          if(result == 0){
              result = e1.getKey().compareTo(e2.getKey());
              return  result;
          }
          return  result;
      }).forEach(e-> {
          int sum = e.getValue().values().stream().mapToInt(Integer::intValue).sum();
          System.out.printf("%s: %d skill%n",e.getKey(),sum);
          e.getValue().entrySet().stream().sorted((e1,e2)-> {
              int result = Integer.compare(e2.getValue(), e1.getValue());
              if (result == 0) {
                  result = e1.getKey().compareTo(e2.getKey());
                  return result;
              }
              return result;
          }).forEach(k-> System.out.printf("- %s <::> %d%n",k.getKey(),k.getValue()));
      });




    }
}
