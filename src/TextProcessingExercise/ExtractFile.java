package TextProcessingExercise;

import java.util.Scanner;

public class ExtractFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] data = scanner.nextLine().split("\\\\");
        String lastString = data[data.length - 1];
        String name = lastString.split("\\.")[0];
        String extension = lastString.split("\\.")[1];

        System.out.printf("File name: %s%n",name);
        System.out.printf("File extension: %s",extension);

    }
}
