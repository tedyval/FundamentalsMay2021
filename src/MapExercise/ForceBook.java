package MapExercise;

import java.util.*;

public class ForceBook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Map<String, List<String>> userToSide = new TreeMap<>();

        while (!input.equals("Lumpawaroo")) {
            String userForce = "";
            String userSide = "";
            boolean isFound = true;
            if (input.contains("|")) {
                String[] data = input.split(" \\| ");
                userForce = data[1];
                userSide = data[0];
                if (!userToSide.containsKey(userSide)) {
                    userToSide.put(userSide, new ArrayList<>());
                }
                for (List<String> value : userToSide.values()) {
                    if (!value.contains(userForce)) {
                        isFound = false;
                    }
                }
                if (isFound == false) {
                    userToSide.get(userSide).add(userForce);

                }
            } else if (input.contains("->")) {
                String[] data = input.split(" -> ");
                userSide = data[1];
                userForce = data[0];
                if (!userToSide.containsKey(userSide)) {
                    userToSide.put(userSide, new ArrayList<>());
                }
                for (List<String> value : userToSide.values()) {
                    if (!value.contains(userForce)) {
                        isFound = false;

                    } else {
                        value.remove(userForce);


                    }
                }
                if (isFound == false) {
                    userToSide.get(userSide).add(userForce);
                    System.out.printf("%s joins the %s side!%n", userForce, userSide);

                }else{
                    userToSide.get(userSide).add(userForce);
                    System.out.printf("%s joins the %s side!%n", userForce, userSide);
                }

            }


            input = scanner.nextLine();
        }

        userToSide.entrySet().stream().sorted((e1, e2) -> Integer.compare(e2.getValue().size(), e1.getValue().size())).forEach(e -> {
            if(e.getValue().size() != 0) {
                System.out.printf("Side: %s, Members: %d%n", e.getKey(), e.getValue().size());
                e.getValue().stream().sorted().forEach(l -> System.out.printf("! %s%n", l));
            }
        });


    }
}
