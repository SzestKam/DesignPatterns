package pattern.visitor;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
class Book implements Element {

    @Getter
    private String title;
    @Getter
    private float price;
    @Getter
    private float weight;

    public float accept(MyVisitor visitor) {
        return visitor.visit(this);
    }

}
