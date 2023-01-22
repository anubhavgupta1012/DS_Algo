package designPatterns.factory.example3;

import java.io.File;

public class KiaCardBuilder extends CarBuilder {
    @Override
    public Car createCar(File file) {
        return new Kia(file);
    }
}
