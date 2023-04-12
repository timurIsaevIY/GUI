import java.util.Random;

public class Car {
    private int tank_capacity;
    private int tank_fullness;
    private int fuel;
    private int timeArriving;
    private int timeRefuel;
    public Car( int timeArriving, int timeRefuel){
        Random rand = new Random();
        tank_fullness = rand.nextInt(200) + 1;
        //tank_fullness= (int) (Math.random()*20+40);
        tank_capacity = Math.min(tank_fullness, rand.nextInt(200));
        //tank_capacity=(int)(Math.random()*tank_fullness);
        fuel = Math.min(rand.nextInt(200) + 1, tank_fullness - tank_capacity);
        //fuel=(int)(Math.random()*tank_fullness+1);
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
        if (tank_capacity+fuel>tank_fullness){
            return tank_fullness;
        }
        else {
            return fuel;
        }
    }
    public void setTimeRefuel(int i){
        timeRefuel=i;
    }
}
