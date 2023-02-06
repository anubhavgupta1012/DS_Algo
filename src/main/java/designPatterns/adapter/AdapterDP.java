package designPatterns.adapter;


interface Pen {
    void write(String str);
}

class Pencil {
    public void writeTheTextByPencil(String str) {
        System.out.println("Writing By Pencil==>" + str);
    }
}


public class AdapterDP {
    public static void main(String[] args) {
        new PenAdapter().write("QWERTY QWERTY");
    }
}

/*
This is part where Adapter Pattern is applied, When we have Pen interface,
something by which we can write but doesn't implement Pen interface
*/
class PenAdapter implements Pen {
    @Override
    public void write(String str) {
        new Pencil().writeTheTextByPencil(str);
    }
}