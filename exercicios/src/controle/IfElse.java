package controle;

import javax.swing.*;

import static java.lang.System.*;

public class IfElse {

    public static void main(String[] args) {

        String valor = JOptionPane.showInputDialog(
                "Informe o número:");
        int numero = Integer.parseInt(valor);

        if (numero % 2 == 0) {
            out.println("Número par!");
        } else {
            out.println("Número ímpar!");
        }

    }
}
