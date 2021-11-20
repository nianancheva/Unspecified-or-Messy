package shoppingSystem.items.electronics;

import shoppingSystem.items.Item;

public class Camera implements Item {
    private static final String name = "Camera";
    private static final double price = 750;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        return price;
    }
}
