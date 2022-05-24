package MidExam1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class BonusScoringSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int studentsCount = Integer.parseInt(scanner.nextLine());
        int lectures = Integer.parseInt(scanner.nextLine());
        int additionalBonus = Integer.parseInt(scanner.nextLine());
        int attendances = 0;
        double totalBonus = 0;
        double max = 0;
        int countOfAttendances = 0;


        for (int i = 1; i <= studentsCount ; i++) {
            attendances = Integer.parseInt(scanner.nextLine());
            totalBonus = attendances * 1.0/ lectures * (5 + additionalBonus);
            if(totalBonus > max){
                max = totalBonus;
                countOfAttendances = attendances;
            }

        }
        System.out.printf("Max Bonus: %.0f.%n",max);
        System.out.printf("The student has attended %d lectures.",countOfAttendances);




    }
}
