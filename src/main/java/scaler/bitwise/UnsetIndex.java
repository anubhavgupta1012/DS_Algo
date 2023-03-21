package scaler.bitwise;

public class UnsetIndex {
    public static void main(String[] args) {
        int n = 10;
        int i = 1;
        int x = n | (1 << i);
        int y = x ^ (1 << i);
        System.out.println(y);
    }
}
