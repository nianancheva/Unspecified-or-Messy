package shoppingSystem.items.clothes;

import shoppingSystem.items.Item;

public class Shirt implements Item {
    private static final String name = "Shirt";
    private static final double price = 50;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        return price;
    }
}
