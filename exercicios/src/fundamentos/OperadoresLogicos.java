package fundamentos;

import static java.lang.System.*;

public class OperadoresLogicos {

    public static void main(String[] args) {

     boolean condicao1 = true;
     boolean condicao2 = 3 > 7;

        out.println(condicao1 && condicao2);
        out.println(condicao1 || condicao2);
        out.println(condicao1 ^ condicao2);
        out.println(!!condicao1);
        out.println(!condicao1);

//        out.println("\nTabela verdade E (And)");
//        out.println(true && true);
//        out.println(true && false);
//        out.println(false && true);
//        out.println(false && false);
//
//        out.println("\nTabela verdade OU (Or)");
//        out.println(true || true);
//        out.println(true || false);
//        out.println(false || true);
//        out.println(false || false);
//
//        out.println("\nTabela verdade OU Exclusivo (XOr)");
//        out.println(true ^ true);
//        out.println(true ^ false);
//        out.println(false ^ true);
//        out.println(false ^ false);
//
//        out.println("\nTabela verdade Não (Not)");
//        out.println(!true);
//        out.println(!false);

    }

}
