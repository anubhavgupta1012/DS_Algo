package designPatterns.factoryDP.buttons;

public class IOSButton implements Button {
    @Override
    public void createButton() {
        System.out.println("Buttton created in IOS");
    }
}
