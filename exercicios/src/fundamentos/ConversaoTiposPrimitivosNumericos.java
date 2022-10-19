package fundamentos;

import static java.lang.System.*;

public class ConversaoTiposPrimitivosNumericos {

    public static void main(String[] args) {

        double a = 1; // conversão implícita
        out.println(a);

        float b = 1.0F; // F para tornar o literal um float

        float b2 = (float) 1.12345678999999; // conversão explícita (CAST)
        out.println(b2);

        int c = 340;
        byte d = (byte) c; // explícita (CAST)
        out.println(d);

        double e = 1.9999999;
        int f = (int) e; // explícita (CAST)
        out.println(e);

    }

}
