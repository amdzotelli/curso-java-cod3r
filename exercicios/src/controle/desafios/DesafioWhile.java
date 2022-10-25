package controle.desafios;

import java.util.Scanner;

import static java.lang.System.*;

public class DesafioWhile {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(in);

        int quantidadeDeNotas = 0;
        double nota = 0;
        double total = 0;

        while (nota != -1) {
            out.println("Informe a nota: ");
            nota = scanner.nextDouble();

            if (nota <= 10 && nota >= 0) {
                total += nota;
                quantidadeDeNotas++;
            } else {
                out.println("Nota inválida!");
            }
        }

        // Calcular a média

        double media = total / quantidadeDeNotas;
        out.println("Média = " + media);

        scanner.close();

    }
}
