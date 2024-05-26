package designPatterns.decorator.scoops;

import designPatterns.decorator.Icecream;

public class ChocolateScoop implements Scoop {
    Icecream icecream;

    public ChocolateScoop(Icecream icecream) {
        this.icecream = icecream;
    }

    @Override
    public int getPrice() {
        int price = 10;
        return icecream == null ? price : icecream.getPrice() + price;
    }

    @Override
    public String getDesc() {
        String desc = " Chocolate Scoop";
        return icecream == null ? desc : icecream.getDesc() + desc;
    }
}
