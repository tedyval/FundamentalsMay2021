package MidExam;

import java.util.Scanner;

public class CounterStrike {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int initialEnergy = Integer.parseInt(scanner.nextLine());
        if(!(initialEnergy >= 1 && initialEnergy <= 10000)){
            return;
        }
        String input = scanner.nextLine();
        int countWon = 0;

        while(!input.equals("End of battle")){
            int distance = Integer.parseInt(input);
            if(!(distance >= 1 && distance <= 10000)){
                return;
            }
            if(initialEnergy >= distance){
                initialEnergy -= distance;
                countWon++;
                if(countWon % 3 == 0){
                    initialEnergy += countWon;
                }
            }else{

                System.out.printf("Not enough energy! Game ends with %d won battles and %d energy%n",countWon,initialEnergy);
                return;
            }



            input = scanner.nextLine();
        }

        if(initialEnergy >= 0) {
            System.out.printf("Won battles: %d. Energy left: %d",countWon,initialEnergy);
        }





    }
}
