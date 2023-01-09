package controle;

import static java.lang.System.out;

public class Break {

    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {

            if (i == 5) {
                break;
            }
            out.println(i);
        }
        out.println("Fim!");
    }

}
