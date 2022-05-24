package RegexExer;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class demo {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        StringBuilder sb = new StringBuilder();

        String regex = "\\s[A-Za-z0-9]+[-_.]?[A-Za-z0-9]+@([A-Za-z]+[-]?[A-Za-z]+\\.)+[A-Za-z]+";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        while (matcher.find()) {
            sb.append(matcher.group() + "\n");
        }

        System.out.println(sb);

    }
}
