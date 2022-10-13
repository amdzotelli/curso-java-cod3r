package fundamentos;

import static java.lang.System.*;

public class NotacaoPonto {

    public static void main(String[] args) {

        String s = "Bom Dia.";

        s = s.replace(".", " Unicórnio");
        s = s.toUpperCase();
        s = s.concat("!!");

        out.println(s);

        out.println("Amanda".toUpperCase());

        String y = "Boa noite X"
                .replace("X", "Pessoa")
                .toUpperCase()
                .concat("...");

        out.println(y);
        
        // tipos primitivos não tem o operador "."

        int a = 3;
        out.println(a);

    }
}
