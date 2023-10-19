import depot.DumpaMera;
/*
    Gjord av Tobias Heidlund, Philip Norrmyr, Islam Mazayaev
     */

public class Main {
    public static void main(String[] args) {
        DumpaMera dumpaMera = new DumpaMera();

        new UserInterface(dumpaMera).ConsoleInteraction();
    }
}
