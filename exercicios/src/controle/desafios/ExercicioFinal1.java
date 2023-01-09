package controle.desafios;

import java.util.Scanner;

import static java.lang.System.*;

public class ExercicioFinal1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(in);
        int number = 0;

        while (number >= 0) {
            out.println("Digite um número: ");
            number = input.nextInt();

            if (number <= 10 && number >= 0 && number % 2 == 0) {
                out.println("True!");
            } else {
            out.println("False");

            }
        }

    }

}
