import java.util.Random;

public class Car {
    private int tank_capacity;
    private int tank_fullness;
    private int fuel;
    private int timeArriving;
    private int timeRefuel;

    public Car( int timeArriving, int timeRefuel){
        Random rand = new Random();
        tank_fullness = rand.nextInt(40) + 40;
        tank_capacity = rand.nextInt(tank_fullness);
        fuel = rand.nextInt( tank_fullness - tank_capacity);
        this.timeArriving=timeArriving;
        this.timeRefuel=timeRefuel;
    }

    public int getTimeArriving(){
        return timeArriving;
    }

    public int getTimeRefuel(){
        return timeRefuel;
    }

    public int getFuel(){
        return fuel;
    }

    public void setTimeRefuel(int i){
        timeRefuel=i;
    }
}
