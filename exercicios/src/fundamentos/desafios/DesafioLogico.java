package fundamentos.desafios;

import static java.lang.System.out;

public class DesafioLogico {

    // trabalho na terça (V ou F)
    // trabalho na quinta (V ou F)
    // se os dois trabalhos derem certo, comprar uma TV de 50
    // se um trabalho der certo, comprar uma TV de 32
    // se um dos trabalhos der certo e forem ao shopping, a família vai tomar sorvete
    // não trabalhou nenhum dia, não foi tomar sorvete

    static boolean trabalhoTerca = true;
    static boolean trabalhoQuinta = false;
    static boolean sorvete;
    static boolean saudavel;

    public static void verificaSorvete() {
        if (trabalhoTerca ^ trabalhoQuinta) {
            sorvete = true;
            out.println("A família vai ao Shopping tomar sorvete");
        } else {
            sorvete = false;
            out.println("A família não vai ao Shopping tomar sorvete");
        }
    }

    public static void verificaSaudavel() {
        if (!sorvete) {
            saudavel = true;
            out.println("A família é muito saudável");
        } else {
            saudavel = false;
            out.println("A família não é muito saudável");
        }
    }

    public static void verificaTV() {
        if (trabalhoTerca && trabalhoQuinta) {
            out.println("A família vai comprar uma TV de 50 polegadas");
        } else if (trabalhoTerca || trabalhoQuinta) {
            out.println("A família vai comprar uma TV de 32 polegadas");
        } else if (!trabalhoTerca && !trabalhoQuinta) {
            out.println("A família não vai ao Shopping comprar uma TV");
        }
    }

    public static void main(String[] args) {
        verificaTV();
        verificaSorvete();
        verificaSaudavel();
    }

}
