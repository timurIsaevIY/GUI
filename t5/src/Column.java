import java.util.ArrayList;


public class Column {
    private final ArrayList<Car> c = new ArrayList<>();

    public void addCar(Car car) {
        Car car1 = car;
        c.add(car);
    }
}
