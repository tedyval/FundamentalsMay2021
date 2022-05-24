package ExamPreparation;

import java.sql.SQLOutput;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Pirates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        Map<String,Town> townData = new LinkedHashMap<>();
        while(!input.equals("Sail")){
            String[] parts = input.split("(\\|\\|)");
            String town = parts[0];
            int population = Integer.parseInt(parts[1]);
            int gold = Integer.parseInt(parts[2]);
            Town currentTown = new Town(town, population,gold);

            if(!townData.containsKey(town)){
               townData.put(town,currentTown);
            }else{
                townData.get(town).setGold(townData.get(town).getGold() + gold);
                townData.get(town).setPopulation(townData.get(town).getPopulation() + population);
            }


            input = scanner.nextLine();
        }


        while (!input.equals("End")){
            String[] commandParts = input.split("(=>)");
            String command = commandParts[0];
            switch(command){
                case "Plunder":
                    String town = commandParts[1];
                    int people = Integer.parseInt(commandParts[2]);
                    int gold = Integer.parseInt(commandParts[3]);
                    System.out.printf("%s plundered! %d gold stolen, %d citizens killed.%n",town,gold,people);
                    townData.get(town).setGold(townData.get(town).getGold() - gold);
                    townData.get(town).setPopulation(townData.get(town).getPopulation() -people);
                    if(townData.get(town).getGold() == 0 || townData.get(town).getPopulation() == 0){
                        townData.remove(town);
                        System.out.printf("%s has been wiped off the map!%n",town);
                    }

                    break;
                case "Prosper":
                    String city = commandParts[1];
                    int goldToBeAdded = Integer.parseInt(commandParts[2]);
                    if(goldToBeAdded < 0){
                        System.out.println("Gold added cannot be a negative number!");
                    }else {
                        townData.get(city).setGold(townData.get(city).getGold() + goldToBeAdded);
                        System.out.printf("%d gold added to the city treasury. %s now has %d gold.%n",goldToBeAdded,city,townData.get(city).getGold());
                    }
                    break;
            }

            input = scanner.nextLine();
        }


        if(townData.size() > 0 ){
            System.out.printf("Ahoy, Captain! There are %d wealthy settlements to go to:%n",townData.size());
            townData.entrySet().stream().sorted((e1,e2)->{
                    int result = Integer.compare(e2.getValue().getGold(),e1.getValue().getGold());
                if(result == 0){
                    return e1.getValue().getName().compareTo(e2.getValue().getName());
                }
                return result;
            }).forEach(e-> System.out.printf("%s -> Population: %s citizens, Gold: %d kg%n",e.getKey(),e.getValue().getPopulation(),e.getValue().getGold()));
        }else if(townData.size() == 0){
            System.out.println("Ahoy, Captain! All targets have been plundered and destroyed!");

        }








    }
}

 class Town{
    String name;
    int population;
     int gold;

     public int getGold() {
         return gold;
     }



     public String getName() {
         return name;
     }

     public int getPopulation() {
         return population;
     }



     public  Town(String name, int population, int gold){
       this.name = name;
       this.population = population;
       this.gold = gold;
    }


     public void setGold(int gold) {
         this.gold = gold;
     }

     public void setPopulation(int population) {
         this.population = population;
     }
 }
