package ListExercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MyTask {
    public static void main(String[] args) {

        List<Integer> original = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        List<Integer> firstList = original.subList(0,3);
        List<Integer> secondList = original.subList(3,7);
        List<Integer> thirdList = original.subList(7,10);

        List<Integer> result = new ArrayList<>();
        result.addAll(thirdList);
        result.addAll(secondList);
        result.addAll(firstList);



        System.out.print(result);



    }
}
