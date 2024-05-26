package designPatterns.decorator;


import designPatterns.decorator.cones.*;
import designPatterns.decorator.scoops.ChocolateScoop;
import designPatterns.decorator.scoops.VanilaScoop;

public class DecoratorClient {
    public static void main(String[] args) {
        Icecream icecream =
                new ChocolateScoop(new ChocolateCone(new VanilaScoop(new ChocolateCone(new OrangeCone(null)))));
        System.out.println(icecream.getDesc());
        System.out.println(icecream.getPrice());


    }
}
