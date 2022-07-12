package task;

public class ServiceStation {
    public void checkCar(Car car) {
        if (car != null) {
            System.out.println("Обслуживаем " + car.getModelName());
            for (int i = 0; i < car.getWheelsCount(); i++) {
                CarService.updateTyre();
            }
            CarService.checkEngine();
        }
    }
        public void checkTruck(Truck truck){
            System.out.println("Обслуживаем " + truck.getModelName());
            for (int i = 0; i < truck.getWheelsCount(); i++) {
                TruckService.updateTyre();
            }
            TruckService.checkEngine();
            TruckService.checkTrailer();
        }

        public void checkBicycle(Bicycle bicycle){
            System.out.println("Обслуживаем " + bicycle.getModelName());
            for (int i = 0; i < bicycle.getWheelsCount(); i++) {
                BicycleService.updateTyre();
            }
        }
    }