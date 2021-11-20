package shoppingSystem.items.entertainment;

import shoppingSystem.items.Item;

public class Football implements Item {
    private static final String name = "Football";
    private static final double price = 25;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        return price;
    }
}
