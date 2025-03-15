import java.util.Scanner;
class Vehicle {
    String brand;
    int speed;
    Vehicle(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }
    void printSpeed() {
        System.out.print(speed);
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
class vehicleSpeedMain {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String carBrand = s.nextLine();
        int carSpeed = s.nextInt();
        s.nextLine();
        String Model = s.nextLine();
        Car car = new Car(carBrand, carSpeed, Model);
        car.printCarDetails();
        String bikeBrand = s.nextLine();
        int bikeSpeed = s.nextInt();
        s.nextLine();
        boolean isSportBike = Boolean.parseBoolean(s.nextLine().trim());
        Bike bike = new Bike(bikeBrand, bikeSpeed, isSportBike);
        bike.printBikeDetails();
    }
}
