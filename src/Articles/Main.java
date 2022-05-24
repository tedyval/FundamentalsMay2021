package Articles;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] articleFormat = scanner.nextLine().split(", ");
        Article article = new Article(articleFormat[0],articleFormat[1],articleFormat[2]);
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String[] commands = scanner.nextLine().split(": ");
            switch(commands[0]){
                case "Edit":
                    article.edit(commands[1]);
                    break;
                case "ChangeAuthor":
                    article.changeAuthor(commands[1]);
                    break;
                case "Rename":
                    article.rename(commands[1]);
                    break;
            }


        }
        System.out.println(article.toString());



    }
}
