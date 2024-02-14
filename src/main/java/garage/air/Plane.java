package garage.air;

import garage.Vehicle;

public class Plane extends Vehicle implements IAirVehicle {
    private int capacity;
    private String haulType;

    public Plane(int weight, int maxSpeed, int capacity,String haulType){
        super(weight,maxSpeed);
        this.capacity = capacity;
        this.haulType = haulType;
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
}
