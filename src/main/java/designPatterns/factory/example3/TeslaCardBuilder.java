package designPatterns.factory.example3;

import java.io.File;

public class TeslaCardBuilder extends CarBuilder {
    @Override
    public Car createCar(File file) {
        return new Tesla(file);
    }
}
