package designPatterns.factoryDP;

public class UIFactoryFactory {

    // Practical Factory DP
    public static UIFactory getUIFactory(SupportedPlatforms supportedPlatforms) {
        if (supportedPlatforms.equals(SupportedPlatforms.IOS))
            return new IOSUIFactory();
        else if (supportedPlatforms.equals(SupportedPlatforms.ANDROID))
            return new AndrioUIFactory();
        return null;
    }
}
