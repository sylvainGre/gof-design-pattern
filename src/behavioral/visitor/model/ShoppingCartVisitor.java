package behavioral.visitor.model;

public interface ShoppingCartVisitor {
    int visit(Book book);
    int visit(Fruit fruit);
}
