package MidExam;

import java.util.Scanner;

public class BonusScoringSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countOfStudents = Integer.parseInt(scanner.nextLine());
        int numberOfLectures = Integer.parseInt(scanner.nextLine());
        int additionalBonus = Integer.parseInt(scanner.nextLine());
        double max = 0;
        int attendancesOfMaxStudent = 0;
        for (int i = 0; i <countOfStudents ; i++) {
            int attendances = Integer.parseInt(scanner.nextLine());
            double totalBonus = attendances * 1.0 / numberOfLectures * (5 + additionalBonus);
            if(totalBonus > max){
                max = totalBonus;
                int index = i;
                attendancesOfMaxStudent = attendances;
            }
        }

        System.out.printf("Max Bonus: %.0f.%n",Math.ceil(max));
        System.out.printf("The student has attended %d lectures.",attendancesOfMaxStudent);





    }
}
