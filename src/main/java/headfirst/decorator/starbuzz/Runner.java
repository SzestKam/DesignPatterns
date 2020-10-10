package headfirst.decorator.starbuzz;

public class Runner {
    public static void main(String[] args) {
        Beverage beverage = new Milk(new Whip(new Espresso()));
        System.out.println(beverage.getDescription());
        System.out.println(beverage.cost());

    }
}
