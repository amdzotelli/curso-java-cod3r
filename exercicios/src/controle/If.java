package controle;

import java.util.Scanner;

import static java.lang.System.*;

public class If {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(in);

        out.println("Informe a média: ");

        double media = scanner.nextDouble();

        if (media <= 10 && media >= 7.0) {
            out.println("Aprovado!");
            out.println("Parabéns!");
        }

        if (media < 7 && media >= 4.5) {
            out.println("Recuperação");
        }

        if (media < 4.5) {
            out.println("Reprovado");
        }

        scanner.close();

    }

}
