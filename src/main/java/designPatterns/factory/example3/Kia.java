package designPatterns.factory.example3;

import java.io.File;
import java.util.List;

public class Kia implements Car {
    public Kia(File file) {
        System.out.println("Created a Kia Model");
    }

    public List<Records> testDriveCar() {
        System.out.println("Driving KIA Car");
        return null;
    }
}
