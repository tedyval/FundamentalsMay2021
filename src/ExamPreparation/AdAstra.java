package ExamPreparation;



import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AdAstra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        String regex = "(#|\\|)(?<name>[A-Za-z\\s]+)(\\1)(?<date>([012][0-9]|[3][01])\\/([0][1-9]|[1][012])\\/([0-9][0-9]))(\\1)(?<calories>[1]?[0-9]?[0-9]?[0-9]?[0-9])(\\1)";
        Pattern regFood = Pattern.compile(regex);
        Matcher machFood = regFood.matcher(text);
        List<Food> foods = new ArrayList<>();
        int sum = 0;
        while(machFood.find()){
            String name = machFood.group("name");
            String date = machFood.group("date");
            int calories = Integer.parseInt(machFood.group("calories"));
            Food currentFood = new Food(name,date,calories);
            foods.add(currentFood);
            sum += calories;
        }

        int days = sum / 2000;
        System.out.printf("You have food to last you for: %d days!%n",days);
        foods.stream().forEach(e-> System.out.printf("Item: %s, Best before: %s, Nutrition: %d%n",e.getName(),e.getDate(),e.getCalories()));











    }
}
class Food{
    String name;
    String date;
    int calories;

    public Food(String name,String date, int calories){
        this.name = name;
        this.date = date;
        this.calories = calories;
    }

    public String getName() {
        return name;
    }

    public String getDate() {
        return date;
    }

    public int getCalories() {
        return calories;
    }
}
