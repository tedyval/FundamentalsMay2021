package DataTypesAndVariablesLab;

import java.util.Scanner;

public class LowerOrUpper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char letter = scanner.nextLine().charAt(0);
        if(letter >= 97){
            System.out.println("lower-case");
        } else if(letter >= 65 && letter < 97){
            System.out.println("upper-case");
        }












    }
}
