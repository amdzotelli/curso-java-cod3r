package fundamentos;

import static java.lang.System.*;

public class PrimitivoVsObjeto {

    public static void main(String[] args) {

        String s = new String("texto");
        s.toUpperCase();

        // Wrappers são a versão objeto dos tipos pprimitivos

        int a = 123;
        out.println(a);
    }
}
