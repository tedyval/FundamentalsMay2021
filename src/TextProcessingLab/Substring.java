package TextProcessingLab;

import java.util.Scanner;

public class Substring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String secondStr = scanner.nextLine();
        StringBuilder newStr = new StringBuilder(secondStr);
        while(secondStr.contains(str)){
            int startIndex = secondStr.indexOf(str);
            int length = str.length();
            newStr.delete(startIndex,startIndex + length);
            secondStr = newStr.toString();
        }

        System.out.println(newStr);






    }
}
