package MapExercise;

import java.util.*;

public class LegendaryFarming {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        int counter = 0;
        Map<String, Integer> keyMaterials = new TreeMap<>();
        keyMaterials.put("shards", 0);
        keyMaterials.put("fragments", 0);
        keyMaterials.put("motes", 0);
        Map<String, Integer> junk = new TreeMap<>();
        int number = 0;
        String material = " ";
        String obtainedItem = " ";
        boolean isObtained = false;
        while (true) {
            String[] input = scanner.nextLine().split(" ");
            for (int i = 0; i < input.length; i++) {
                counter++;
                if (counter > 2) {
                    counter = 1;
                }


                if (counter == 1) {
                    number = Integer.parseInt(input[i]);
                } else if (counter == 2) {
                    material = input[i].toLowerCase();
                }


                if (counter == 2) {
                    if (material.equals("shards") || material.equals("fragments") || material.equals("motes")) {
                        int currentNum = keyMaterials.get(material);
                        keyMaterials.put(material, currentNum + number);

                        if (keyMaterials.get(material) >= 250) {
                            isObtained = true;

                            obtainedItem = material;
                            int restMaterial = keyMaterials.get(material) - 250;
                            keyMaterials.put(material, restMaterial);
                            String gainedItem = " ";
                                switch (obtainedItem) {
                                    case "shards":
                                        gainedItem = "Shadowmourne";
                                        System.out.printf("%s obtained!%n", gainedItem);
                                        break;
                                    case "fragments":
                                        gainedItem = "Valanyr";
                                        System.out.printf("%s obtained!%n", gainedItem);
                                        break;
                                    case "motes":
                                        gainedItem = "Dragonwrath";
                                        System.out.printf("%s obtained!%n", gainedItem);
                                        break;

                                }



                            keyMaterials.entrySet().stream().sorted((e1,e2) -> {
                                if(e1.getValue().equals(e2.getValue())){
                                    return e1.getKey().compareTo(e2.getKey());
                                }else{
                                    return e2.getValue() - e1.getValue();
                                }
                            }).forEach(e -> System.out.println(e.getKey().toLowerCase() + ": " + e.getValue()));
                            junk.entrySet().stream().forEach(e -> System.out.println(e.getKey().toLowerCase() + ": " + e.getValue()));

                            break;
                        }

                    } else {
                        if (!junk.containsKey(material)) {
                            junk.put(material, number);
                        } else {
                            int currentCount = junk.get(material);
                            junk.put(material, currentCount + number);
                        }
                    }


                }

            }
           if(isObtained == true){
               break;
           }

        }

    }

}
