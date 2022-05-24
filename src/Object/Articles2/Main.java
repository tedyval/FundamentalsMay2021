package Object.Articles2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        List<Article> articles = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String[] articleFormat = scanner.nextLine().split(", ");
            Article article = new Article(articleFormat[0], articleFormat[1], articleFormat[2]);
            articles.add(article);

        }
        String input2 = scanner.nextLine();
        switch ((input2)){
            case "title":
                articles = articles.stream().sorted(Comparator.comparing(article -> article.getTitle())).collect(Collectors.toList());
                break;
            case "content":
                articles= articles.stream().sorted(Comparator.comparing(article -> article.getContent())).collect(Collectors.toList());
                break;
            case "author":
                articles = articles.stream().sorted(Comparator.comparing(Article::getAuthor)).collect(Collectors.toList());
                break;
        }

        articles.stream().forEach(System.out::println);


    }
}
