package controle;

import static java.lang.System.*;

public class WhileDeterminado {

    public static void main(String[] args) {

        int contador = 0;

        while (contador <= 20) {
            out.printf("i = %d %n", contador);
            contador += 2;
        }

    }

}
