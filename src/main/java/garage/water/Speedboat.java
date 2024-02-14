package garage.water;

import garage.Vehicle;
import garage.engine.IEngine;

public class Speedboat extends Vehicle implements IWaterVehicle, IEngine {

    private boolean needsCrew;
    private String hullType;
    private IEngine engine;

    public Speedboat(float weight, int maxSpeed, String hullType, int horsePower, boolean needsCrew, IEngine engine){
        super(weight, maxSpeed);
        this.needsCrew = needsCrew;
        this.hullType = hullType;
        this.engine = engine;
    }

    public boolean getNeedsCrew() {
        return needsCrew;
    }

    public void setNeedsCrew(boolean needsCrew) {
        this.needsCrew = needsCrew;
    }

    @Override
    public String getHullType() {
        return this.hullType;
    }

    @Override
    public void setHullType(String hullType) {
        this.hullType = hullType;
    }

    public int getHorsePower()
    {
        return this.engine.getHorsePower();
    }

    public void setHorsePower(int horsePower)
    {
        this.engine.setHorsePower(horsePower);
    }


}
