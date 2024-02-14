package garage.radar;

public class SurveillanceRadar implements IRadar {

    private int range;

    private double resolution;
    public SurveillanceRadar(int range, double resolution)
    {
        this.range = range;
        this.resolution = resolution;
    }

    @Override
    public int getRange() {
        return range;
    }

    @Override
    public void setRange(int range) {
        this.range = range;
    }

    public double getResolution() {
        return resolution;
    }

    public void setResolution(double resolution) {
        this.resolution = resolution;
    }
}
