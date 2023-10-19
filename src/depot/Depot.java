package depot;

import java.util.HashMap;
import java.util.Map;

public abstract class Depot {

    protected final Map<Character,LoadingBay> loadingBays= new HashMap<>();
    protected final ArrivalPoint arrivalPoint = new ArrivalPoint(loadingBays);

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (Character character : loadingBays.keySet()) {
            stringBuilder.append(character).append(" - ")
                    .append(loadingBays.get(character).toString()).append("\n");
        }
        return stringBuilder.toString();
    }

    public ArrivalPoint getArrivalPoint() {
        return arrivalPoint;
    }
}
