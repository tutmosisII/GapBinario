package co.tutmosisii.gapbinario;

import javax.sound.sampled.SourceDataLine;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }

    public int calularGAP(String binario){
        return 3;
    }

    /**
     *  Saca las cadenas que estan rodeadas por 1...1 y que en el medio tienen ceros
     * @param binario 
     * @return String[] 
     */
    public String[] obtenerCadenasCon0(String binario){
          String sbinarios[]=binario.split("01");
          if(sbinarios[0].equals(binario)) 
             return null;
          for (int i = 0; i < sbinarios.length; i++) {             
              if(sbinarios[i].startsWith("0"))
                 sbinarios[i]="1"+sbinarios[i];
              sbinarios[i]=sbinarios[i]+"01";
              
          }
          return sbinarios;
    }

}
