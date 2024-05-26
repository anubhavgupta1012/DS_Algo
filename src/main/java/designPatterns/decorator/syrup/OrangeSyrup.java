package designPatterns.decorator.syrup;

import designPatterns.decorator.Icecream;

public class OrangeSyrup implements Icecream {
    Icecream icecream;

    public OrangeSyrup(Icecream icecream) {
        this.icecream = icecream;
    }

    @Override
    public int getPrice() {
        int price = 15;
        return icecream == null ? price : icecream.getPrice() + price;
    }

    @Override
    public String getDesc() {
        String desc = " Orange Syrup";
        return icecream == null ? desc : icecream.getDesc() + desc;
    }
}
