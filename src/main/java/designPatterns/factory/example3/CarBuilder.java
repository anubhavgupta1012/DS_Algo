package designPatterns.factory.example3;

import java.io.File;
import java.util.List;

public abstract class CarBuilder {
    public void runProcessStream(String companyName, String format) {
        File configurationFile = openFile(companyName);
        List<Records> records = null;
        Car car = createCar(configurationFile);
        car.testDriveCar();
        betaTestingRecords(records);
        writeReportSummaryForCar();
        closeFile(configurationFile);
    }

    public abstract Car createCar(File file);

    private void betaTestingRecords(List<Records> records) {
        System.out.println("processing each Records one by one");
    }

    private void writeReportSummaryForCar() {
        System.out.println("writing the summary about the Car");
    }

    private void closeFile(File configurationFile) {
        System.out.println("closing the configuration file " + configurationFile);
    }

    private File openFile(String fileName) {
        System.out.println("opening the configuration file of car");
        return null;
    }
}
