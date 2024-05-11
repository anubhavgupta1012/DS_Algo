package designPatterns.factoryDP.menus;

public class IOSMenu implements Menu {
    @Override
    public void createMenu() {
        System.out.println("Menu created in IOS");
    }
}
