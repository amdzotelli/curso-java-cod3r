package fundamentos;

import static java.lang.System.*;

public class Aritmeticos {

    public static void main(String[] args) {

        out.println(2 + 3);

        var x = 34.56;
        double y = 2.2;

        out.println(x + y);
        out.println(x - y);
        out.println(x * y);
        out.println(x / y);

        int a = 8;
        int b = 3;

        out.println(a + b);
        out.println(a - b);
        out.println(a * b);
        out.println(a / b);
        out.println(a / (double) b);
        out.println(a / (float) b);

        out.println(8 % 3);
        out.println(a % b);

        out.println(x + y - a * b);

    }

}
