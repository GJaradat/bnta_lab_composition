package garage.air;

import garage.Vehicle;
import garage.radar.IRadar;

public class Plane extends Vehicle implements IAirVehicle, IRadar {
    private int capacity;
    private String haulType;

    private IRadar radar;

    public Plane(int weight, int maxSpeed, int capacity,String haulType, IRadar radar){
        super(weight,maxSpeed);
        this.capacity = capacity;
        this.haulType = haulType;
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

    public String getHaulType() {
        return haulType;
    }

    public void setHaulType(String haulType) {
        this.haulType = haulType;
    }

    @Override
    public int getRange() {
        return this.radar.getRange();
    }

    @Override
    public void setRange(int range) {
        this.radar.setRange(range);
    }

    public IRadar getRadar() {
        return radar;
    }

    public void setRadar(IRadar radar) {
        this.radar = radar;
    }
}
