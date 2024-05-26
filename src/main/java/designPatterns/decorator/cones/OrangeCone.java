package designPatterns.decorator.cones;

import designPatterns.decorator.Icecream;

public class OrangeCone implements Cone {
    Icecream icecream;

    public OrangeCone(Icecream icecream) {
        this.icecream = icecream;
    }

    @Override
    public int getPrice() {
        return icecream == null ? 10 : icecream.getPrice() + 10;
    }

    @Override
    public String getDesc() {
        String desc = " Orange Cone";
        return icecream == null ? desc : icecream.getDesc() + desc;
    }
}
