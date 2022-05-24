package MapExercise;

import java.util.*;

public class Courses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Map<String, List<String>> courseNames = new LinkedHashMap<>();
        while(!input.equals("end")){
            String[] data = input.split(" : ");
            String course = data[0];
            String name = data[1];
            if(!courseNames.containsKey(course)){
                courseNames.put(course, new ArrayList<>());
                courseNames.get(course).add(name);
            }else{
                courseNames.get(course).add(name);
            }

            input = scanner.nextLine();
        }


        courseNames.entrySet().stream()
                .sorted((e1,e2) -> Integer.compare(e2.getValue().size(),e1.getValue().size()))
                .forEach(e -> {
                    System.out.printf("%s: %d%n",e.getKey(),e.getValue().size());
                    List<String> names = e.getValue();
                    names.stream().sorted().forEach(entry -> System.out.printf("-- %s%n",entry));
                });




    }
}
