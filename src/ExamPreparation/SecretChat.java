package ExamPreparation;

import java.util.Scanner;

public class SecretChat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String message =  scanner.nextLine();
        String input = scanner.nextLine();
        while (!input.equals("Reveal")){
            String[] commandParts = input.split("(:\\|:)");
            String command = commandParts[0];
            switch(command){
                case "InsertSpace":
                    int index = Integer.parseInt(commandParts[1]);
                    StringBuilder st = new StringBuilder(message);
                    st.insert(index," ");
                    message = st.toString();
                    System.out.println(message);
                    break;
                case "Reverse":
                    String substring = commandParts[1];
                    if(message.contains(substring)){
                        int startIndex = message.indexOf(substring);
                        StringBuilder message1 = new StringBuilder(message);
                        message1.delete(startIndex,startIndex + substring.length());
                        StringBuilder str = new StringBuilder(substring);
                        str.reverse();
                        str.insert(0,message1);
                        message = str.toString();
                        System.out.println(message);
                    }else{
                        System.out.println("error");
                    }
                    break;
                case "ChangeAll":
                    String substring1 = commandParts[1];
                    String substitute = commandParts[2];
                    while(message.contains(substring1)){
                        message = message.replace(substring1,substitute);

                    }
                    System.out.println(message);
                    break;
            }

            input = scanner.nextLine();
        }

        System.out.printf("You have a new text message: %s",message);







    }
}
