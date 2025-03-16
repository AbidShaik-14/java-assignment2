import java.util.Scanner;

class Vehicle {
    String brand;
    int speed;

    Vehicle(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    void printSpeed() {
        System.out.println("Speed: " + speed);
    }
}

class Car extends Vehicle {
    String model;

    Car(String brand, int speed, String model) {
        super(brand, speed);
        this.model = model;
    }

    void printCarDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Speed: " + speed);
    }
}

class Bike extends Vehicle {
    boolean isSportBike;

    Bike(String brand, int speed, boolean isSportBike) {
        super(brand, speed);
        this.isSportBike = isSportBike;
    }

    void printBikeDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Is it a Sport bike? " + isSportBike);
        System.out.println("Speed: " + speed);
    }
}

public class VehicleSpeedMain {  
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            System.out.println("Enter car brand:");
            String carBrand = s.nextLine();
            
            System.out.println("Enter car speed:");
            int carSpeed = s.nextInt();
            s.nextLine(); // Consume newline

            System.out.println("Enter car model:");
            String model = s.nextLine();

            Car car = new Car(carBrand, carSpeed, model);
            System.out.println("\nCar Details:");
            car.printCarDetails();

            System.out.println("\nEnter bike brand:");
            String bikeBrand = s.nextLine();
            
            System.out.println("Enter bike speed:");
            int bikeSpeed = s.nextInt();
            s.nextLine(); // Consume newline

            System.out.println("Is it a sport bike? (true/false):");
            boolean isSportBike = Boolean.parseBoolean(s.nextLine().trim());

            Bike bike = new Bike(bikeBrand, bikeSpeed, isSportBike);
            System.out.println("\nBike Details:");
            bike.printBikeDetails();
        }
    }
}
