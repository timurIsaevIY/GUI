import java.util.ArrayList;

public class Column {
    private final ArrayList<Car> cars = new ArrayList<>();
    private int refueledCars=0;

    public ArrayList<Car> getCars(){
        return cars;
    }

    public void addCar(Car car) {
        cars.add(car);
    }

    public void removeAllCars() {
        cars.clear();
    }

    public boolean checkCars(int i) {
            if (!cars.isEmpty() && ((i - cars.get(0).getTimeRefuel()) / 60) * 20 >= cars.get(0).getFuel()) {
                if (!Gas_station.checkFuelCapacity(cars.get(0).getFuel())) cars.remove(0);
                if (!cars.isEmpty()) cars.get(0).setTimeRefuel(i);
                refueledCars+=1;
            }
        return cars.size() > 2 && ((i - cars.get(1).getTimeArriving()) >= 720);
    }

    public int quantityOfCars() {
        return cars.size();
    }

    public int getRefueledCars() {
        return refueledCars;
    }

    public Car getCar() {
        Car car = cars.get(cars.size() - 1);
        cars.remove(cars.size() - 1);
        return car;

    }
}
