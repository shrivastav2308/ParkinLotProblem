import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class ParkingSpot {
    private String lotID;
    private boolean isFree;
    private SpotType spotType;
    private String assignedID;

    public ParkingSpot(String lotID, SpotType spotType) {
        this.lotID = lotID;
        this.spotType = spotType;
    }

    public void assigned(String vID) {
        this.assignedID = vID;
    }
    public void freeSpot(){
        this.isFree = true;
        this.assignedID = null;
    }
}