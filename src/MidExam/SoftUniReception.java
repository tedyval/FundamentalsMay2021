package MidExam;

import java.util.Scanner;

public class SoftUniReception {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        for (int i = 1; i <= 3; i++) {
            int servedPeoplePerEmployeeForHour = Integer.parseInt(scanner.nextLine());
            if(servedPeoplePerEmployeeForHour >=1 && servedPeoplePerEmployeeForHour <=100) {
                sum += servedPeoplePerEmployeeForHour;
            }else{
                return;
            }
        }

        int counter = 0;
        int restHours = 0;
        int students = Integer.parseInt(scanner.nextLine());
        if (students == 0) {
            System.out.printf("Time needed: %dh.", counter);
        } else if (students > 0 && students <= 10000) {

            while (students > 0) {

                if (students >= sum) {
                    counter++;
                    students -= sum;
                    if(students > 0) {
                        if (counter % 3 == 0) {
                            restHours++;
                        }
                    }
                } else if (students < sum) {
                    students = 0;
                    counter++;
                }

            }

            System.out.printf("Time needed: %dh.", counter + restHours);
        }


    }
}
