package ExamPreparation;

import java.util.*;

public class PlantDiscovery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Map<String, Plant> plants = new LinkedHashMap<>();
        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            String[] plantData = input.split("<->");
            String name = plantData[0];
            double rarity = Double.parseDouble(plantData[1]);
            if (!plants.containsKey(name)) {
                Plant currentPlant = new Plant(name, rarity);
                plants.put(name, currentPlant);
            } else {
                plants.get(name).setRarity(rarity);
            }
        }

        String input2 = scanner.nextLine();
        while (!input2.equals("Exhibition")) {
            String[] commandData = input2.split(": ");
            String command = commandData[0];
            String commandDataLeft = commandData[1];
            String[] restData = commandDataLeft.split(" - ");
            String name = restData[0];
            if(!plants.containsKey(name)){
                System.out.println("error");
                input2 = scanner.nextLine();
                continue;
            }
            switch (command) {
                case "Rate":
                    double rating = Double.parseDouble(restData[1]);
                    plants.get(name).setRatings(rating);
                    break;
                case "Update":
                    double newRarity = Double.parseDouble(restData[1]);
                    plants.get(name).setRarity(newRarity);

                    break;
                case "Reset":
                    plants.get(name).getRatings().clear();
                    break;
                default:
                    System.out.println("error");
                    break;


            }


            input2 = scanner.nextLine();
        }

        System.out.println("Plants for the exhibition:");
        plants.entrySet().stream().sorted((e1,e2)-> {
            int result = Double.compare(e2.getValue().getRarity(),e1.getValue().getRarity());
            if(result == 0){
                double average2 = e2.getValue().getRatings().stream().mapToDouble(Double::doubleValue).average().orElse(0);
                double average1 = e1.getValue().getRatings().stream().mapToDouble(Double::doubleValue).average().orElse(0);
                result = Double.compare(average2,average1);
                return result;
            }
            return  result;
        }).forEach(e-> {
            double average = e.getValue().getRatings().stream().mapToDouble(Double::doubleValue).average().orElse(0);
            System.out.printf("- %s; Rarity: %.0f; Rating: %.2f%n",e.getKey(),e.getValue().getRarity(),average);
        });


    }
}

class Plant {
    String name;
    double rarity;
    List<Double> ratings;

    public  Plant(String name, double rarity) {
        this.name = name;
        this.rarity = rarity;
        this.ratings = new ArrayList<>();
    }

    public String getName() {
        return this.name;
    }

    public double getRarity() {
        return this.rarity;
    }

    public List<Double> getRatings() {
        return this.ratings;
    }

    public void setRarity(double rarity) {
        this.rarity = rarity;
    }

    public void setRatings(double rating) {
        this.ratings.add(rating);
    }

}
