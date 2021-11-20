package shoppingSystem.items.entertainment;

import shoppingSystem.items.Item;

public class Lego implements Item {
    private static final String name = "LEGO";
    private static final double price = 120;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        return price;
    }
}
