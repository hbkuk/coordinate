package fuel;

public class Sonata extends Car{

    private static final int EFFICIENCY = 10;

    private static final String NAME = "Sonata";

    private final int distanceToTravel;

    public Sonata(int distanceToTravel) {
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
