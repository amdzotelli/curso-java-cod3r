package fundamentos;

import javax.swing.*;

import static java.lang.System.*;

public class ConversaoStringNumero {

    public static void main(String[] args) {

        String valor1 = JOptionPane
                .showInputDialog("Digite o primeiro número:");

        String valor2 = JOptionPane
                .showInputDialog("Digite o segundo número:");

        out.println(valor1 + valor2);

        double numero1 = Double.parseDouble(valor1);
        double numero2 = Double.parseDouble(valor2);
        double soma = numero1 + numero2;

        out.println("Soma é " + soma);
        out.println("Média é " + soma / 2);

    }
}
