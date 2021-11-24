package parkingsystem.system;

import parkingsystem.system.ParkingSpace;

public class ParkingGarage extends ParkingSpace {

    public ParkingGarage(int pricePerHour) {
        super(pricePerHour);
    }

    public boolean canPark(Vehicle vehicle) {
        return (vehicle.height < 200);

    }

    public void park(Vehicle vehicle) {
        if (canPark(vehicle)) {
            parkingLot.put(vehicle.hashCode(), vehicle);
            vehicle.timeEntered = System.currentTimeMillis();
        } else System.out.println("parkingsystem.system.Vehicle is too high for garage.");
    }
}
