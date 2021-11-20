package shoppingSystem.items.clothes;

import shoppingSystem.items.Item;

public class Shoes implements Item {
    private static final String name = "Shoes";
    private static final double price = 35;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        return price;
    }
}
