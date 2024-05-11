package designPatterns.factoryDP;

import designPatterns.factoryDP.buttons.Button;
import designPatterns.factoryDP.dropdowns.DropDown;
import designPatterns.factoryDP.menus.Menu;

public interface UIFactory {

    // All methods are Factory Methods,as they can return different type of Menu, DropDown and Buttons at runtime
    Menu createMenu();

    DropDown createDropDown();

    Button createButton();
}
