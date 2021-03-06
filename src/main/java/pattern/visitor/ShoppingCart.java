package pattern.visitor;

import java.util.LinkedList;
import java.util.List;

class ShoppingCart {
    private static List<Element> shoppingCart = new LinkedList<Element>();

    public static void main(String[] args) {
        shoppingCart.add(new Book("Delikatne uderzenie pioruna", 99.99f, 0.8f));
        shoppingCart.add(new Book("Wiedzmin", 29.99f, 1.08f));

        shoppingCart.add(new DiscDVD("Blue Planet II", 120.90f, 0.1f));
        shoppingCart.add(new DiscDVD("Depeche Mode - legacy", 99.99f, 0.1f));

        shoppingCart.add(new Perfume("No.5", 200f, 0.5f));
        shoppingCart.add(new Perfume("Paco", 210f, 0.6f));

        summarizedPrice(shoppingCart);
        calculateWeight(shoppingCart);
    }
    private static void calculateWeight(List<Element> shoppingCart) {
        DeliveryVisitor visitor = new DeliveryVisitor();
        System.out.println(String.format("Total weight: %.2f", getValue(shoppingCart, visitor)));
    }
    private static void summarizedPrice(List<Element> shoppingCart) {
        ShoppingVisitor visitor = new ShoppingVisitor();
        System.out.println(String.format("All costs: %.2f", getValue(shoppingCart, visitor)));
    }
    private static float getValue(List<Element> shoppingCart, MyVisitor visitor) {
        float sum = 0f;
        for (Element item : shoppingCart) {
            sum += item.accept(visitor);
        }
        return sum;
    }
}
