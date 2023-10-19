package depot;

import vehicles.AbstractVehicle;
import vehicles.VehicleType;

public class LoadingBay {

    private AbstractVehicle assingedVehicle;
    private final int maxWeight;
    private final VehicleType[] acceptableTypes;

    public LoadingBay(int maxWeight, VehicleType[] type){
        this.maxWeight = maxWeight;
        this.acceptableTypes = type;
    }
    public LoadingBay(VehicleType[] type){
        this.maxWeight = Integer.MAX_VALUE;
        this.acceptableTypes = type;
    }

    public void AssignVehicle(AbstractVehicle vehicle) {
        this.assingedVehicle = vehicle;
    }


    public boolean canAcceptVehicle(AbstractVehicle vehicle){
        boolean isAcceptableType = false;
        boolean isAcceptableWeight = false;

        for (VehicleType acceptableType : acceptableTypes) {
            if (vehicle.getType() == acceptableType){
               isAcceptableType = true;
               break;
            }
        }

        if(vehicle.getWeight()<maxWeight){
            isAcceptableWeight = true;
        }


        return isAcceptableType && isAcceptableWeight && assingedVehicle==null;
    }


    @Override
    public String toString() {
        if(assingedVehicle !=null){
            return assingedVehicle.toString();
        }else return "";

    }
}
