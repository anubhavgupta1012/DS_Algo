package designPatterns.factoryDP.dropdowns;

public class AndriodDropDown implements DropDown {
    @Override
    public void createDropDown() {
        System.out.println("DropDown created in Android");
    }
}
