import java.util.HashMap;

abstract public class ParkingSpace {
    HashMap parkingLot = new HashMap();
    int pricePerHour;

    public boolean canPark(Vehicle vehicle) {
        return true;
    }

    ParkingSpace(int pricePerHour) {
        this.pricePerHour = pricePerHour;
    }

    public void park(Vehicle vehicle) {
        parkingLot.put(vehicle.hashCode(), vehicle);
        vehicle.timeEntered = System.currentTimeMillis();
    }

    public void exit(Vehicle vehicle) {
        parkingLot.remove(vehicle.hashCode());
        charge(vehicle);
    }

    public void charge(Vehicle vehicle) {
        //long toPay = timeIn(vehicle) / 3600000;
        long toPay = timeIn(vehicle);
        System.out.println("price is $" + toPay);
    }

    public long timeIn(Vehicle vehicle) {
        long timeNow = System.currentTimeMillis();
        long timeIn = timeNow - vehicle.timeEntered;
        return timeIn;
    }
}
