public class ParkingGarage extends ParkingSpace {

    ParkingGarage(int pricePerHour) {
        super(pricePerHour);
    }

    public boolean canPark(Vehicle vehicle) {
        return (vehicle.height > 200) ? false : true;

    }

    public void park(Vehicle vehicle) {
        if (canPark(vehicle)) {
            parkingLot.put(vehicle.hashCode(), vehicle);
            vehicle.timeEntered = System.currentTimeMillis();
        } else System.out.println("Vehicle is too high for garage.");
    }
}
