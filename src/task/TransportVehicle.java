package task;

public class TransportVehicle {
    private String modelName;
    private int wheelsCount;

    public TransportVehicle(String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }

    public String getModelName() {
        return modelName;
    }

    public int getWheelsCount() {
        return wheelsCount;
    }

    public static void updateTyre() {
        System.out.println("Меняем покрышку");
    }

    public static void checkEngine() {
        System.out.println("Проверяем двигатель");
    }

    public static void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }
}