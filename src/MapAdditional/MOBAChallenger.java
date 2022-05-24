package MapAdditional;

import java.util.*;

public class MOBAChallenger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Map<String, Player> players = new LinkedHashMap<>();
        while (!input.equals("Season end")) {
            if (input.contains(" -> ")) {
                String[] commandData = input.split(" -> ");
                String player = commandData[0];
                String position = commandData[1];
                int skill = Integer.parseInt(commandData[2]);
                if (!players.containsKey(player)) {
                    Player currentPlayer = new Player(player, position, skill);
                    players.put(player, currentPlayer);
                } else {
                    if (players.get(player).getSkill().stream().mapToInt(Integer::intValue).max().getAsInt() < skill &&
                            players.get(player).getPosition().get(players.get(player).getPosition().size() - 1).equals(position)) {
                        int index = players.get(player).getPosition().indexOf(position);
                        players.get(player).getSkill().set(index, skill);

                    } else if (players.get(player).getSkill().stream().mapToInt(Integer::intValue).max().getAsInt() <= skill &&
                            !players.get(player).getPosition().get(players.get(player).getPosition().size() - 1).equals(position)) {
                        players.get(player).getSkill().add(skill);
                        players.get(player).getPosition().add(position);
                    }
                }

            } else if (input.contains(" vs ")) {
                String[] commandData = input.split(" vs ");
                String player1 = commandData[0];
                String player2 = commandData[1];

                if (players.containsKey(player2) && players.containsKey(player2)) {
                    List<String> copyOfListOfPlayer1 = new ArrayList<>();
                    copyOfListOfPlayer1.addAll(players.get(player1).getPosition());
                    copyOfListOfPlayer1.retainAll(players.get(player2).getPosition());
                    if (copyOfListOfPlayer1.size() > 0) {
                        int result = Integer.compare(players.get(player1).getSumPoints(), players.get(player2).getSumPoints());
                        if (result == -1) {
                            players.remove(player1);
                        } else if (result == 1) {
                            players.remove(player2);
                        }
                    }

                }


            }


            input = scanner.nextLine();
        }

        players.entrySet().stream().sorted((e1,e2)-> {
            int result = Integer.compare(e2.getValue().getSumPoints(),e1.getValue().getSumPoints());
            if(result == 0){
                result = e1.getKey().compareTo(e2.getKey());
                return  result;
            }
            return  result;
        }).forEach(e-> {
            System.out.printf("%s: %d skill%n",e.getKey(),e.getValue().getSumPoints());
            e.getValue().getSkill().stream().sorted((e1,e2)-> {
                int index1 = e.getValue().getSkill().indexOf(e1);
                int index2 = e.getValue().getSkill().indexOf(e2);
                int result = Integer.compare(e2,e1);
                if(result == 0){
                    result = e.getValue().getPosition().get(index1).compareTo(e.getValue().getPosition().get(index2));

                    return result;
                }
                return  result;

            }).forEach(k-> {
                int index = e.getValue().getSkill().indexOf(k);
                System.out.printf("- %s <::> %d%n"
                        ,e.getValue().getPosition().get(index),k);
            });
        });

    }
}

class Player {
    String player;
    List<String> position;
    List<Integer> skill;

    public Player(String player, String position, int skill) {
        this.player = player;
        this.position = new ArrayList<>();
        this.position.add(position);
        this.skill = new ArrayList<>();
        this.skill.add(skill);
    }

    public String getPlayer() {
        return player;
    }

    public List<String> getPosition() {
        return position;
    }

    public List<Integer> getSkill() {
        return skill;
    }

    public int getSumPoints() {
        int sum = 0;
        for (Integer integer : this.skill) {
            sum += integer;
        }
        return sum;

    }



}
