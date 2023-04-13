import java.util.ArrayList;
import java.util.Comparator;

public class Gas_station {
    private static ArrayList<Column> columns = new ArrayList<>();
    private static int fuelCapacity;
    public Gas_station() {
        columns.add(new Column());
        fuelCapacity=1000;
    }

    public int getFuelCapacity() {
        return fuelCapacity;
    }

    public void createColumn() {
        columns.add(new Column());
        while (columns.get(columns.size() - 1).quantityOfCars() < columns.get(columns.size() - 2).quantityOfCars()) {
            for (int i = 0; i < columns.size() - 1; i++) {
                columns.get(columns.size() - 1).addCar(columns.get(i).getCar());
            }
        }
    }

    public boolean check(int i) {
        boolean c = false;
        for (Column column: columns){
            if (column.checkCars(i)) c = true;
        }
        return c;
    }

    public static boolean checkFuelCapacity(int fuel) {
        fuelCapacity-=fuel;
        if (fuelCapacity<=0) {
            clearColumns();
            return true;
        }
        return false;
    }

    public static void clearColumns() {
        for (Column column: columns){
            column.removeAllCars();
        }
    }

    public void addCar(Car car) {
        int index = 0;
        int count = 100000;
        for (int i = 0; i<columns.size(); i++) {
            if (columns.get(i).quantityOfCars()<count) {
                count = columns.get(i).quantityOfCars();
                index = i;
            }
        }
        columns.get(index).addCar(car);
    }

    public static void addFuelCapacity(int fuelCapacity) {
        Gas_station.fuelCapacity += fuelCapacity;
    }

    public void quantity(){
        int quantity=1;
        for(Column column:columns){
            System.out.println("Column№" + quantity+":"+column.quantityOfCars() + " " + column.getRefueledCars());
            quantity+=1;
        }
        System.out.println("\n");
        System.out.println("Fuel capacity:" + fuelCapacity);
    }

}
