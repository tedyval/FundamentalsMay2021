package MidExam;

import java.util.Arrays;
import java.util.Scanner;

public class HeartDelivery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();
        int counter3 =0;

        int[] numbers = Arrays.stream(line.split("@")).mapToInt(Integer::parseInt).toArray();
        for (int i = 0; i < line.length(); i+=1) {
            char current = line.charAt(i);
            if(current == '@'){
                counter3++;
            }

        }
        if(counter3 != numbers.length-1 ){
            return;
        }

        if(!(numbers.length >= 1 && numbers.length<= 20)){
            return;
        }

        for (int number : numbers) {
            if(number % 2 != 0){
                return;
            }else{
                if(!(number >= 2 && number <= 10)){
                    return;
                }
            }

        }

        int indexOfJumping = 0;
        int counter1= getCounter(numbers);
        if(counter1 == 0) {
            getProofedResult(numbers, indexOfJumping);
            return;
        }
        String input = scanner.nextLine();
        while (!input.equals("Love!")) {

            String[] commands = input.split(" ");
            if(commands.length < 2){
                return;
            }
            String command = commands[0];
            if(!command.equals("Jump")){
                input = scanner.nextLine();
                return;
            }


            int length = Integer.parseInt(commands[1]);
            if(!(length >= 1 && length<= 20)){
                return;
            }
            indexOfJumping +=length;
            if (indexOfJumping >= 0 && indexOfJumping < numbers.length) {
                if (numbers[indexOfJumping] == 0) {
                    System.out.printf("Place %d already had Valentine's day.%n", indexOfJumping);

                } else {
                    numbers[indexOfJumping] -= 2;
                    if (numbers[indexOfJumping] == 0) {
                        System.out.printf("Place %d has Valentine's day.%n", indexOfJumping);
                    }
                }
            } else {
                indexOfJumping = 0;
                if (numbers[0] > 0) {
                    numbers[0] -= 2;
                    if (numbers[indexOfJumping] == 0) {
                        System.out.printf("Place %d has Valentine's day.%n", indexOfJumping);
                    }
                } else {
                    if (numbers[indexOfJumping] == 0) {
                        System.out.printf("Place %d already had Valentine's day.%n", indexOfJumping);

                    }
                }
            }
            int counter = getCounter(numbers);
            if(counter == 0){
                System.out.printf("Cupid's last position was %d.%n", indexOfJumping);
                System.out.println("Mission was successful.");
                return;
            }else{
                input = scanner.nextLine();
            }


        }

        getProofedResult(numbers, indexOfJumping);


    }

    private static void getProofedResult(int[] numbers, int indexOfJumping) {
        System.out.printf("Cupid's last position was %d.%n", indexOfJumping);
        int counter = getCounter(numbers);

        if (counter == 0) {
            System.out.println("Mission was successful.");
        } else {
            System.out.printf("Cupid has failed %d places.", counter);
        }
    }

    private static int getCounter(int[] numbers) {
        int counter = 0;
        for (int number : numbers) {
            if (number != 0) {
                counter++;
            }
        }
        return counter;
    }
}
