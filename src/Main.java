public class Main {
    public static void main(String[] args) {
        ParkingLot parkingLot = ParkingLot.INSTANCE;
        System.out.println(ParkingLot.INSTANCE.canPark(VehicleType.CAR));
        System.out.println(ParkingLot.INSTANCE.canPark(VehicleType.EV));
        System.out.println(ParkingLot.INSTANCE.canPark(VehicleType.VAN));
        System.out.println(ParkingLot.INSTANCE.isFull());
        Vehicle vehicle = new Car("KA05MR2311");
        ParkingSpot availableSpot = ParkingLot.INSTANCE.getSpot(vehicle.getType());
        System.out.println(availableSpot.getSpotType());
        System.out.println(availableSpot.getLotID());
        Vehicle van = new Van("KA01MR7804");
        ParkingSpot vanSpot = ParkingLot.INSTANCE.getSpot(van.getType());
        System.out.println(null == vanSpot);
        System.out.println(ParkingLot.INSTANCE.getEntry().size());
//        parkingTckt parkingTicket = entrancePanel.getParkingTicket(vehicle);
//        System.out.println(parkingTicket.getAllocatedSpot());
//        ParkingTicket tkt = entrancePanel.getParkingTicket(new Car("ka04rb8458"));
//        System.out.println(null == tkt);
//        ParkingTicket mtrTkt = entrancePanel.getParkingTicket(new MotorBike("ka01ee4901"));
//        System.out.println(mtrTkt.getAllocatedSpotId());
//        mtrTkt = exitPanel.scanAndVacate(mtrTkt);
//        System.out.println(mtrTkt.getCharges());
//        System.out.println(mtrTkt.getCharges() > 0);
//
//        // Test case 13 - park on vacated spot
//        ParkingTicket mtrTkt1 = entrancePanel.getParkingTicket(new MotorBike("ka01ee7791"));
//        System.out.println(mtrTkt.getAllocatedSpotId());
//
//        // Test case 14 - park when spot is not available
//        ParkingTicket unavaialbemTkt =
//                entrancePanel.getParkingTicket(new MotorBike("ka01ee4455"));
//        System.out.println(null == unavaialbemTkt);
//
//        // Test cast 15 - vacate car
//        parkingTicket = exitPanel.scanAndVacate(parkingTicket);
//        System.out.println(parkingTicket.getCharges());
//        System.out.println(parkingTicket.getCharges() > 0);
    System.out.println(ParkingLot.INSTANCE.canPark(VehicleType.CAR));
//        //Test case 17 - Should be able to vacate parked vehicle
//        parkingTicket1 = exitPanel.scanAndVacate(parkingTicket1);
//        System.out.println(parkingTicket1.getCharges());
//        System.out.println(parkingTicket1.getCharges() > 0);
//
//        //Test case 18 - check for slots count
//        System.out.println(ParkingLot.INSTANCE.getParkingFloors()
//                .get(0).getParkingSpots().get(ParkingSpotType.CAR).size());
//
//        //Test case 19 - Payment
//        Payment payment = new Payment(UUID.randomUUID().toString(),
//                parkingTicket1.getTicketNumber(), parkingTicket1.getCharges());
//        payment.makePayment();
//        System.out.println(payment.getPaymentStatus());
//
//        //Test case 20 - vacate motorbike spot
//        mtrTkt = exitPanel.scanAndVacate(mtrTkt);
//        System.out.println(ParkingLot.INSTANCE.getParkingFloors()
//                .get(0).getParkingSpots().get(ParkingSpotType.MOTORBIKE).size());
//        System.out.println(mtrTkt.getCharges());
    }
}