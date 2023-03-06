public class Vehicle {
    //1. Single Responsibility Principle

    public static class VehicleDetailsPrinter {
        public void printDetails(Vehicle vehicle) {
            // implementarea imprimării detaliilor vehiculului
        }
    }
    public static class VehicleValueCalculator {
        public double calculateValue(Vehicle vehicle) {
            // implementarea calculului valorii vehiculului
            return 0;
        }
    }
    public static class VehicleDBHandler {
        public void addVehicleToDB(Vehicle vehicle) {
            // implementarea adăugării vehiculului în baza de date
        }
    }
    //2. Open-closed principle
    private double value;

    public void setValue(double value) {
        this.value = value;
    }

    public double getValue() {
        return this.value;
    }

    public double calculateValue() {
        return this.getValue();
    }
}
class Car extends Vehicle {
    public double calculateValue() {
        return super.calculateValue() * 0.8;
    }
}

class Truck extends Vehicle {
    public double calculateValue() {
        return super.calculateValue() * 0.9;
    }
}

