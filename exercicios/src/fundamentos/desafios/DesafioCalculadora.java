package fundamentos.desafios;

import java.util.Scanner;

import static java.lang.System.*;

public class DesafioCalculadora {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(in);

        out.println("Iniciando a calculadora...");

        out.println("Digite o primeiro valor: ");
        double valor1 = scanner.nextDouble();

        out.println("Digite o segundo valor: ");
        double valor2 = scanner.nextDouble();

        out.println("Escolha e digite uma das seguintes operações: +, -, /, * e %: ");
        String operacao = scanner.next();

        double resultado = "+".equals(operacao) ? valor1 + valor2 : 0;
        resultado = "-".equals(operacao) ? valor1 - valor2 : resultado;
        resultado = "/".equals(operacao) ? valor1 / valor2 : resultado;
        resultado = "*".equals(operacao) ? valor1 * valor2 : resultado;
        resultado = "%".equals(operacao) ? valor1 % valor2 : resultado;

        out.printf("%.2f %s %.2f = %.2f %n", valor1, operacao, valor2, resultado);

        scanner.close();

    }

}
