package designPatterns.factoryDP;

import designPatterns.factoryDP.buttons.Button;
import designPatterns.factoryDP.buttons.IOSButton;
import designPatterns.factoryDP.dropdowns.DropDown;
import designPatterns.factoryDP.dropdowns.IOSDropDown;
import designPatterns.factoryDP.menus.IOSMenu;
import designPatterns.factoryDP.menus.Menu;

public class IOSUIFactory implements UIFactory {
    @Override
    public IOSMenu createMenu() {
        return new IOSMenu();
    }

    @Override
    public IOSDropDown createDropDown() {
        return new IOSDropDown();
    }

    @Override
    public IOSButton createButton() {
        return new IOSButton();
    }
}
