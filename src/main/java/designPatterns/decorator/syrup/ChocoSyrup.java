package designPatterns.decorator.syrup;

import designPatterns.decorator.Icecream;

public class ChocoSyrup implements Icecream {

    Icecream icecream;

    public ChocoSyrup(Icecream icecream) {
        this.icecream = icecream;
    }

    @Override
    public int getPrice() {
        int price = 20;
        return icecream == null ? price : icecream.getPrice() + price;
    }

    @Override
    public String getDesc() {
        String desc = " Chocolate Syrup";
        return icecream == null ? desc : icecream.getDesc() + desc;
    }
}
