package designPatterns.factoryDP;

import designPatterns.factoryDP.buttons.Button;
import designPatterns.factoryDP.dropdowns.DropDown;
import designPatterns.factoryDP.menus.Menu;

public class Client {
    public static void main(String[] args) {
        Flutter flutter = new Flutter(SupportedPlatforms.IOS);
        flutter.setTheme("Dark");
        UIFactory uIfactory = flutter.getUIfactory();
        Button button = uIfactory.createButton();
        button.createButton();
        DropDown dropDown = uIfactory.createDropDown();
        dropDown.createDropDown();
        Menu menu = uIfactory.createMenu();
        menu.createMenu();


    }
}
