class Vehicle {
    void printVehicle() {
        System.out.println("This is a vehicle.");
    }
}
class Car extends Vehicle {
    void printCar() {
        System.out.println("This is a car.");
    }
}
class Bike extends Vehicle {
    void printBike() {
        System.out.println("This is a bike.");
    }
}
class ElectricCar extends Car {
    void chargeBattery() {
        System.out.println("Charging the electric car.");
    }
}
public class VehicleTypesMain {
    public static void main(String[] args) {
        ElectricCar tesla = new ElectricCar();
        tesla.printVehicle();   
        tesla.printCar();       
        tesla.chargeBattery();  
    }
}
