package fundamentos;

import static java.lang.System.*;

public class OperadoresAtribuicao {

    public static void main(String[] args) {

        int a = 3;
        int b = a;
        int c = a + b;

        c += b; // c = c + b
        c -= a; // c = c - a
        c *= b; // c = c * b
        c /= a; // c = c / a
        out.println(c);

        c %= 2; // c = c % 2; 0 ou 1
        out.println(c);

    }
}
