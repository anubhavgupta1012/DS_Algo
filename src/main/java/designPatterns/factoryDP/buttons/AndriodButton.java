package designPatterns.factoryDP.buttons;

public class AndriodButton implements Button {
    @Override
    public void createButton() {
        System.out.println("Buttton created in Andriod");
    }
}
