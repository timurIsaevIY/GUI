
public class Imitation {
    Thread thread;
    public void start() throws InterruptedException {
        Gas_station gas_station = new Gas_station();
        boolean gasStationIsNedeed = false;
        int requestTime = 0;
        for( int time = 0; time < 10000000; time+=60) {
            if(gas_station.getFuelCapacity()>0) {
                gas_station.addCar(new Car(time, 0));
                gas_station.quantity();
            }
            else {
                System.out.println("No fuel");
            }
            if (gas_station.check(time) && !gasStationIsNedeed) {
                gasStationIsNedeed = true;
                requestTime = time;
            }
            if (gasStationIsNedeed && time - requestTime >= 1500) {
                gas_station.createColumn();
                gasStationIsNedeed = false;
            }

            if (time % 6000 == 0 && time != 0) Gas_station.addFuelCapacity(300);

            thread.sleep(100);
        }
    }
}
