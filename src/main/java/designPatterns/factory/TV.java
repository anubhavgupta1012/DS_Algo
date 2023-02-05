package designPatterns.factory;

import org.jetbrains.annotations.NotNull;

interface TV {
    void createTV();
}

class Samsung implements TV {

    @Override
    public void createTV() {
        System.out.println("Creating Samsung TV");
    }
}

class Sony implements TV {

    @Override
    public void createTV() {
        System.out.println("Creating Sony TV");
    }
}

class DP {
    public static void main(String[] args) {
        String conditional = args[0];
        doTVOperation(conditional.equalsIgnoreCase("samsung") ? new Samsung() : new Sony());
    }

    public static void doTVOperation(@NotNull TV tv) {
        tv.createTV();
    }
}
