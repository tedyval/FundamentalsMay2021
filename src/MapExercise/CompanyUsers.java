package MapExercise;

import java.util.*;

public class CompanyUsers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Map<String, List<String>> companyEmployee = new LinkedHashMap<>();
        while (!input.equals("End")) {
            String[] data = input.split(" -> ");
            String company = data[0];
            String id = data[1];

            if (!companyEmployee.containsKey(company)) {
                companyEmployee.put(company, new ArrayList<>());
                companyEmployee.get(company).add(id);
            }else if(companyEmployee.containsKey(company) && !companyEmployee.get(company).contains(id)){
                companyEmployee.get(company).add(id);
            }

            input = scanner.nextLine();
        }

        if(companyEmployee.size() >= 2) {
            companyEmployee.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(e -> {
                System.out.println(e.getKey());
                e.getValue().stream().forEach(i -> System.out.printf("-- %s%n", i));

            });
        }else{
            companyEmployee.forEach((key, value) -> {
                System.out.println(key);
                value.stream().forEach(c -> System.out.printf("-- %s", c));
            });
        }


    }
}
