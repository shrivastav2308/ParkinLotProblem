import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public abstract class Vehicle {
    private String vNum;
    private final VehicleType type;
    private parkingTckt ticket;

    public Vehicle(String vNum, VehicleType type){
        this.vNum = vNum;
        this.type = type;
    }
}
