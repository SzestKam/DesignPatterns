package pattern.builder;

/**
 * @author Kamil Szestowicki
 */
public class ComputerPC {

    private String name;
    private String graphicCard;
    private int hddCapacity;
    private String screenResolution;
    private String cpuName; //**
    private int ramSize; //**
    private String mainBoard; //**

    private ComputerPC(PCMaker builder) {
        this.name = builder.name;
        this.graphicCard = builder.graphicCard;
        this.hddCapacity = builder.hddCapacity;
        this.screenResolution = builder.screenResolution;
        this.cpuName = builder.cpuName;
        this.ramSize = builder.ramSize;
        this.mainBoard = builder.mainBoard;
    }

    @Override
    public String toString() {
        return about();
    }
   
    public String about(){
        return "ComputerPC: \n\t" + "name=" + name + "\n\tgraphicCard=" + graphicCard + "\n\thddCapacity=" + hddCapacity + " GB\n\tscreenResolution=" + screenResolution + "\n\tcpuName=" + cpuName + "\n\tramSize=" + ramSize + "MB\n\tmainBoard=" + mainBoard;
    }

    public static class PCMaker {

        private String name;
        private String graphicCard;
        private int hddCapacity;
        private String screenResolution;
        private String cpuName; //**
        private int ramSize; //**
        private String mainBoard; //**

        public PCMaker(String cpuName, int ramSize, String mainBoard) {
            this.cpuName = cpuName;
            this.ramSize = ramSize;
            this.mainBoard = mainBoard;

            this.name = "Standard PC";
            this.graphicCard = "Integreted";
            this.hddCapacity = 0;
            this.screenResolution = "1024x768";
        }

        public PCMaker computerName(String name) {
            this.name = name;
            return this;
        }
        
        public PCMaker addGraphicCard(String card){
            this.graphicCard = card;
            return this;
        }
        
        public PCMaker addHDD(int hdd){
            this.hddCapacity = hdd;
            return this;
        }

        public PCMaker setScreenResolution(String resolution) {
            this.screenResolution = resolution;
            return this;
        }
        
        public ComputerPC build(){
            return new ComputerPC(this);
        }

    }

}
