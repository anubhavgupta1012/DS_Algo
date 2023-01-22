package designPatterns.factory.example2;

public class FakeFactory2 {

    public static void main(String[] args) {
        // at runtime
        FakeFactory2 fakeFactory = new FakeFactory2();
        fakeFactory.carProcessor("Sedan", "tesla"); //  ==> @RunTimea any value could be given instaead Of Tesla
    }

    public void carProcessor(String name, String company) {
        if (company.equalsIgnoreCase("MG")) {
            MG mg = new MG(name);
            mg.exploringPrice(name);
        } else if (company.equalsIgnoreCase("Tesla")) {
            Tesla tesla = new Tesla(name);
            tesla.exploringPrice(name);
        } else if (company.equalsIgnoreCase("KIA")) {
            KIA KIA = new KIA(name);
            KIA.exploringPrice(name);
        }
        finalizing(name);
    }

    private void finalizing(String name) {
        System.out.println("finalizing  for " + name);
    }
}

class Tesla {
    public Tesla(String name) {
        System.out.println("Exploring Tesla Catalog in " + name + " section");
    }

    public void exploringPrice(String name) {
        System.out.println("exploring Price in Tesla in  " + name);
    }
}

class MG {
    public MG(String name) {
        System.out.println("Exploring MG Catalog in " + name + " section");
    }

    public void exploringPrice(String name) {
        System.out.println("exploring Price in MG in  " + name);
    }
}

class KIA {
    public KIA(String name) {
        System.out.println("Exploring KIA Catalog in " + name + " section");
    }

    public void exploringPrice(String name) {
        System.out.println("exploring Price in KIA in  " + name);
    }
}

class A {
    public static void main(String[] args) {
        int i = 0;
        int sum = 0;
        while (i < 100) {
            sum = sum + i;
            sum = i + sum;
            i += 1;
        }
        System.out.println(sum);
    }

    public int fib(int n) {
        if (n <= 1) {
            return n;
        }
        return fib(n - 1) + fib(n - 2);
    }
}
