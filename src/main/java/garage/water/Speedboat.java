package garage.water;

import garage.Vehicle;

public class Speedboat extends Vehicle implements IWaterVehicle{

    private boolean needsCrew;
    private String hullType;

    public Speedboat(float weight, int maxSpeed, String hullType, int horsePower, boolean needsCrew){
        super(weight, maxSpeed);
        this.needsCrew = needsCrew;
        this.hullType = hullType;
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

}
