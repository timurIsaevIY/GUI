import java.util.ArrayList;
import java.util.Comparator;

public class Gas_station {
    private static ArrayList<Column> columns = new ArrayList<>();
    private static int fuelCapacity;
    public Gas_station(){
        columns.add(new Column());
        fuelCapacity=300000;
    }
            //?????
    public int getFuelCapacity() {
        return fuelCapacity;
    }

    public void createColumn(){
        columns.add(new Column());
    }
    public boolean check(int i){
        boolean c = false;
        for (Column column: columns){
            if (column.checkCars(i)) c = true;
        }
        return c;
    }
    public static void checkFuelCapacity(int fuel){
        fuelCapacity-=fuel;
        if (fuelCapacity<=0) clearColumns();
    }
    public static void clearColumns(){
        for (Column column: columns){
            column.removeAllCars();
        }
    }
    public void addCar(Car car){
        columns.sort(new Comparator<Column>() {
            @Override
            public int compare(Column o1, Column o2) {
                return o1.getCars().size() - o2.getCars().size();
            }
        });
        columns.get(0).addCar(car);
    }

    public static void setFuelCapacity(int fuelCapacity) {
        Gas_station.fuelCapacity += fuelCapacity;
    }
    public void quantity(){
        int quantity=1;
        for(Column column:columns){
            System.out.println("Column№" + quantity+":"+column.quantityOfCars() + " " + column.getRefueledCars());
            quantity+=1;
        }
        System.out.println(fuelCapacity);
    }
}
