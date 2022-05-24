package TextProcessingLab;

import java.util.Scanner;

public class Substring2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String researchedStr = scanner.nextLine();

        while(researchedStr.contains(str)){
            researchedStr = researchedStr.replace(str,"");
        }

        System.out.println(researchedStr);

    }
}
