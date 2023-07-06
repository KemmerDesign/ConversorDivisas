package org.aluraconversor.logica;

import javax.swing.*;
import java.text.DecimalFormat;

/**
 * Es una clase con 2 metodos que busca generar la conversion de la moneda.
 * @version 1.0
 * @author kemmeralexandertorresgomez
 */
public class ConversorMonedaLogica {
    /**
     * El metodo convertirA convierte la moneda local a la moneda que se desea
     * cambiar, tambien maneja excepciones en el caso que se ingresen caracteres
     * que no puedan ser convertidos a (float), tambien en el caso en el que se
     * ingresen valores negativos o vacios.
     * @param valorConvertir
     * @param trmConversion
     * @return
     */
    public static String convertirA(String valorConvertir, String trmConversion){
        float valorConvertirF;
        float valorTRMConversionF;
        float valorConvertido;
        String valorConvertidoS = "";
        try{
            valorConvertirF = Float.parseFloat(valorConvertir);
            valorTRMConversionF = Float.parseFloat(trmConversion);
            if(valorConvertirF <= 0 || valorTRMConversionF <= 0){
                throw new ValorNegativo("Alguno de los valores es negativo o es igual a 0");
            }else{

                valorConvertido = valorConvertirF / valorTRMConversionF;
                valorConvertidoS = String.valueOf(valorConvertido);
            }

        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
        return valorConvertidoS;
    }

    /**
     * El metodo convertirB busca convertir una moneda extranjera a la moneda local, como en el caso del
     * metodo convertirA se manejan excepciones en los mismos casos.
     * @param valorConvertir
     * @param trmConversion
     * @return
     */
    public static String convertirB(String valorConvertir, String trmConversion){
        float valorConvertirF;
        float valorTRMConversionF;
        float valorConvertido;
        String valorConvertidoS = "";
        try{
            valorConvertirF = Float.parseFloat(valorConvertir);
            valorTRMConversionF = Float.parseFloat(trmConversion);
            if(valorConvertirF <= 0 || valorTRMConversionF <= 0){
                throw new ValorNegativo("Alguno de los valores es negativo o es igual a 0");
            }else{
                //Se usa la calse DecimalFormat para que el string lea todo el numero mas dos decimales
                DecimalFormat formatoDecimal = new DecimalFormat("#.##");
                valorConvertido = valorConvertirF * valorTRMConversionF;
                //Como formatoDecimal es una instancia de DecimalFormat se llama directamente al metodo de la clase
                //Que devulve un String
                valorConvertidoS = formatoDecimal.format(valorConvertido);
            }

        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
        return valorConvertidoS;
    }

}
