package fuel;

public class Sonata implements Car{

    private static final int EFFICIENCY = 10;

    public static final String NAME = "Sonata";

    private final int distanceToTravel;

    public Sonata(int distanceToTravel) {
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
