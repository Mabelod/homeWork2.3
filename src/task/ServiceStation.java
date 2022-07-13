package task;

public class ServiceStation implements Service {
    public void check(Car car) {
            System.out.println("Обслуживаем " + car.getModelName());
            for (int i = 0; i < car.getWheelsCount(); i++) {
                Car.updateTyre();
            }
            Car.checkEngine();
    }
    public void check(Truck truck){
        System.out.println("Обслуживаем " + truck.getModelName());
        for (int i = 0; i < truck.getWheelsCount(); i++) {
            Truck.updateTyre();
        }
        Truck.checkEngine();
        Truck.checkTrailer();
    }

    public void check(Bicycle bicycle){
        System.out.println("Обслуживаем " + bicycle.getModelName());
        for (int i = 0; i < bicycle.getWheelsCount(); i++) {
            Bicycle.updateTyre();
        }
    }
}