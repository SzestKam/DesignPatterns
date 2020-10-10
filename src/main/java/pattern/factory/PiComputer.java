package pattern.factory;

class PiComputer {

    private Computer pi;

    //optional
    private String display;
    private String extendedBoard;
    private String keyboard;
    private String wifi;

    public PiComputer(String SD, String RAM, String CPU) {
        pi = new Computer(SD, RAM, CPU);
    }

    public void addDisplay(String display) {
        this.display = display;
    }

    public void addExtendedBoard(String extendedBoard) {
        this.extendedBoard = extendedBoard;
    }

    public void addKeyboard(String keyboard) {
        this.keyboard = keyboard;
    }

    public void addWifi(String wifi) {
        this.wifi = wifi;
    }

    public Computer build() {
        if (wifi != null) {
            pi.getExtraAddons().add(wifi);
        }

        if (keyboard != null) {
            pi.getExtraAddons().add(keyboard);
        }

        if (extendedBoard != null) {
            pi.getExtraAddons().add(extendedBoard);
        }

        if (display != null) {
            pi.setGraphicCard(display);
        }

        return pi;
    }
}
