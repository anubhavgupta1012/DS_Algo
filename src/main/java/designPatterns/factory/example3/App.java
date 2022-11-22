package designPatterns.factory.example3;

public class App {
    public static void main(String[] args) {
        //String format = args[0];
        String format = "mg";
        CarBuilder carBuilder = createCarBuilder(format);
        carBuilder.runProcessStream("file1", format);
    }

    private static CarBuilder createCarBuilder(String format) {
        CarBuilder carBuilder;
        if (format.equalsIgnoreCase("kia")) {
            carBuilder = new KiaCardBuilder();
        } else if (format.equalsIgnoreCase("mg")) {
            carBuilder = new MGCardBuilder();
        } else if (format.equalsIgnoreCase("tesla")) {
            carBuilder = new TeslaCardBuilder();
        } else carBuilder = null;
        return carBuilder;
    }
}
