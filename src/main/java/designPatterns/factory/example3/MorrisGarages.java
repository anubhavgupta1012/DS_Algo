package designPatterns.factory.example3;

import java.io.File;
import java.util.List;

public class MorrisGarages implements Car {
    public MorrisGarages(File file) {
        System.out.println("Created a MorrisGarages Model");
    }

    public List<Records> testDriveCar() {
        System.out.println("Driving MG Car");
        return null;
    }
}
