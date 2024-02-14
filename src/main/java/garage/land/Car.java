package garage.land;

import garage.Vehicle;
import garage.engine.IEngine;

public class Car extends Vehicle implements ILandVehicle, IEngine {

    private String type;
    private int numberOfWheels;
    private IEngine engine;
    public Car(float weight, int maxSpeed, String type, IEngine engine){
        super(weight, maxSpeed);
        this.type = type;
        this.numberOfWheels = 2;
        this.engine = engine;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    @Override
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
