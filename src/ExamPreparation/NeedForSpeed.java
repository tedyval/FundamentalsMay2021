package ExamPreparation;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class NeedForSpeed {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       int n = Integer.parseInt(scanner.nextLine());
       Map<String, Car> carsInMap = new LinkedHashMap<>();
        for (int i = 0; i < n; i++) {
          String input = scanner.nextLine();
          String[] carData = input.split("\\|");
          String car = carData[0];
          int mileage = Integer.parseInt(carData[1]);
          int fuel = Integer.parseInt(carData[2]);
          Car currentCar = new Car(car,mileage,fuel);
          carsInMap.put(car,currentCar);
        }


        String input2 = scanner.nextLine();
        while(!input2.equals("Stop")){
            String[] commandParts = input2.split(" : ");
            String command = commandParts[0];
            String car = commandParts[1];
            switch(command){
                case "Drive":
                    int distance = Integer.parseInt(commandParts[2]);
                    int fuel = Integer.parseInt(commandParts[3]);
                    if(fuel <= carsInMap.get(car).getFuel()){
                        carsInMap.get(car).setFuel(carsInMap.get(car).getFuel() - fuel);
                        carsInMap.get(car).setMileage(carsInMap.get(car).getMileage() + distance);
                        System.out.printf("%s driven for %d kilometers. %d liters of fuel consumed.%n",car,distance,fuel);
                        if(carsInMap.get(car).getMileage() >= 100000){
                            carsInMap.remove(car);
                            System.out.printf("Time to sell the %s!%n",car);
                        }
                    }else{
                        System.out.println("Not enough fuel to make that ride");
                    }
                    break;
                case "Refuel":
                    int fuel1 = Integer.parseInt(commandParts[2]);

                    if(carsInMap.get(car).getFuel() + fuel1 <= 75 ){
                        carsInMap.get(car).setFuel(carsInMap.get(car).getFuel() + fuel1);
                        System.out.printf("%s refueled with %d liters%n",car,fuel1);
                    }else{
                     int toBeFueled = 75 - carsInMap.get(car).getFuel();
                        carsInMap.get(car).setFuel(75);
                        System.out.printf("%s refueled with %d liters%n",car,toBeFueled);
                    }

                    break;
                case "Revert":
                   int kilometers = Integer.parseInt(commandParts[2]);
                    carsInMap.get(car).setMileage(carsInMap.get(car).getMileage() - kilometers);

                    if(carsInMap.get(car).getMileage() < 10000){
                        carsInMap.get(car).setMileage(10000);
                    }else{
                        System.out.printf("%s mileage decreased by %d kilometers%n",car,kilometers);
                    }
                    break;
            }



            input2 = scanner.nextLine();
        }

        carsInMap.entrySet().stream().sorted((e1,e2)-> {
            int result = Integer.compare(e2.getValue().getMileage(),e1.getValue().getMileage());
            if(result == 0){
                result = e1.getKey().compareTo(e2.getKey());
                return  result;
            }
            return result;
        }).forEach(e-> System.out.printf("%s -> Mileage: %d kms, Fuel in the tank: %d lt.%n",e.getKey(),e.getValue().getMileage(),e.getValue().getFuel()));






    }
}

class Car{
    String car;
    int mileage;
    int fuel;


public Car(String car, int mileage, int fuel){
    this.car = car;
    this.mileage = mileage;
    this.fuel = fuel;
}


    public int getFuel() {
    return this.fuel;
    }

    public void setFuel(int fuel) {
    this.fuel = fuel;
    }

    public void setMileage(int km) {
    this.mileage = km;
    }

    public int getMileage() {
    return this.mileage;
    }
}
