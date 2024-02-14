package garage.air;

import garage.Vehicle;

public class Helicopter extends Vehicle implements IAirVehicle {
    private int capacity;
    private String model;

    public Helicopter(int weight, int maxSpeed, int capacity,String model){
        super(weight,maxSpeed);
        this.capacity = capacity;
        this.model = model;
    }

    @Override
    public int getCapacity() {
        return capacity;
    }

    @Override
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
