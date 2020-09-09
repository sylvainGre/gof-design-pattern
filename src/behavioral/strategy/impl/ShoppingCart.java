package behavioral.strategy.impl;

import behavioral.strategy.model.Item;
import behavioral.strategy.model.PaymentStrategy;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    List<Item> items;

    public ShoppingCart(){
        this.items = new ArrayList<>();
    }

    public void addItem(Item item){
        this.items.add(item);
    }

    public void removeItem(Item item){
        this.items.remove(item);
    }

    public int calculateTotal(){
        int sum = 0;
        sum = this.items.stream().map(item -> item.getPrice()).reduce(sum, (item,y)-> item+y);
        return sum;
    }

    public void pay(PaymentStrategy paymentMethode){
        int amount = calculateTotal();
        paymentMethode.pay(amount);
    }
}
