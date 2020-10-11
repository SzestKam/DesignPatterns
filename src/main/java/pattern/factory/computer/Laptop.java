package pattern.factory.computer;

public class Laptop extends Computer {
    private boolean hasDockingStation;
    public Laptop(String HDD, String RAM, String CPU) {
        super(HDD, RAM, CPU);
    }

    public boolean hasDockingStation() {
        return hasDockingStation;
    }

    public void attachDockingStation() {
        this.hasDockingStation = true;
    }
}
