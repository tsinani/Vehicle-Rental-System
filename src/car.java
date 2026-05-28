//Car.java
public class car extends vehicle {
    private int numberofSeats;
    public car(String id, String brand, String model,
               double rate, int numberofSeats) {
        super(id, brand, model, rate);
        this.numberofSeats = numberofSeats;
    }
    @Override
    public String getType() { return "Car"; }
    public int getnumberofSeats() { return numberofSeats; }
}