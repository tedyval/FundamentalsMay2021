package Object.Students;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        List<Student> students = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split("\\s+");
            String firstName = input[0];
            String lastName = input[1];
            double grade = Double.parseDouble(input[2]);
            Student student = new Student(firstName,lastName,grade);
            students.add(student);
        }
        students = students.stream().sorted(Comparator.comparingDouble(Student::getGrade)).collect(Collectors.toList());
        Collections.reverse(students);
        students.forEach(s -> System.out.println(s));



    }
}
