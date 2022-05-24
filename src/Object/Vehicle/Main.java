package Object.Vehicle;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        List<Vehicle> vehicles = new ArrayList<>();
        int counter = 0;
        while(!input.equals("End")){
            counter++;
            if(counter > 50){
                break;
            }
            String[] data = input.split(" ");
            String type = data[0];
            String model= data[1];
            String color = data[2];
            int horsePower = Integer.parseInt(data[3]);
            if(horsePower>=1 && horsePower <= 1000) {
                Vehicle vehicle;
                if (type.equals("car")) {
                    vehicle = new Vehicle("Car", model, color, horsePower);
                    vehicles.add(vehicle);
                } else {
                    vehicle = new Vehicle("Truck", model, color, horsePower);
                    vehicles.add(vehicle);
                }
            }

            input = scanner.nextLine();
        }

        String input2 = scanner.nextLine();
        while(!input2.equals("Close the Catalogue")){
            for (Vehicle vehicle : vehicles) {
                if(vehicle.getModel().equals(input2)){
                    System.out.println(vehicle);
                }
            }
            input2 = scanner.nextLine();
        }

        List<Vehicle> car = vehicles.stream().filter(vehicle -> vehicle.getType().equals("Car")).collect(Collectors.toList());
        List<Vehicle> truck = vehicles.stream().filter(vehicle -> vehicle.getType().equals("Truck")).collect(Collectors.toList());
        int sumHpCar = 0;
        int sumHpTruck = 0;
        double averageHpCar = 0;
        double averageTruck = 0;
        if(!car.isEmpty()) {

            for (Vehicle vehicle : car) {
                sumHpCar += vehicle.getHorsePower();
            }

             averageHpCar = sumHpCar * 1.0 / car.size();
        }else{
            averageTruck = 0;
        }

        if(!truck.isEmpty()) {
            for (Vehicle vehicle : truck) {
                sumHpTruck += vehicle.getHorsePower();
            }
            averageTruck = sumHpTruck * 1.0 / truck.size();
        }else{
            averageTruck = 0;
        }


            System.out.printf("Cars have average horsepower of: %.2f.%n", averageHpCar);
            System.out.printf("Trucks have average horsepower of: %.2f.", averageTruck);



    }
}
