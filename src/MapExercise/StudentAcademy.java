package MapExercise;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;

public class StudentAcademy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        Map<String , List<Double>> nameGrades = new TreeMap<>();
        for (int i = 0; i < number; i++) {
            String name = scanner.nextLine();
            double grade = Double.parseDouble(scanner.nextLine());

            if(!nameGrades.containsKey(name)){
                nameGrades.put(name, new ArrayList<>());
                nameGrades.get(name).add(grade);
            }else{
                nameGrades.get(name).add(grade);
            }
        }

       Map<String, Double>  nameAverageGrade = nameGrades.entrySet().stream().collect(Collectors.toMap(Map.Entry:: getKey,e ->
               e.getValue().stream().mapToDouble(Double::doubleValue).average().orElse(0),(e1,e2) -> e1, TreeMap::new));
       nameAverageGrade.entrySet().stream().filter(e -> e.getValue() >= 4.50).sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).forEach((e->
               System.out.printf("%s -> %.2f%n",e.getKey(),e.getValue())));








    }
}
