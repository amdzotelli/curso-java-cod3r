package fundamentos;

import static java.lang.System.*;

public class OperadoresUnarios {

    public static void main(String[] args) {

        int a = 1;
        int b = 2;

        a++; // a = a + 1
        a--; // a = a - 1

        ++b; // b = b + 1
        --b; // b = b - 1

        out.println(a);
        out.println(b);

        // diferença de precedência
        out.println(++a == b--);

        // código não é descritivo e de difícil leitura

    }

}
