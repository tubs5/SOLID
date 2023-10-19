package depot;

import vehicles.VehicleType;


public class DumpaMera extends Depot{
    public DumpaMera(){
        loadingBays.put('A',new LoadingBay(5000,new VehicleType[]{VehicleType.Van,VehicleType.SmallTruck}));
        loadingBays.put('B',new LoadingBay(new VehicleType[]{VehicleType.Van}));
        loadingBays.put('C',new LoadingBay(new VehicleType[]{VehicleType.SmallTruck}));
        loadingBays.put('D',new LoadingBay(9000,new VehicleType[]{VehicleType.SmallTruck,VehicleType.HeavyTruck}));
        loadingBays.put('E',new LoadingBay(new VehicleType[]{VehicleType.HeavyTruck}));
    }


}
