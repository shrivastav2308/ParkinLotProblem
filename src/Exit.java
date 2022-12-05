import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.Duration;
import java.time.LocalDateTime;

@Getter
@AllArgsConstructor
public class Exit {
    private  String id;

    public parkingTckt scanAndVacate(parkingTckt ticket) {
        ParkingSpot spot = ParkingLot.INSTANCE.vacateSpot(ticket.getAllocatedSpot());
        ticket.setCharge(calculateCost(ticket, spot.getSpotType()));
        return ticket;
    }
    private double calculateCost(parkingTckt ticket, SpotType spotType) {
        Duration duration = Duration.between(ticket.getIssueDT(), LocalDateTime.now());
        long hours = duration.toHours();
        if(hours == 0) hours = 1;
        double amount = hours * new HourlyCost().getCost(spotType);
        return amount;
    }
}
