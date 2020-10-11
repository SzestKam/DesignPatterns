package pattern.factory.computer;

class HomeComputer {

    private Computer computer;

    public HomeComputer(String HDD, String RAM, String CPU, String graphics, String sound) {
        computer = new Computer(HDD, RAM, CPU);
        computer.setGraphicCard(graphics);
        computer.setSoundCard(sound);
    }

    public Computer build() {
        return computer;
    }
}
