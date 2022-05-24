package DataTypesAndVariablesLab;

import java.util.Scanner;

public class RefactorVolumeOfPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        double length, width, hight = 0;
        System.out.print("Length: ");
        length = Double.parseDouble(scanner.nextLine());
        System.out.print("Width: ");
        width = Double.parseDouble(scanner.nextLine());
        System.out.print("Height: ");
        hight = Double.parseDouble(scanner.nextLine());
        double volume = (length * width * hight) / 3;
        System.out.printf("Pyramid Volume: %.2f", volume);

    }
}
