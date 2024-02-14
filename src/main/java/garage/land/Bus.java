package garage.land;

import garage.Vehicle;
import garage.engine.IEngine;

public class Bus extends Vehicle implements ILandVehicle, IEngine {

    private boolean isDoubleDecker;
    private int numberOfWheels;
    private IEngine engine;

    public Bus(float weight, int maxSpeed, boolean isDoubleDecker, IEngine engine){
        super(weight, maxSpeed);
        this.isDoubleDecker = isDoubleDecker;
        this.numberOfWheels = 4;
        this.engine = engine;
    }

    public boolean getIsDoubleDecker() {
        return isDoubleDecker;
    }

    public void setDoubleDecker(boolean doubleDecker) {
        isDoubleDecker = doubleDecker;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    public IEngine getEngine() {
        return engine;
    }

    public void setEngine(IEngine engine) {
        this.engine = engine;
    }

    @Override
    public int getHorsePower() {
        return this.engine.getHorsePower();
    }
//THIS IS DELEGATION
    @Override
    public void setHorsePower(int horsePower) {
        this.engine.setHorsePower(horsePower);
    }
}
