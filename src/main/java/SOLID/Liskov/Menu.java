package SOLID.Liskov;

import lombok.Data;

@Data
class Menu {
    private String item;
    private int price;
    private String desc;

    public int getPrice() {
        return this.price - price * getDiscount() / 100;
    }

    private int getDiscount() {
        return 0;
    }
}

class Beverages extends Menu {

    public int getPrice() {
        int price = super.getPrice();
        return price - price * getDiscount() / 100;
    }

    private int getDiscount() {
        return 10;
    }
}

class LiskovMain {
    public static void main(String[] args) {

        Menu rice = new Menu();
        rice.setItem("Rice");
        rice.setDesc("Rice");
        rice.setPrice(100);

        Menu coldCoffee = new Beverages();
        coldCoffee.setItem("Cold Cofee");
        coldCoffee.setDesc("Cold Cofee");
        coldCoffee.setPrice(150);

        System.out.println(calculatePrice(rice));
        System.out.println(calculatePrice(coldCoffee));
    }

    public static int calculatePrice(Menu menu) {
        return menu.getPrice();
    }
}

