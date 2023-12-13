package fuel;

public abstract class Car {

    abstract int getDistanceToTravel();

    abstract int getEfficiency();

    abstract String getCarName();

    double getChargeQuantity() {
        return getDistanceToTravel() / getEfficiency();
    }
}
