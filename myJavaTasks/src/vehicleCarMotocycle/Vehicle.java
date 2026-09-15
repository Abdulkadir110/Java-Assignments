package vehicleCarMotocycle;

public class Vehicle {
    private String brand;
    private final int topSpeed;

    Vehicle(String brand, int topSpeed){
        this.brand = brand;
        this.topSpeed = topSpeed;
    }
    public String describe(){
        return "This is a " + brand + " with a top speed of " + topSpeed + " km/h";
    }
}
class Car extends Vehicle {
    private int numberOfDoors;

    Car(String brand, int topSpeed, int numberOfDoors) {
            super(brand, topSpeed);
            this.numberOfDoors = numberOfDoors;
    }
}
class Motorcycle extends Vehicle {
    private boolean hasSideCar;
    Motorcycle(String brand, int topSpeed, boolean hasSideCar){
        super(brand, topSpeed);
        this.hasSideCar = hasSideCar;
    }
}