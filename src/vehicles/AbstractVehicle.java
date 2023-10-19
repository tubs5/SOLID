package vehicles;

public abstract class AbstractVehicle {
    private int weight;
    private VehicleType type;


    public int getWeight() {
        return weight;
    }

    protected void setWeight(int weight) {
        this.weight = weight;

    }

    public VehicleType getType() {
        return type;
    }

    protected void setType(VehicleType type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return type.toString() + " ["+weight+"kg]";
    }
}
