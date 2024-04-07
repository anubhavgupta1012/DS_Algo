package scaler.backtracking;

public class GenerateBalancedParanthesis {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("(");
        int n = 3;
        formBalancedParanthesis(n, 1, 0, sb);
    }

    static void formBalancedParanthesis(int n, int i, int closingParanthesis, StringBuilder sb) {

        if (i >= n) {
            completeAndPrintBalancedParanthesis(sb, closingParanthesis, i);
            return;
        }

        sb.append("(");
        formBalancedParanthesis(n, i + 1, closingParanthesis, sb);
        sb.setLength(sb.length() - 1);
        if (closingParanthesis < i) {
            sb.append(")");
            formBalancedParanthesis(n, i, closingParanthesis + 1, sb);
        }
    }

    static void completeAndPrintBalancedParanthesis(StringBuilder sb, int closingParanthesis, int i) {
        sb = new StringBuilder(sb);
        if (closingParanthesis < i) {
            for (int j = 1; j <= i - closingParanthesis; j++) {
                sb.append(")");
            }
        }
        System.out.println(sb);
    }
}


interface I {
    public static final int i = 1;
}