package creational.builder;

public class Engine {
    private final double capacity;
    private double mileage;

    public Engine(double capacity, double mileage)
    {
        this.capacity = capacity;
        this.mileage = mileage;
    }

    public double getCapacity() {
        return capacity;
    }

    public double getMileage() {
        return mileage;
    }
}
