package ListLab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MergingList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> firstList = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> secondList = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        int minList = Math.min(firstList.size(), secondList.size());
        List<Integer> mergedList = new ArrayList<>();

        for (int i = 0; i < minList; i++) {
            mergedList.add(firstList.get(i));
            mergedList.add(secondList.get(i));
        }

        if (firstList.size() > secondList.size()) {
            for (int i = minList; i < firstList.size(); i++) {
                mergedList.add(firstList.get(i));
            }
        } else {
            for (int i = minList; i < secondList.size(); i++) {
                mergedList.add(secondList.get(i));
            }

        }

        for (Integer integer : mergedList) {
            System.out.print(integer + " ");

        }


    }
}

