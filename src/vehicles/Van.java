package vehicles;

public class Van extends AbstractVehicle{
    public Van(int weight) {
        this.setWeight(weight);
        this.setType(VehicleType.Van);
    }
}
