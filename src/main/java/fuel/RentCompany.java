package fuel;

import java.util.ArrayList;
import java.util.List;

public class RentCompany {
    private static RentCompany rentCompany = null;
    private List<Car> cars = new ArrayList<>();

    public static RentCompany create() {
        if(rentCompany == null) {
            rentCompany = new RentCompany();
        }
        return rentCompany;
    }

    public String generateReport() {
        StringBuilder stringBuilder = new StringBuilder();
        for(Car car : cars) {
            stringBuilder
                    .append(car.getCarName())
                    .append(" : ")
                    .append((int) car.getChargeQuantity())
                    .append("리터")
                    .append(System.getProperty("line.separator"));
        }
        return stringBuilder.toString();
    }

    public void addCar(Car car) {
        cars.add(car);
    }
}
