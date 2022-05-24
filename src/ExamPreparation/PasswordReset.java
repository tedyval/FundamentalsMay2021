package ExamPreparation;

import java.util.Scanner;

public class PasswordReset {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstLine = scanner.nextLine();
        String input = scanner.nextLine();
        while(!input.equals("Done")){

            if(!input.contains(" ") && input.equals("TakeOdd")){
                StringBuilder newStr = new StringBuilder();
                for (int i = 0; i <firstLine.length() ; i++) {
                    if(i % 2 != 0){
                        char symbol = firstLine.charAt(i);
                        newStr.append(symbol);
                    }


                }
                firstLine = newStr.toString();
                System.out.println(firstLine);
            }else{
                String[] commandParts = input.split(" ");
                String command = commandParts[0];
                switch(command){
                    case "Cut":
                        int index = Integer.parseInt(commandParts[1]);
                        int lengthOfSubstr = Integer.parseInt(commandParts[2]);
                        String substring1 = firstLine.substring(index, index + lengthOfSubstr);
                        firstLine = firstLine.replaceFirst(substring1,"");
                        System.out.println(firstLine);
                        break;
                    case "Substitute":
                        String substring = commandParts[1];
                        String substitute = commandParts[2];
                        if(firstLine.contains(substring)){
                            while(firstLine.contains(substring)){
                            firstLine = firstLine.replace(substring,substitute);
                            }
                            System.out.println(firstLine);
                        }else{
                            System.out.println("Nothing to replace!");
                        }
                        break;
                }

            }

            input = scanner.nextLine();
        }

        System.out.printf("Your password is: %s",firstLine);









    }
}
