package co.tutmosisii.gapbinario;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.sound.sampled.SourceDataLine;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }

    public int calularGAP(String binario) {
        String subBinarias[] = obtenerCadenasCon0(binario);
        if(subBinarias==null) return 0;
        int gap = 0;

        for (String string : subBinarias) {
            Matcher matcher = Pattern.compile("0").matcher(string);

            int res = 0;

            // for every presence of character ch
            // increment the counter res by 1
            while (matcher.find()) {
                res++;
            }
            gap = gap < res ? res : gap;
        }
        return gap;
    }

    /**
     * Saca las cadenas que estan rodeadas por 1...1 y que en el medio tienen ceros
     * 
     * @param binario
     * @return String[]
     */
    public String[] obtenerCadenasCon0(String binario) {
        String sbinarios[] = binario.split("01");
        if (sbinarios[0].equals(binario))
            return null;
        for (int i = 0; i < sbinarios.length; i++) {
            if (sbinarios[i].startsWith("0"))
                sbinarios[i] = "1" + sbinarios[i];
            sbinarios[i] = sbinarios[i] + "01";

        }
        return sbinarios;
    }

}
