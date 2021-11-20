package shoppingSystem.items.food;

import shoppingSystem.items.Item;

public class Fish implements Item {
    private static final String name = "Fish";
    private static final double price = 9;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        return price;
    }
}
