package vehicles;

public class HeavyTruck extends AbstractVehicle{
    public HeavyTruck(int weight){
        this.setWeight(weight);
        this.setType(VehicleType.HeavyTruck);
    }
}
