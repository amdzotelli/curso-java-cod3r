package controle;

import static java.lang.System.*;

public class For03 {

    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                out.printf("[%d, %d] - ", i, j);
            }
            out.println();
        }

    }

}
