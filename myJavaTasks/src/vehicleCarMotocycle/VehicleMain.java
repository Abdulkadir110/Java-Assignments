package vehicleCarMotocycle;

public class VehicleMain {
    void main() {
        Car myCar = new Car("Toyota", 180, 4);
        String comment = myCar.describe();
        IO.println(comment);

        Motorcycle myBike = new Motorcycle("Harley-Davidson", 160, false);
        String comment2 = myBike.describe();
        IO.println(comment2);
    }
}