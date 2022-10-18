package fundamentos;

import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

public class DesafioConversao {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(in);

        out.print("Digite o salário do último mês: ");
        String salario1 = entrada.nextLine().replace(",", ".");

        out.print("Digite o salário de 2 meses atrás: ");
        String salario2 = entrada.nextLine().replace(",", ".");

        out.print("Digite o salário de 3 meses atrás: ");
        String salario3 = entrada.nextLine().replace(",", ".");

        double numero1 = Double.parseDouble(salario1);
        double numero2 = Double.parseDouble(salario2);
        double numero3 = Double.parseDouble(salario3);
        double resultado = (numero1 + numero2 + numero3) / 3;

        out.println("A média dos 3 últimos salários foi de " + resultado);

        entrada.close();


    }

}
