package MidExam;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ArrayModifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] numAsStrings = scanner.nextLine().split(" ");
        List<BigInteger> array = new ArrayList<>(numAsStrings.length);
        for (int i = 0; i < numAsStrings.length; i++) {
            BigInteger element = new BigInteger(numAsStrings[i]);
            array.add(element);
        }

        String input = scanner.nextLine();
        while(!input.equals("end")){

            String[]commands = input.split(" ");
            String command = commands[0];



            switch(command){
                case "swap":
                    int index1 = Integer.parseInt(commands[1]);
                    int index2 = Integer.parseInt(commands[2]);

                        BigInteger temp = array.get(index1);
                        array.set(index1,array.get(index2));
                        array.set(index2,temp);

                    break;
                case "multiply":
                    index1 = Integer.parseInt(commands[1]);
                    index2 = Integer.parseInt(commands[2]);
                    BigInteger firstNum = new BigInteger(String.valueOf(array.get(index1)));
                    BigInteger secondNum = new BigInteger(String.valueOf(array.get(index2)));
                    BigInteger result= firstNum.multiply(secondNum);
                    array.set(index1,result);
                    break;
                case "decrease":
                    for (int i = 0; i < array.size(); i++) {
                        BigInteger newValue = array.get(i).subtract(BigInteger.ONE);
                        array.set(i,newValue);
                    }
                    break;
            }

            input = scanner.nextLine();
        }

        for (int i = 0; i <= array.size()-2; i++) {
            System.out.print(array.get(i) + ", ");
        }
        System.out.print(array.get(array.size()-1));


    }
}
