package fundamentos;

import static java.lang.System.*;

public class ConverterTemperatura {

    public static void main(String[] args) {
        final double AJUSTE = 32;
        final double FATOR = 5.0 / 9.0;
        double temperaturaFarenheit = 86;

        double temperaturaCelcius = (temperaturaFarenheit - AJUSTE) * FATOR;
        out.println(temperaturaCelcius + "ºC");
        
    }

}
