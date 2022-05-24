package ArrayLab;

import java.util.Arrays;
import java.util.Scanner;

public class EqualArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] firstArray = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int[] secondArray = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        if(firstArray.length != secondArray.length){
            System.out.println("Arrays are not identical");
        }else {
            int sum = 0;
            boolean isIdentical = true;
            for (int num = 0; num < firstArray.length; num++) {
                if(firstArray[num] != secondArray[num]) {
                    isIdentical = false;
                    System.out.printf("Arrays are not identical. Found difference at %d index.",num);
                    break;
                }else{
                    sum += firstArray[num];
                }
            }
            if(isIdentical) {
                System.out.printf("Arrays are identical. Sum: %d", sum);
            }
        }





    }
}
