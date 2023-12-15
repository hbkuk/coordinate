package fuel;

public class K5 implements Car {
    private static final int EFFICIENCY = 13;

    private static final String NAME = "K5";

    private final int distanceToTravel;

    public K5(int distanceToTravel) {
        super();
        this.distanceToTravel = distanceToTravel;
    }

    @Override
    public String getCarName() {
        return NAME;
    }

    @Override
    public double getChargeQuantity() {
        return (double) distanceToTravel / EFFICIENCY;
    }
}
