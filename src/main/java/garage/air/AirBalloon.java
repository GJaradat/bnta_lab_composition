package garage.air;

import garage.Vehicle;

public class AirBalloon extends Vehicle implements IAirVehicle {
    private int capacity;
    private String colour;
    private int fuelLimit;

    public AirBalloon(int weight, int maxSpeed, int capacity,String colour, int fuelLimit){
        super(weight,maxSpeed);
        this.capacity = capacity;
        this.colour = colour;
        this.fuelLimit = fuelLimit;
    }

    @Override
    public int getCapacity() {
        return capacity;
    }

    @Override
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getFuelLimit() {
        return fuelLimit;
    }

    public void setFuelLimit(int fuelLimit) {
        this.fuelLimit = fuelLimit;
    }
}
