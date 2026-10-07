class Car {
    String brand;
    String model;
    double fuelLevel;

    void displayInfo() {
        System.out.println("Car: " + brand + " " + model);
        System.out.println("Fuel Level: " + fuelLevel + " liters");
    }

    void drive(double distanceKm) {
        double fuelNeeded = distanceKm * 0.1;
        if (fuelLevel >= fuelNeeded) {
            fuelLevel -= fuelNeeded;
            System.out.println("Drove " + distanceKm + " km. Fuel left: " + fuelLevel + " liters");
        } else {
            System.out.println("Not enough fuel to drive " + distanceKm + " km!");
        }
    }

    void refuel(double amount) {
        fuelLevel += amount;
        System.out.println("Refueled. Fuel level now: " + fuelLevel + " liters");
    }
}

public class CarFuelTracker {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.brand = "Toyota";
        car1.model = "Corolla";
        car1.fuelLevel = 5.0;

        car1.displayInfo();
        car1.drive(30);
        car1.drive(30);
        car1.refuel(10);
        car1.drive(20);
    }
}