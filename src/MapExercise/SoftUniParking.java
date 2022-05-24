package MapExercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class SoftUniParking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       int number = Integer.parseInt(scanner.nextLine());
        Map<String, String> userLicenseNumber = new LinkedHashMap<>();

        for (int i = 0; i < number; i++) {

            String[] data = scanner.nextLine().split(" ");
            String command = data[0];
            switch (command){
                case "register":

                    String username = data[1];
                    String licensePlateNumber = data[2];

                        if(!userLicenseNumber.containsKey(username)){
                            userLicenseNumber.put(username,licensePlateNumber);
                            System.out.printf("%s registered %s successfully%n",username,licensePlateNumber);
                        }else{
                            System.out.printf("ERROR: already registered with plate number %s%n",licensePlateNumber);
                        }

                    break;
                case "unregister":
                    username = data[1];
                    if(!userLicenseNumber.containsKey(username)){
                        System.out.printf("ERROR: user %s not found%n",username);
                    }else{
                        userLicenseNumber.remove(username);
                        System.out.printf("%s unregistered successfully%n",username);
                    }

                    break;
            }

        }

        userLicenseNumber.entrySet().forEach(e -> System.out.printf("%s => %s%n",e.getKey(),e.getValue()));







    }

}
