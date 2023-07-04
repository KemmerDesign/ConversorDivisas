package org.aluraconversor.logica;

import javax.swing.*;
import java.text.DecimalFormat;

public class ConversorMonedaLogica {
    public static String convertirA(String valorConvertir, String trmConversion){
        boolean valorValidate = esFloat(valorConvertir);
        boolean valorTRMValidate = esFloat(trmConversion);
        float valorConvertirF = 0f;
        float valorTRMConversionF = 0f;
        float valorConvertido = 0f;
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
    public static String convertirB(String valorConvertir, String trmConversion){
        boolean valorValidate = esFloat(valorConvertir);
        boolean valorTRMValidate = esFloat(trmConversion);
        float valorConvertirF = 0f;
        float valorTRMConversionF = 0f;
        float valorConvertido = 0f;
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
    public static boolean esFloat(String texto){
        try {
            Float.parseFloat(texto);
            return true;
        }catch (NumberFormatException e){
            return false;
        }
    }
}
