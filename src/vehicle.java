public abstract class Vehicle {
    private String vehicleId;
    public String brand;
    public String model;
    public double dailyRate;
    public boolean available;

    public Vehicle(String vehicleId, String brand,
                   String model, double dailyRate) {
        this.vehicleId = vehicleId;
        this.brand = brand;
        this.model = model;
        this.dailyRate = dailyRate;
        this.available = true;
    }

    public abstract String getType();

