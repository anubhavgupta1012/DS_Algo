package scaler.bitwise;

public class CountSetBits {
    public static void main(String[] args) {
        int n = 7;
        int count = 0;
        for (int i = 0; i <= 31; i++) {
            if ((n & (1 << i)) != 0)
                count++;
        }
        System.out.println(count);
    }
}
