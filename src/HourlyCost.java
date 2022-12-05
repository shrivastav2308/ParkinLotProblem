import java.util.HashMap;
import java.util.Map;

public class HourlyCost {
    private Map<SpotType, Double> hourlyCost = new HashMap<>();

    public HourlyCost() {
        hourlyCost.put(SpotType.CAR, 20.0);
        hourlyCost.put(SpotType.LARGE, 30.0);
        hourlyCost.put(SpotType.ELECTRIC, 25.0);
        hourlyCost.put(SpotType.MOTORCYCLE, 10.0);
        hourlyCost.put(SpotType.HANDICAPED, 25.0);
    }
    public double getCost(SpotType spotType) {
        return hourlyCost.get(spotType);
    }
}
