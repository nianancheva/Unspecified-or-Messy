package shoppingSystem.items.entertainment;

import shoppingSystem.items.Item;

public class PS5 implements Item {
    private static final String name = "PS5";
    private static final double price = 499;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        return price;
    }
}
