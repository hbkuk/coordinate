package fuel;

public class Avante extends Car{
    private static final int EFFICIENCY = 15;

    private static final String NAME = "Avante";

    private final int distanceToTravel;

    public Avante(int distanceToTravel) {
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
