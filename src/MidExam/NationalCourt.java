package MidExam;

import java.util.Scanner;

public class NationalCourt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int servedPersons = 0;
        for (int i = 1; i <= 3 ; i++) {
            int personPerEmployee = Integer.parseInt(scanner.nextLine());
            servedPersons += personPerEmployee;
        }

        int counter = 0;
        int counter1 =0;
        int personsInQueue  = Integer.parseInt(scanner.nextLine());

        while(personsInQueue > 0) {
            if (personsInQueue > servedPersons) {
                counter++;
                if(counter % 3 == 0){
                    counter1++;
                }
                personsInQueue -= servedPersons;
            }else{
                counter++;
                personsInQueue = 0;
            }
        }

        System.out.printf("Time needed: %dh.",(counter+counter1));






    }
}
