package fundamentos;

import static java.lang.System.*;

public class OperadorTernario {
// atribuição condicional
    public static void main(String[] args) {

        double media = 5.6;

        String resultadoParcial = media >= 5.0 ? "em recuperação." : "reprovado.";
        String resultadoFinal = media >= 7.0 ? "aprovado." : resultadoParcial;

        out.println("O aluno está " + resultadoFinal);

    }

}
