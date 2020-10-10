package pattern.factory;

class Main {
    public static void main(String[] args) {

        Computer homePc = FactoryComputer.makeComputer('H');
        Computer raspberryPi = FactoryComputer.makeComputer('P');
        Computer server = FactoryComputer.makeComputer('S');


        System.out.println("Configuration:");
        System.out.println(homePc);
        System.out.println("Configuration:");
        System.out.println(raspberryPi);
        System.out.println("Configuration:");
        System.out.println(server);
        
        ColorFactory cf = new ColorFactory();
        ShapeFactory sf = new ShapeFactory();
        
        System.out.println("COLORS");
        System.out.println(cf.getColor("R"));
        System.out.println(cf.getColor("B"));
        System.out.println(cf.getColor("W"));
        
        System.out.println("SHAPES");
        System.out.println(sf.getShape("C"));
        System.out.println(sf.getColor("W"));
    }
}
