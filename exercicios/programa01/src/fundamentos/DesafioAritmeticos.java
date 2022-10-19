package fundamentos;

import static java.lang.System.*;

public class DesafioAritmeticos {

    public static void main(String[] args) {

        final int QUADRADO = 2;
        final int CUBO = 3;


        double a = (3.0 + 2.0) * 6.0;
        double primeiroDivisor = 3.0 * 2.0;
        double primeiraDivisao = Math.pow(a, QUADRADO) / primeiroDivisor;
        out.println(primeiraDivisao);

        double b = (1.0 - 5.0) * (2.0 - 7.0);
        double segundoDivisor = Math.pow(2.0, QUADRADO);
        double segundaDivisao = Math.pow(b, QUADRADO) / segundoDivisor;
        out.println(segundaDivisao);

        double primeiraSubtracao = primeiraDivisao - segundaDivisao;
        double primeiraSubtracaoPotencia = Math.pow(primeiraSubtracao, CUBO);

        double divisorFinal = Math.pow(10, CUBO);
        double resultado = primeiraSubtracaoPotencia / divisorFinal;

        out.println(resultado);

    }

}
