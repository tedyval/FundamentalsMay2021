package MapExercise;

import com.sun.source.tree.Tree;

import java.util.*;

public class SoftUniExamResults {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Map<String, List<Integer>> userPoints = new TreeMap<>();
        Map<String, List<String>> coursesNames = new LinkedHashMap<>();
        Map<String, Integer> courseSubmissions = new TreeMap<>();
        String name = "";
        String language = "";
        int points = 0;
        List<String> languages = new ArrayList<>();
        while (!input.equals("exam finished")) {
            String[] data = input.split("-");
            languages.add(data[1]);

            if (data.length == 3) {
                name = data[0];
                language = data[1];
                points = Integer.parseInt(data[2]);
                if(!coursesNames.containsKey(language)){
                    coursesNames.put(language,new ArrayList<>());
                    coursesNames.get(language).add(name);
                }else{
                    if(!coursesNames.get(language).contains(name)){
                        coursesNames.get(language).add(name);
                    }
                }


                if (!userPoints.containsKey(name)) {
                    userPoints.put(name, new ArrayList<>());
                    int indexOfLangInList = language.indexOf(language);
                    userPoints.get(name).add(indexOfLangInList,points);
                } else {
                    int indexOfLangInList = language.indexOf(language);
                    userPoints.get(name).set(indexOfLangInList,points);

                }

                if (!courseSubmissions.containsKey(language)) {
                    courseSubmissions.put(language, 1);
                } else {
                    courseSubmissions.put(language, courseSubmissions.get(language) + 1);
                }
            } else if (data.length == 2 && data[1].equals("banned")) {
                name = data[0];
                String command = data[1];
                userPoints.remove(name);
            }


            input = scanner.nextLine();
        }

//        if (userPoints.size() > 0 && courseSubmissions.size() > 0){
//            System.out.println("Results:");
//            userPoints.entrySet().stream().sorted(e -> e.getValue().stream())
//                    .forEach(e -> {
//                        e.getValue().stream().forEach();
//                        System.out.printf("%s | %d%n", e.getKey(), e.getValue())
//            });


//        }

    }
}

