import depot.DumpaMera;

public class Main {
    public static void main(String[] args) {
        DumpaMera dumpaMera = new DumpaMera();

        new UserInterface(dumpaMera).ConsoleInteraction();
    }
}