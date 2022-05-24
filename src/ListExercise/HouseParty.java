package ListExercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class HouseParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<String> names = new ArrayList<>();
        for (int i = 0; i <n ; i++) {
            List<String> commands =  Arrays.stream(scanner.nextLine().split("\\s+")).collect(Collectors.toList());
            String personName = commands.get(0);
            if(!commands.contains("not")) {
                if (names.contains(personName)) {
                    System.out.printf("%s is already in the list!%n",personName);
                } else {
                    names.add(personName);
                }
            }else{
                if (names.contains(personName)) {
                    names.remove(personName);
                } else {
                    System.out.printf("%s is not in the list!%n",personName);
                }
            }

        }

        for (String name : names) {
            System.out.println(name);

        }


    }
}
