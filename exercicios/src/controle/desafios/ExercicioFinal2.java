package controle.desafios;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;
import static java.util.Calendar.getInstance;

public class ExercicioFinal2 {

    public static void main(String[] args) {

//        Scanner scanner = new Scanner(in);
//
//        out.println("Insira um ano para saber se é bissexto: ");
//
//        int ano = scanner.nextInt();
//
//        if (ano % 4 == 0 && ano % 100 == 0 && ano % 400 == 0) {
//            out.println("Ano bissexto!");
//        } else {
//            out.println("Não é ano bissexto!");

        Calendar calendar = getInstance();

        int anoAtual = calendar.get(Calendar.YEAR);

        if (anoAtual % 4 == 0 && anoAtual % 100 == 0 && anoAtual % 400 == 0) {
            out.println("Ano bissexto!");
        } else {
            out.println("Não é ano bissexto!");

        }

    }

}
