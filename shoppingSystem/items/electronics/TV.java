package shoppingSystem.items.electronics;

import shoppingSystem.items.Item;

public class TV implements Item {

    private static final String name = "4K Tv";
    private static final double price = 1000;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        return price;
    }
}
