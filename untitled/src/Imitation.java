
public class Imitation {
    public void start() throws InterruptedException {
        Gas_station gas_station = new Gas_station();
        int t1=(int)Math.pow(10,10000);
        boolean newColumnIsNedeed = false;
        for (int time = 0; time < 300000000; time += 60){
            if (time != 0) {
                gas_station.addCar(new Car(time,0));
                gas_station.quantity();
                if (gas_station.check(time) && !newColumnIsNedeed) {
                    newColumnIsNedeed = true;

                    t1=time;
                }
                if (time-t1 >=172800 && newColumnIsNedeed){
                    gas_station.createColumn();
                    newColumnIsNedeed = false;
                }
                if (time%43200==0){
                    Gas_station.setFuelCapacity(10);
                }
            }
            Thread.sleep(2);
        }

    }
}
