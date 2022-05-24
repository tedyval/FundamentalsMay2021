package MidExam;

import java.util.Scanner;

public class BlackFlag {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        if(!(days >= 0 && days <= 100000)){
            return;
        }

        int dailyPlunder = Integer.parseInt(scanner.nextLine());
        if(!(dailyPlunder >= 0 && dailyPlunder <= 50)){
            return;
        }

        double expectedPlunder = Double.parseDouble(scanner.nextLine());
        if(!(expectedPlunder >= 0.0 && expectedPlunder <= 10000.0)){
            return;
        }

        double sum = 0;
        for (int i = 1; i <= days ; i++) {
            if(i % 3 == 0 && i % 5 != 0){
                sum += 0.5 * dailyPlunder;
                sum += dailyPlunder;
            }else if(i % 5 == 0 && i % 3 != 0){
                sum += dailyPlunder;
                sum *=0.70;
            }else if(i % 3 == 0 && i % 5 == 0){
                sum += 0.5 * dailyPlunder;
                sum += dailyPlunder;
                sum *=0.70;
            }else{
                sum += dailyPlunder;
            }

        }
        if(sum >= expectedPlunder){
            System.out.printf("Ahoy! %.2f plunder gained.",sum);
        }else if(sum < expectedPlunder){
            double percentage = (sum / expectedPlunder) * 100;
            System.out.printf("Collected only %.2f%% of the plunder.",percentage);
        }









    }
}
