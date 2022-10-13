package fundamentos;

import static java.lang.System.*;

public class TiposPrimitivos {

    public static void main(String[] args) {
        // Informações do funcionário

        // Tipos numéricos inteiros
        byte anosDeEmpresa = 23; // máximo = 127
        short numeroDeVoos = 542; // máximo = 32767
        int id = 56789;
        long pontosAcumulados = 3_134_845_223L; // escrevendo um literal long

        // Tipos numéricos reais
        float salario = 11_445.44F; // escrevendo um literal float
        double vendasAcumuladas = 2_991_797_103.01;

        // Tipo boolean
        boolean estaDeFerias = false;

        // Tipo caractere
        char status = 'A'; // exemplo: ativo

        // Dias de empresa
        out.println(anosDeEmpresa * 365);

        // Número de viagens
        out.println(numeroDeVoos / 2);

        // Pontos por real
        out.println(pontosAcumulados / vendasAcumuladas);

        out.println(id + ": ganha -> " + salario);

        out.println("Férias? " + estaDeFerias);

        out.println("Status: " + status);

    }

}
