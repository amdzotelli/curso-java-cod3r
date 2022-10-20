package controle;

import java.util.Scanner;

import static java.lang.System.*;

public class IfElseIf {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(in);
        out.println("Digite a nota: ");

        double nota = scanner.nextDouble();

        if (nota > 10 || nota < 0) {
            out.println("Nota inválida!");
        } else if (nota >= 8.1) {
            out.println("Conceito A!");
        } else if (nota >= 6.1) {
            out.println("Conceito B!");
        } else if (nota >= 4.1) {
            out.println("Conceito C!");
        } else if (nota >= 2.1) {
            out.println("Conceito D!");
        } else {
            out.println("Conceito E!");
        }

        scanner.close();

    }

}
