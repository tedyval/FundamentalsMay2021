package Exam2021Fundamentals;

import java.util.Locale;
import java.util.Scanner;

public class Problem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        String input = scanner.nextLine();
        while(!input.equals("Done")){
          String[] data = input.split(" ");
          String command = data[0];
          switch(command){
              case "Change":
                  String charr = data[1];
                  String replacement = data[2];
                  while (text.contains(charr)){
                      text = text.replace(charr,replacement);
                  }
                  System.out.println(text);

                  break;
              case "Includes":
                  String otherString = data[1];
                  if(text.contains(otherString)){
                      System.out.println("True");
                  }else{
                      System.out.println("False");
                  }
                  break;
              case "End":
                  String otherString1 = data[1];
                  if(text.endsWith(otherString1)){
                      System.out.println("True");
                  }else{
                      System.out.println("False");
                  }
                  break;
              case "Uppercase":
                  text = text.toUpperCase();
                  System.out.println(text);

                  break;
              case "FindIndex":
                  char symboll = data[1].charAt(0);
                  int index = text.indexOf(symboll);
                  System.out.println(index);
                  break;
              case "Cut":
                  int startIndex = Integer.parseInt(data[1]);
                  int length = Integer.parseInt(data[2]);
                  String substring = text.substring(startIndex,startIndex + length);

                  System.out.println(substring);
                  break;
          }

            input = scanner.nextLine();
        }








    }
}
