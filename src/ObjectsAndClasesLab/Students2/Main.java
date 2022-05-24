package ObjectsAndClasesLab.Students2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        List<Students> people = new ArrayList<>();
        int count = 0;
        while (!input.equals("end")) {
            count++;
            String[] elements = input.split("\\s+");
            String firstName = elements[0];
            String lastName = elements[1];
            int age = Integer.parseInt(elements[2]);
            String homeTown = elements[3];
            Students existingStudent = null;
            for (Students person : people) {
                if(person.getFirstName().equals(firstName) && person.getLastName().equals(lastName) ){
                    existingStudent = person;
                }
            }
            if(existingStudent == null){
                Students student = new Students(firstName,lastName,age,homeTown);
                people.add(student);
            } else{
             existingStudent.setFirstName(firstName);
             existingStudent.setLastName(lastName);
             existingStudent.setAge(age);
             existingStudent.setHomeTown(homeTown);
            }



            input = scanner.nextLine();
        }

        String input2 = scanner.nextLine();
        people = people.stream().filter(student -> student.getHomeTown().equals(input2)).collect(Collectors.toList());
        people.stream().forEach(p -> System.out.println(p));

    }
}

