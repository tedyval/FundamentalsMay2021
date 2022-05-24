package Meyhods;

import java.util.Scanner;

public class GraterOfTwoValues {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String typeOfVariable = scanner.nextLine();
        switch(typeOfVariable){
            case "int":
                int firstValue = Integer.parseInt(scanner.nextLine());
                int secondValue = Integer.parseInt(scanner.nextLine());
                System.out.println(getMaxInteger(firstValue,secondValue));
                break;
            case "char":
                char firstChar = scanner.nextLine().charAt(0);
                char secondChar = scanner.nextLine().charAt(0);
                System.out.println(getMaxChar(firstChar,secondChar));
                break;
            case "string":
                String firstString = scanner.nextLine();
                String secondString = scanner.nextLine();
                System.out.println(getMaxString(firstString,secondString));
                break;
        }




    }



    private static int getMaxInteger(int firstValue, int secondvalue){
        return Math.max(firstValue,secondvalue);
    }

    private static char getMaxChar(char firstChar, char secondChar){
        char max = 200;
        if(firstChar > secondChar){
            max = firstChar;
        }else{
            max = secondChar;
        }
        return max;
    }
    private static String getMaxString(String firstString,String secondString){
        String max = "";
        if(firstString.compareTo(secondString)>0){
            max = firstString;
        }else if(firstString.compareTo(secondString)<0){
            max = secondString;
        }
        return max;
    }

}
