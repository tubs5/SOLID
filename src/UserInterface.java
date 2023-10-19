import depot.ArrivalPoint;
import depot.DumpaMera;
import vehicles.*;

import java.util.Scanner;

@SuppressWarnings("SpellCheckingInspection")
public class UserInterface {
    final Scanner scanner = new Scanner(System.in);
    final DumpaMera dumpaMera;

    public UserInterface(DumpaMera dumpaMera) {
        this.dumpaMera = dumpaMera;
    }

    public void ConsoleInteraction() {

        boolean isDone = false;

        while (!isDone) {
            System.out.println("""
                    – Avlastningsstationen Dumpa Mera –\s
                    1. Se parkerade lastbilar
                    2. Registrera ny avlastande lastbil
                    3. Avsluta
                    """);

            int userInput = Integer.parseInt(scanner.nextLine());

            if (userInput == 1) {
                parkedTrucks();
            } else if (userInput == 2) {
                dockNewTruck();
            } else {
                isDone = true;
            }
        }
        scanner.close();
    }


    public void parkedTrucks() {
        System.out.println(dumpaMera.toString());
    }


    public void dockNewTruck() {
        System.out.println("""
                Typ av lastbil:
                1. Skåpbil
                2. Lätt lastbil
                3. Tung lastbil
                """);
        int userInput = Integer.parseInt(scanner.nextLine());
        ArrivalPoint arrivalPoint = dumpaMera.getArrivalPoint();
        char dockingBay;

        if (userInput == 1) {
            System.out.println("Vikt på Skåpbil: ");
            int assignedWeight = Integer.parseInt(scanner.nextLine());
            dockingBay = arrivalPoint.generateNewTruck(VehicleType.Van, assignedWeight);
        } else if (userInput == 2) {
            System.out.println("Vikt på Lätt lastbil : ");
            int assignedWeight = Integer.parseInt(scanner.nextLine());
            dockingBay = arrivalPoint.generateNewTruck(VehicleType.SmallTruck, assignedWeight);

        } else {
            System.out.println("Vikt på Tung lastbil : ");
            int assignedWeight = Integer.parseInt(scanner.nextLine());
            dockingBay = arrivalPoint.generateNewTruck(VehicleType.HeavyTruck, assignedWeight);

        }

        if (dockingBay == ' ') {
            System.out.println("Tyvärr är det fullt, hänvisa förare till annan station");
        } else {
            System.out.println("Fordon registrerad för kaj " + dockingBay);
        }


    }

}
