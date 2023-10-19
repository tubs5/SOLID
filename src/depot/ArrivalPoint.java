package depot;

import vehicles.*;

import java.util.Map;

public class ArrivalPoint {

    final Map<Character, LoadingBay> loadingBays;

    public ArrivalPoint(Map<Character, LoadingBay> loadingBays) {
        this.loadingBays = loadingBays;
    }

    public char generateNewTruck(VehicleType type,int weight){
        AbstractVehicle vehicle;
        switch (type){
            case Van -> vehicle = new Van(weight);
            case SmallTruck -> vehicle = new SmallTruck(weight);
            default ->  vehicle = new HeavyTruck(weight);
        }
        return assignTruckToDock(vehicle);

    }

    public char assignTruckToDock(AbstractVehicle vehicle){

        for (char loadingBayKeys : loadingBays.keySet()) {
            LoadingBay loadingBay = loadingBays.get(loadingBayKeys);
            if(loadingBay.canAcceptVehicle(vehicle)){
                loadingBay.AssignVehicle(vehicle);
                return loadingBayKeys;
            }
        }
        return ' ';
    }

}
