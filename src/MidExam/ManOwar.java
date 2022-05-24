package MidExam;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ManOwar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> pirateShip = Arrays.stream(scanner.nextLine().split(">")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> warship = Arrays.stream(scanner.nextLine().split(">")).map(Integer::parseInt).collect(Collectors.toList());
        int maxHealthCapacity = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();
        while (!input.equals("Retire")) {
            String command = input.split("\\s+")[0];
            switch (command) {
                case "Fire":
                    int index1 = Integer.parseInt(input.split("\\s+")[1]);
                    int damage = Integer.parseInt(input.split("\\s+")[2]);
                    if (index1 >= 0 && index1 < warship.size()) {
                        if (warship.get(index1) - damage <= 0) {
                            System.out.println("You won! The enemy ship has sunken.");
                            return;
                        }else{
                            warship.set(index1, (warship.get(index1) - damage));
                        }
                    }
                    break;
                case "Defend":
                    index1 = Integer.parseInt(input.split("\\s+")[1]);
                    int index2 = Integer.parseInt(input.split("\\s+")[2]);
                    damage = Integer.parseInt(input.split("\\s+")[3]);

                    if (index1 >= 0 && index2 < pirateShip.size()) {
                        for (int i = index1; i <= index2; i++) {
                            if (pirateShip.get(i) - damage <= 0) {
                                System.out.println("You lost! The pirate ship has sunken.");
                                return;
                            }else{
                                pirateShip.set(i, (pirateShip.get(i) - damage));
                            }
                        }
                    }
                    break;
                case "Repair":
                    index1 = Integer.parseInt(input.split("\\s+")[1]);
                    int health = Integer.parseInt(input.split("\\s+")[2]);
                    if (index1 >= 0 && index1 < pirateShip.size()) {
                        if ((pirateShip.get(index1) + health) <= maxHealthCapacity) {
                            pirateShip.set(index1, (pirateShip.get(index1) + health));
                        }else{
                            pirateShip.set(index1, maxHealthCapacity);
                        }
                    }
                    break;
                case "Status":
                    int counter = 0;
                    for (int i = 0; i < pirateShip.size(); i++) {
                        if (pirateShip.get(i) < (0.2 * maxHealthCapacity)) {
                            counter++;
                        }
                    }
                    System.out.printf("%d sections need repair.%n", counter);
                    break;
            }


            input = scanner.nextLine();
        }

        int pirateShipSum = getShipSum(pirateShip);
        int warshipSum = getShipSum(warship);


        System.out.printf("Pirate ship status: %d%n", pirateShipSum);
        System.out.printf("Warship status: %d", warshipSum);


    }

    private static int getShipSum(List<Integer> pirateShip) {
        int pirateShipSum = 0;
        for (Integer integer : pirateShip) {
            pirateShipSum += integer;
        }
        return pirateShipSum;
    }
}
