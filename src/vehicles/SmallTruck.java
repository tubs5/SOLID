package vehicles;

public class SmallTruck extends AbstractVehicle{
    public SmallTruck(int weight){
        this.setWeight(weight);
        this.setType(VehicleType.SmallTruck);
    }
}
