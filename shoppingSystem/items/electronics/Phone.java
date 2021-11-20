package shoppingSystem.items.electronics;

import shoppingSystem.items.Item;

public class Phone implements Item {
    private static final String name = "Phone";
    private static final double price = 500;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        return price;
    }
}
