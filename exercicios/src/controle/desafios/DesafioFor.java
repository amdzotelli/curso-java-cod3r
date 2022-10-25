package controle.desafios;

import static java.lang.System.*;

public class DesafioFor {

    public static void main(String[] args) {

        String valor = "#";

        for (int i  = 1; i <= 5;i++) {
            out.println(valor);
            valor += "#";
        }

        for (String v = "#"; !v.equals("######"); v += "#") {
            out.println(v);
        }
    }

}
