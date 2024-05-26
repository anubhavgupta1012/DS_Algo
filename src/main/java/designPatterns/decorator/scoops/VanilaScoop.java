package designPatterns.decorator.scoops;

import designPatterns.decorator.Icecream;

public class VanilaScoop implements Scoop {
    Icecream icecream;

    public VanilaScoop(Icecream icecream) {
        this.icecream = icecream;
    }

    @Override
    public int getPrice() {
        int price = 70;
        return icecream == null ? price : icecream.getPrice() + price;
    }

    @Override
    public String getDesc() {
        String desc = " Vanila Scoop";
        return icecream == null ? desc : icecream.getDesc() + desc;
    }
}
