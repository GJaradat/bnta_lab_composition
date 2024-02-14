package garage.radar;

public class ApproachRadar implements IRadar {

    private int range;

    private int timeDelay;
    public ApproachRadar(int range, int timeDelay)
    {
        this.range = range;
        this.timeDelay = timeDelay;
    }

    @Override
    public int getRange() {
        return range;
    }

    @Override
    public void setRange(int range) {
        this.range = range;
    }

    public int getTimeDelay() {
        return timeDelay;
    }

    public void setTimeDelay(int timeDelay) {
        this.timeDelay = timeDelay;
    }
}
