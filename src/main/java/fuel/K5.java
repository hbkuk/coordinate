package fuel;

public class K5 extends Car {
    private static final int EFFICIENCY = 13;

    private static final String NAME = "K5";

    private final int distanceToTravel;

    public K5(int distanceToTravel) {
        super();
        this.distanceToTravel = distanceToTravel;
    }

    @Override
    int getDistanceToTravel() {
        return distanceToTravel;
    }

    @Override
    int getEfficiency() {
        return EFFICIENCY;
    }

    @Override
    String getCarName() {
        return NAME;
    }
}
