package designPatterns.factory.example1;

public class FakeFactory1 {
    public static void main(String[] args) {
        FakeFactory1 fakeFactory = new FakeFactory1();
        fakeFactory.carProcessor("Sedan");
    }

    public void carProcessor(String name) {
        ProcessMG processMg = new ProcessMG(name);
        processMg.exploringPrice(name);
        finalizing(name);
    }

    private void finalizing(String name) {
        System.out.println("finalizing  for " + name);
    }
}

class ProcessMG {
    public ProcessMG(String name) {
        System.out.println("Exploring MG Catalog in " + name + " section");
    }

    public void exploringPrice(String name) {
        System.out.println("exploring Price in MG in  " + name);
    }
}