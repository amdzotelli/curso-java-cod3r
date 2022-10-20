package controle;

import java.util.Scanner;

import static java.lang.System.*;

public class WhileIndeterminado {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(in);

        out.println("Digite uma palavra: ");
        String input = " ";

        while (!input.equalsIgnoreCase("sair")) {
            out.println("Digite outra palavra: ");
            input = scanner.nextLine();
        }

        scanner.close();

    }

}
