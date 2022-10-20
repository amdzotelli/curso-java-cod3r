package controle.desafios;

import java.util.Scanner;

import static java.lang.System.*;

public class DesafioDiaSemana {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(in);

        out.println("Insira o primeiro nome do dia da semana: ");

        String diaDaSemana = scanner.nextLine();

        if (diaDaSemana.equalsIgnoreCase("segunda")) {
            out.println("2");
        } else if (diaDaSemana.equalsIgnoreCase("terça")) {
            out.println("3");
        } else if (diaDaSemana.equalsIgnoreCase("quarta")) {
            out.println("4");
        } else if (diaDaSemana.equalsIgnoreCase("quinta")) {
            out.println("5");
        } else if (diaDaSemana.equalsIgnoreCase("sexta")) {
            out.println("6");
        } else if (diaDaSemana.equalsIgnoreCase("sábado")) {
            out.println("7");
        } else if (diaDaSemana.equalsIgnoreCase("domingo")) {
            out.println("1");
        } else {
            out.println("Dia da semana inválido");
        }


        scanner.close();
    }

}

