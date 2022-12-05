import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Setter
@Getter
public class parkingTckt {
    private String tcktNum;
    private String vNum;
    private String allocatedSpot;
    private LocalDateTime issueDT;
    private LocalDateTime vacateDT;
    private double charge;
    private TcktStatus status;
}
