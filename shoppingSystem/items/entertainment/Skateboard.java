package shoppingSystem.items.entertainment;

import shoppingSystem.items.Item;

public class Skateboard implements Item {
    private static final String name = "Skateboard";
    private static final double price = 65;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        return price;
    }
}
