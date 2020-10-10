package pattern.visitor;

interface Element {
    float accept(MyVisitor visitor);
}
