package shoppingSystem.items.entertainment;

import shoppingSystem.items.Item;

public class Card implements Item {
    private static final String name = "Card";
    private static final double price = 5;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        return price;
    }
}
