import lombok.Getter;
import lombok.Setter;

import java.util.BitSet;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedDeque;

public class ParkingFloor {
    @Setter
    @Getter
    private String floorID;
    @Getter
    private Map<SpotType, Deque<ParkingSpot>> spots = new HashMap<>();
    private Map<String, ParkingSpot> usedSpot = new HashMap<>();

    public ParkingFloor(String id) {
        this.floorID = id;
        spots.put(SpotType.HANDICAPED, new ConcurrentLinkedDeque<>());
        spots.put(SpotType.CAR, new ConcurrentLinkedDeque<>());
        spots.put(SpotType.LARGE, new ConcurrentLinkedDeque<>());
        spots.put(SpotType.MOTORCYCLE, new ConcurrentLinkedDeque<>());
        spots.put(SpotType.ELECTRIC, new ConcurrentLinkedDeque<>());
    }

    public boolean isFloorFull() {
        BitSet fullSet = new BitSet();
        int bitIndex = 0;
        for(Map.Entry<SpotType, Deque<ParkingSpot>> entry : spots.entrySet()) {
            if(entry.getValue().size() == 0) fullSet.set(bitIndex++);
            else break;
        }
        return fullSet.cardinality() == fullSet.size();
    }

    public static SpotType getSpotType(VehicleType vehicleType) {
        switch (vehicleType) {
            case CAR:
                return SpotType.CAR;
            case EV:
                return SpotType.ELECTRIC;
            case MOTORCYCLE:
                return SpotType.MOTORCYCLE;
            default:
                return SpotType.LARGE;
        }
    }

    public boolean canPark(VehicleType vehicleType) {
        return canPark(getSpotType(vehicleType));
    }

    public synchronized ParkingSpot getSpot(VehicleType vehicleType) {
        if(!canPark(getSpotType(vehicleType))) return null;
    }
}
