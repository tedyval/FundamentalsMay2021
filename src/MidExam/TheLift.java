package MidExam;

import java.util.Arrays;
import java.util.Scanner;

public class TheLift {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int waitingPeople = Integer.parseInt(scanner.nextLine());
        int[] wagons = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int index = 0;
        while(waitingPeople > 0) {

            for (int i = 0; i < wagons.length; i++) {
                int diff = 4 - wagons[i];
                if (diff > 0) {
                    if (waitingPeople >= diff) {
                        wagons[i] = 4;
                        waitingPeople -= diff;
                        if (waitingPeople == 0) {
                            index = i;
                            break;
                        }
                    } else if (waitingPeople < diff) {
                        wagons[i] += waitingPeople;
                        waitingPeople = 0;
                        index = i;
                        break;
                    }
                }
            }
            break;
        }

        int sum = 0;
        for (int i = index; i < wagons.length ; i++) {
            if(wagons[i] < 4){
               sum += (4 - wagons[i]);
            }
        }

        String output = Arrays.toString(wagons).replaceAll("[\\[\\],]","");

        if(waitingPeople == 0 && sum != 0){
            System.out.println("The lift has empty spots!");
            System.out.println(output);
        }else if(waitingPeople > 0 && sum == 0){
            System.out.printf("There isn't enough space! %d people in a queue!%n",waitingPeople);
            System.out.println(output);
        }else if(waitingPeople == 0 && sum == 0){
            System.out.println(output);
        }






    }
}
