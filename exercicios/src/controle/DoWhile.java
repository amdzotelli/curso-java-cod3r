package controle;

import java.util.Scanner;

import static java.lang.System.*;

public class DoWhile {

    public static void main(String[] args) {

        // if (...) executar uma sentença ou bloco de código {}
        // while (...) executar uma sentença ou bloco de código {}
        // for (...; ...; ...) executar uma sentença ou bloco de código {}

        // do {} while (...);

        Scanner scanner = new Scanner(in);

        String input;

        do {
            out.println("Você precisa falar as palavras mágicas...");
            out.println("Quer sair?");
            input = scanner.nextLine();
        }  while (!input.equalsIgnoreCase("sair"));

        out.println("Até a próxima.");
        scanner.close();
    }

}
