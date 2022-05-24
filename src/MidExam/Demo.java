package MidExam;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = new ArrayList<>(Arrays.asList(2,30,4,5,60));
        long count = numbers.stream().filter(num -> num > 20).count();
        System.out.println(count);
        Integer sum = numbers.stream().mapToInt(Integer::intValue).sum();
        System.out.println(sum);
        numbers.subList(1,4).clear();
        System.out.println(numbers);




    }
}
