package RegexExer;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Race {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String names = scanner.nextLine();
        String regexLetter = "[A-Za-z]";
        String regexDigit = "[\\d]";
        Pattern regLetter = Pattern.compile(regexLetter);
        Pattern regDigit = Pattern.compile(regexDigit);

        Map<String, Integer> nameDistance = new LinkedHashMap<>();
        String input = scanner.nextLine();
        while (!input.equals("end of race")) {
            List<Integer> digits = new ArrayList<>();
            StringBuilder letters = new StringBuilder();
            Matcher matcher = regDigit.matcher(input);

            while (matcher.find()) {
                digits.add(Integer.parseInt(matcher.group()));
            }

            int distance = digits.stream().mapToInt(Integer::intValue).sum();

            Matcher matcher2 = regLetter.matcher(input);
            while (matcher2.find()) {
                letters.append(matcher2.group());
            }
            String name = letters.toString();



            if (names.contains(name)) {
                if (!nameDistance.containsKey(name)) {
                    nameDistance.put(name, distance);
                } else {
                    nameDistance.put(name, nameDistance.get(name) + distance);
                }

            }

            input = scanner.nextLine();
        }

        List<String> places = new ArrayList<>(Arrays.asList("1st place", "2nd place", "3rd place"));
        Map<String, Integer> sortedMap = nameDistance.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).limit(3)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));

        for (int i = 0; i < places.size(); i++) {
            for (Map.Entry<String, Integer> sortElement : sortedMap.entrySet()) {
                System.out.printf("%s: %s%n", places.get(i), sortElement.getKey());
                i++;
            }

        }


    }
}
