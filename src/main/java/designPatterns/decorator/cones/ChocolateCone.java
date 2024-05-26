package designPatterns.decorator.cones;

import designPatterns.decorator.Icecream;

public class ChocolateCone implements Cone {

    Icecream icecream;

    public ChocolateCone(Icecream icecream) {
        this.icecream = icecream;
    }

    public int getPrice() {
        return icecream == null ? 30 : icecream.getPrice() + 30;
    }

    @Override
    public String getDesc() {
        String desc = " Chocolate Cone";
        return icecream == null ? desc : icecream.getDesc() + desc;
    }
}
