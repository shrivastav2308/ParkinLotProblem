import lombok.Getter;

import java.time.LocalDateTime;
import java.util.UUID;

@Getter
public class Entrance {
    private String id;

    public Entrance(String id) {
        this.id = id;
    }
    public parkingTckt getParkingTicket(Vehicle vehicle) {
        if(!ParkingLot.INSTANCE.canPark(vehicle.getType())) return null;
        ParkingSpot spot = ParkingLot.INSTANCE.getSpot(vehicle.getType());
        if(spot == null) return null;
        return buildTicket(vehicle.getVNum(), spot.getLotID());
    }

    private parkingTckt buildTicket(String vNum, String lotID) {
        parkingTckt tckt = new parkingTckt();
        tckt.setIssueDT(LocalDateTime.now());
        tckt.setAllocatedSpot(lotID);
        tckt.setTcktNum(UUID.randomUUID().toString());
        tckt.setStatus(TcktStatus.ACTIVE);
        return tckt;
    }
}
