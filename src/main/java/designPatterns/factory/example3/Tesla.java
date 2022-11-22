package designPatterns.factory.example3;

import java.io.File;
import java.util.List;

public class Tesla implements Car {
    public Tesla(File file) {
        System.out.println("Created a Tesla Model");
    }

    public List<Records> testDriveCar() {
        System.out.println("Driving Tesla Car");
        return null;
    }
}
