package garage.water;

import garage.Vehicle;

public class CargoShip extends Vehicle implements IWaterVehicle{

    private int numberOfContainers;
    private String hullType;

    public CargoShip(float weight, int maxSpeed, int horsePower, String hullType, int numberOfContainers){
        super(weight, maxSpeed);
        this.numberOfContainers = numberOfContainers;
        this.hullType = hullType;
    }

    public int getNumberOfContainers() {
        return numberOfContainers;
    }

    public void setNumberOfContainers(int numberOfContainers) {
        this.numberOfContainers = numberOfContainers;
    }
    
    @Override
    public String getHullType() {
        return this.hullType;
    }

    @Override
    public void setHullType(String hullType) {
        this.hullType = hullType;
    }

}
