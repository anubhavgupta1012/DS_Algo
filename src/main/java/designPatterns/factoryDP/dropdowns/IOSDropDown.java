package designPatterns.factoryDP.dropdowns;

public class IOSDropDown implements DropDown {
    @Override
    public void createDropDown() {
        System.out.println("DropDown created in IOS");
    }
}
