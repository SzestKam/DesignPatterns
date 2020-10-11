package pattern.factory.computer;

import java.util.LinkedList;
import java.util.List;

class Computer {
    //must be
    private String HDD;
    private String RAM;
    private String CPU;

    //optional
    private String graphicCard;
    private String soundCard;
    private List<String> extraAddons = new LinkedList();

    public Computer(String HDD, String RAM, String CPU) {
        this.HDD = HDD;
        this.RAM = RAM;
        this.CPU = CPU;
    }

    public String getHDD() {
        return HDD;
    }

    public void setHDD(String HDD) {
        this.HDD = HDD;
    }

    public String getRAM() {
        return RAM;
    }

    public void setRAM(String RAM) {
        this.RAM = RAM;
    }

    public String getCPU() {
        return CPU;
    }

    public void setCPU(String CPU) {
        this.CPU = CPU;
    }

    public String getGraphicCard() {
        return graphicCard;
    }

    public void setGraphicCard(String graphicCard) {
        this.graphicCard = graphicCard;
    }

    public String getSoundCard() {
        return soundCard;
    }

    public void setSoundCard(String soundCard) {
        this.soundCard = soundCard;
    }

    public List getExtraAddons() {
        return extraAddons;
    }

    public void setExtraAddons(List extraAddons) {
        this.extraAddons = extraAddons;
    }

    @Override
    public String toString() {
        return String.format("HDD: %s, RAM: %s, CPU: %s, addons: %s", HDD, RAM, CPU, extraAddons.toString());
    }
}
