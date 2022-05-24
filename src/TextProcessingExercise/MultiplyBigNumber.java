package TextProcessingExercise;

import java.util.Scanner;

public class MultiplyBigNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] digits = input.split("");
        String num = scanner.nextLine();
        int result = 0;
        int sum = 0;
        int counter = 0;
        StringBuilder productNum = new StringBuilder();
        if (num.equals("0") || input.equals("0")) {
            System.out.println("0");
        } else if (input.charAt(0)== '-' || input.length() > Math.pow(10,50)) {
            if(!(Integer.parseInt(num) >=0 && Integer.parseInt(num) <=9)){
                return;
            }

        } else {
            for (int i = digits.length - 1; i >= 0; i--) {
                counter++;
                if (counter == 1) {
                    result = Integer.parseInt(digits[i]) * Integer.parseInt(num);
                    int digit = result % 10;
                    productNum.append(digit);
                    int intermediate = result / 10;
                    sum += intermediate;
                    if (counter == digits.length && sum != 0) {

                        productNum.append(sum);
                        break;
                    }
                } else {
                    result = Integer.parseInt(digits[i]) * Integer.parseInt(num) + sum;
                    sum = 0;
                    int digit = result % 10;
                    productNum.append(digit);
                    int intermediate = result / 10;
                    sum += intermediate;
                    if (counter == digits.length && sum != 0) {

                        productNum.append(sum);
                        break;
                    }

                }

            }
        }
        System.out.println(productNum.reverse());


    }
}
