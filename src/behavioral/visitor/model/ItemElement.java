package behavioral.visitor.model;

public interface ItemElement {
    public int accept(ShoppingCartVisitor shoppingCartVisitor);
}
