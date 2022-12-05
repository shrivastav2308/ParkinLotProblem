import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Handicaped extends ParkingSpot{
    public Handicaped(String id) {
        super(id, SpotType.HANDICAPED);
    }
}
