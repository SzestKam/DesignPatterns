package pattern.visitor;

interface MyVisitor {

    float visit(Book book);

    float visit(DiscDVD discDVD);

    float visit(Perfume perfume);

}
