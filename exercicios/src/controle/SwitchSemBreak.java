package controle;

import static java.lang.System.*;

public class SwitchSemBreak {

    public static void main(String[] args) {

        // if (bool) ...
        // while (bool)...
        // for (bool)...


        String faixa = "preta";

        switch (faixa.toLowerCase()) {
            case "preta":
                out.println("Sei o Bassai-Dai...");
            case "marrom":
                out.println("Sei o Tekki Shodan");
            case "roxa":
                out.println("Sei o Heian Godan");
            case "verde":
                out.println("Sei o Heian Yodan");
            case "laranja":
                out.println("Sei o Heian Sandan");
            case "vermelha":
                out.println("Sei o Heian Nidan");
            case "amarela":
                out.println("Sei o Heian Shodan");
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + faixa.toLowerCase());
        }

    }

}
