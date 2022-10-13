package fundamentos;

import static java.lang.System.*;

public class TipoString {

    public static void main(String[] args) {

        out.println("Olá pessoas".charAt(2));

        String s = "Boa tarde!";
        out.println(s.concat("..!."));
        out.println(s.startsWith("B"));
        out.println(s.toLowerCase().startsWith("b"));
        out.println(s.equalsIgnoreCase("boa tarde!"));

        var nome = "Joana";
        var sobrenome = "Melo";
        var idade = 19;
        var salario = 12345.987;

        out.println("Nome: " + nome + "\nSobrenome: "
                + sobrenome + "\nIdade: " + idade +
                "\nSalário: " + salario + "\n\n");

        out.printf("A garota %s %s tem %d anos e ganha R$%.2f.", nome, sobrenome, idade, salario);

        String frase = String.format("%nA garota %s %s tem %d anos e ganha R$%.2f.", nome, sobrenome, idade, salario);
        out.println(frase);

        out.println("Frase aleatória".contains("ale"));
        out.println("Frase aleatória".indexOf("ale"));
        out.println("Frase aleatória".substring(6));
        out.println("Frase aleatória".substring(6, 10));

    }

}
