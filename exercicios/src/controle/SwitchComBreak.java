package controle;

import java.util.Scanner;

import static java.lang.System.*;

public class SwitchComBreak {

    public static void main(String[] args) {

        Scanner input = new Scanner(in);

        String conceito = "";

        out.println("Informe a nota: ");

        int nota = input.nextInt();

        switch(nota) {
            case 10: case 9:
                conceito = "A";
                break;
            case 8: case 7:
                conceito = "B";
                break;
            default:
                conceito = "não informado!";
        }

        out.println("Conceito é: " + conceito);

    }

}
