package ExamPreparation;

import java.util.Scanner;

public class TheImitationGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String encryptedMessage = scanner.nextLine();
        String input = scanner.nextLine();
        while(!input.equals("Decode")){
            String[] commandParts = input.split("\\|");
            String command = commandParts[0];
            switch(command){
                case "Move":
                    int numberOfLetters = Integer.parseInt(commandParts[1]);
                    String toBeMoved = encryptedMessage.substring(0,numberOfLetters);
                    encryptedMessage = encryptedMessage.replace(toBeMoved,"");
                    encryptedMessage = encryptedMessage + toBeMoved;
                    break;
                case "Insert":
                    int index = Integer.parseInt(commandParts[1]);
                    String value = commandParts[2];
                    StringBuilder newMessage = new StringBuilder(encryptedMessage);
                   encryptedMessage = newMessage.insert(index,value).toString();

                   break;
                case "ChangeAll":
                    String substring = commandParts[1];
                    String replacement = commandParts[2];
                    while(encryptedMessage.contains(substring)){
                        encryptedMessage = encryptedMessage.replace(substring,replacement);
                    }
                    break;
            }

            input = scanner.nextLine();
        }

        System.out.printf("The decrypted message is: %s",encryptedMessage);






    }
}
