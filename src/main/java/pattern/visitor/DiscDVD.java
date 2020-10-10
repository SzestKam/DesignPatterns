package pattern.visitor;

class DiscDVD implements Element {

    private String title;
    private float price;
    private float weight;
    private boolean inPromotion = false;

    public DiscDVD(String title, float price, float weight) {
        this.title = title;
        this.price = price;
        this.weight = weight;
    }

    public float accept(MyVisitor visitor) {
        return visitor.visit(this);
    }

    public String getTitle() {
        return title;
    }

    public float getPrice() {
        return price;
    }

    public float getWeight() {
        return weight;
    }

    public boolean isInPromotion() {
        return inPromotion;
    }

    public void setInPromotion(boolean inPromotion) {
        this.inPromotion = inPromotion;
    }
}
