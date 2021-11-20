package shoppingSystem;

import shoppingSystem.items.Item;
import shoppingSystem.items.clothes.*;
import shoppingSystem.items.electronics.*;
import shoppingSystem.items.entertainment.*;
import shoppingSystem.items.food.*;
import shoppingSystem.shoppingCart.ShoppingCart;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        StringBuilder str = new StringBuilder();
        str.append(String.format("PLease select one of the following categories (1 to 4):%n"));
        str.append(String.format("1- Electronics\n" +
                "2- Clothes\n" +
                "3- Food\n" +
                "4- Entertainment"));
        String menu = str.toString();

        System.out.println(menu);

        int category = Integer.parseInt(scan.nextLine());

        System.out.println("Please select one of the following items:");

        System.out.println(itemsByCategory(category));

        int itemNumber = Integer.parseInt(scan.nextLine());

        Item item = items(category, itemNumber);

        ShoppingCart cart = new ShoppingCart();

        cart.add(item);

        System.out.println(cart.addedProducts());
        System.out.println("Final Price: " + cart.getFinalPrice());

    }

    public static Item items (int category, int itemNumber) {

        Item item = null;

        switch (category) {
            case 1:
                if (itemNumber == 1) {
                    item = new TV();
                } else if (itemNumber == 2) {
                    item = new Phone();
                } else if (itemNumber == 3) {
                    item = new Camera();
                } else if (itemNumber == 4) {
                    item = new Printer();
                } else if (itemNumber == 5) {
                    item = new Laptop();
                }
                break;

            case 2:
                if (itemNumber == 1) {
                    item = new Shirt();
                } else if (itemNumber == 2) {
                    item = new Pants();
                } else if (itemNumber == 3) {
                    item = new Jacket();
                } else if (itemNumber == 4) {
                    item = new Suit();
                } else if (itemNumber == 5) {
                    item = new Shoes();
                }
                break;

            case 3:
                if (itemNumber == 1) {
                    item = new Rice();
                } else if (itemNumber == 2) {
                    item = new Flour();
                } else if (itemNumber == 3) {
                    item = new Juice();
                } else if (itemNumber == 4) {
                    item = new Chicken();
                } else if (itemNumber == 5) {
                    item = new Fish();
                }
                break;

            case 4:
                if (itemNumber == 1) {
                    item = new PS5();
                } else if (itemNumber == 2) {
                    item = new Lego();
                } else if (itemNumber == 3) {
                    item = new Football();
                } else if (itemNumber == 4) {
                    item = new Card();
                } else if (itemNumber == 5) {
                    item = new Skateboard();
                }
                break;
        }
        return item;
    }

    public static String itemsByCategory(int category) {
        StringBuilder str = new StringBuilder();

        switch (category) {
            case 1:
                str.append(String.format("1- 4K Tv $1000\n" +
                        "2- Phone $500\n" +
                        "3- Camera $750\n" +
                        "4- Printer $250\n" +
                        "5- Laptop $1250\n"));
                break;

            case 2:
                str.append(String.format("1- Shirt $50\n" +
                        "2- Pants $65\n" +
                        "3- Jacket $90\n" +
                        "4- Suit $275\n" +
                        "5- Shoes $35\n"));
                break;

            case 3:
                str.append(String.format("1- Rice $10\n" +
                        "2- Flour $3\n" +
                        "3- Juice $2\n" +
                        "4- Chicken $7\n" +
                        "5- Fish $9\n"));
                break;

            case 4:
                str.append(String.format("1- PS5 $499\n" +
                        "2- LEGO $120\n" +
                        "3- Football $25\n" +
                        "4- Card $5\n" +
                        "5- Skateboard $65\n"));
                break;
        }

        str.append("6- Main Menu");

        return str.toString();
    }
}
