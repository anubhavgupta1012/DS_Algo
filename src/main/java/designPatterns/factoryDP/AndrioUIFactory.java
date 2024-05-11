package designPatterns.factoryDP;

import designPatterns.factoryDP.buttons.AndriodButton;
import designPatterns.factoryDP.buttons.Button;
import designPatterns.factoryDP.dropdowns.AndriodDropDown;
import designPatterns.factoryDP.dropdowns.DropDown;
import designPatterns.factoryDP.dropdowns.IOSDropDown;
import designPatterns.factoryDP.menus.AndriodMenu;
import designPatterns.factoryDP.menus.Menu;

public class AndrioUIFactory implements UIFactory {
    @Override
    public AndriodMenu createMenu() {
        return new AndriodMenu();
    }

    @Override
    public AndriodDropDown createDropDown() {
        return new AndriodDropDown();
    }

    @Override
    public AndriodButton createButton() {
        return new AndriodButton();
    }
}
