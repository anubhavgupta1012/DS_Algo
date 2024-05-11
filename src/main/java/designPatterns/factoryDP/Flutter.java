package designPatterns.factoryDP;

public class Flutter {
    private SupportedPlatforms supportedPlatforms;

    public Flutter(SupportedPlatforms supportedPlatforms) {
        this.supportedPlatforms = supportedPlatforms;
    }

    public void setTheme(String theme) {
        System.out.println("Theme set:: " + theme);
    }

    public UIFactory getUIfactory() {
        return UIFactoryFactory.getUIFactory(supportedPlatforms);
    }
}
