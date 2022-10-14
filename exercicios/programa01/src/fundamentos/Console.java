package fundamentos;

import java.util.Scanner;

import static java.lang.System.*;

public class Console {

    public static void main(String[] args) {

        out.print("Bom");
        out.print(" dia!\n\n");

        out.println("Bom");
        out.println("dia!");

        out.printf("Mega sena: %d %d %d %d %d %d %n", 1, 2, 3, 4, 5, 6);
        out.printf("Salário: %.1f%n", 1234.5678);
        out.printf("Nome: %s%n", "João");

        Scanner entrada = new Scanner(in);

        out.print("Digite o seu nome: ");
        String nome = entrada.nextLine();

        out.print("Digite o seu sobrenome: ");
        String sobrenome = entrada.nextLine();

        out.print("Digite a sua idade: ");
        int idade = entrada.nextInt();

        out.printf("%s %s tem %d anos.%n", nome, sobrenome, idade);

        entrada.close();

    }
}
