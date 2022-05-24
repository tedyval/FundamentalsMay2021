package Meyhods;

import java.util.Scanner;

public class CalculateRectangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double width = Double.parseDouble(scanner.nextLine());
        double length = Double.parseDouble(scanner.nextLine());
        double area = getAreaOfRectangle(width,length);
        System.out.printf("%.0f",area);
    }
    private static Double getAreaOfRectangle(Double width, Double length){
        return width * length;
    }
}
