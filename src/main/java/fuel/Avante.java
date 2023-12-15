package fuel;

public class Avante implements Car{
    private static final int EFFICIENCY = 15;

    private static final String NAME = "Avante";

    private final int distanceToTravel;

    public Avante(int distanceToTravel) {
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
