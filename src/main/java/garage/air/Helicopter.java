package garage.air;

import garage.Vehicle;
import garage.radar.IRadar;

public class Helicopter extends Vehicle implements IAirVehicle, IRadar {
    private int capacity;
    private String model;

    private IRadar radar;

    public Helicopter(int weight, int maxSpeed, int capacity,String model, IRadar radar){
        super(weight,maxSpeed);
        this.capacity = capacity;
        this.model = model;
        this.radar = radar;
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

    @Override
    public int getRange() {
        return this.radar.getRange();
    }

    @Override
    public void setRange(int range) {
        this.radar.setRange(range);
    }
}
