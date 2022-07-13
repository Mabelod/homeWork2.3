package task;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("car1" ,4);
        Car car2 = new Car("car2" ,4);

        Truck truck = new Truck("truck1", 6);
        Truck truck2 = new Truck("truck2",8);

        Bicycle bicycle = new Bicycle("bicycle1",2);
        Bicycle bicycle2 = new Bicycle("bicycle1",2);

        ServiceStation station = new ServiceStation();
        VehicleMaintenance(station, car, truck, bicycle);
    }

    public static void VehicleMaintenance(Service service, Car car, Truck truck, Bicycle bicycle) {
        service.check(car);
        service.check(truck);
        service.check(bicycle);

    }
}