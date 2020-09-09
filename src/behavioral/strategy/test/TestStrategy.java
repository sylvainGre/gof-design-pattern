package behavioral.strategy.test;

import behavioral.strategy.impl.CreditCardStrategy;
import behavioral.strategy.impl.PaypalStrategy;
import behavioral.strategy.impl.ShoppingCart;
import behavioral.strategy.model.Item;

public class TestStrategy {

    public static void main(String[] args){

        ShoppingCart shoppingCart = new ShoppingCart();
        Item item1 = new Item("1234",10);
        Item item2 = new Item("4567", 44);
        shoppingCart.addItem(item1);
        shoppingCart.addItem(item2);

        shoppingCart.pay(new CreditCardStrategy("User","pin","654","23/10"));
        shoppingCart.pay(new PaypalStrategy("myemail@example.com", "mypwd"));
    }
}
