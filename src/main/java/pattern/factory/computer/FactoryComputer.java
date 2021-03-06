package pattern.factory.computer;

class FactoryComputer {

    public static Computer makeComputer(char type) {
        switch (type) {
            case 'H': {
                return new HomeComputer("1TB", "32GB",
                        "Xenon 8gen", "1080TI", "embedded").build();
            }
            case 'P': {
                PiComputer piPc = new PiComputer("8GB", "512MB", "1GHz");
                piPc.addDisplay("10cal");
                piPc.addKeyboard("PL102");

                return piPc.build();
            }
            case 'S': {
                return new HomeComputer("10TB", "128GB",
                        "Xenon 8gen x32", "VGA", "").build();
            }

            case 'L' : {
                Laptop laptop = new Laptop("512GB SSD", "16GB", "AMD Razen 5");
                laptop.attachDockingStation();
                return laptop;
            }
        }
        return null;
    }
}
