package fundamentos;

import static java.lang.System.*;

public class OperadoresRelacionais {

    public static void main(String[] args) {

        int a = 97;
        int b = 'a';
        // Não recomendado porém é possível, existe.

        out.println(a == b);
        out.println(30 != 7);
        out.println(3 > 4);
        out.println(3 >= 3);
        out.println(3 < 7);
        out.println(30 <= 7);

    }

}
