package controle;

import static java.lang.System.*;

public class Continue {

    public static void main(String[] args) {

    for (int i = 0; i < 10; i++) {
        if(i % 2 == 1) {
            continue;
        }

        out.println(i);
    }

    }
}
