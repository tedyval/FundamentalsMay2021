package Object.OrderByAge;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        List<Person> people = new ArrayList<>();
        while(!input.equals("End")){
            String[] data = input.split("\\s+");
            String name = data[0];
            String id = data[1];
            int age = Integer.parseInt(data[2]);
            Person person = new Person(name,id,age);
            people.add(person);
            input = scanner.nextLine();
        }

        people.stream().sorted(Comparator.comparingInt(person -> person.getAge())).collect(Collectors.toList()).forEach(person -> System.out.println(person));




    }
}
