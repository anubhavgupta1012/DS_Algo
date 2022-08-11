package com.ds.coreJava;

class A {
    int x;
}
class B extends A {
    int x;
}
class C extends B {
    int x;

    void set(int val) {
        ((A) this).x = val;
        super.x = val + 10;
        x = val + 20;
    }
    void show() {
        System.out.println(((A) this).x);
        System.out.println(((B) this).x);
        System.out.println(((C) this).x);
    }
}
class mainClass {
    public static void main(String[] args) {
        C z = new C();
        z.set(100);
        z.show();
    }
}