public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();

        // instantiem obiectele claselor separate
        var printer = new Vehicle.VehicleDetailsPrinter();
        var calculator = new Vehicle.VehicleValueCalculator();
        var dbHandler = new Vehicle.VehicleDBHandler();

        // apelam metodele separate pentru a imprima detaliile vehiculului, a calcula valoarea vehiculului si a adauga vehiculul in baza de date
        printer.printDetails(vehicle);
        double value = calculator.calculateValue(vehicle);
        dbHandler.addVehicleToDB(vehicle);


        vehicle.setValue(5000);

        Car car = new Car();
        car.setValue(7000);

        Truck truck = new Truck();
        truck.setValue(9000);

        System.out.println("Value of vehicle: " + vehicle.calculateValue());
        System.out.println("Value of car: " + car.calculateValue());
        System.out.println("Value of truck: " + truck.calculateValue());
    }
}
