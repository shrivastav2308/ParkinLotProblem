public class Main {
    public static void main(String[] args) throws InvlaidParkingFloorException {
        ParkingLot parkingLot = ParkingLot.INSTANCE;
        System.out.println(ParkingLot.INSTANCE.canPark(VehicleType.CAR));
        System.out.println(ParkingLot.INSTANCE.canPark(VehicleType.EV));
        System.out.println(ParkingLot.INSTANCE.canPark(VehicleType.VAN));
        System.out.println(ParkingLot.INSTANCE.isFull());
        Vehicle vehicle = new Car("KA05MR2311");
        ParkingSpot availableSpot = ParkingLot.INSTANCE.getSpot(vehicle.getType());
//        System.out.println(availableSpot.getSpotType());
//        System.out.println(availableSpot.getLotID());
        Vehicle van = new Van("KA01MR7804");
        ParkingSpot vanSpot = ParkingLot.INSTANCE.getSpot(van.getType());
        System.out.println(null == vanSpot);
        System.out.println(ParkingLot.INSTANCE.getEntry().size());
    System.out.println(ParkingLot.INSTANCE.canPark(VehicleType.CAR));
    }
}