package org.aluraconversor.logica;

import javax.swing.*;

public class ConversorMonedaLogica {
    public static String convertir(String valorConvertir,String trmConversion){
        boolean valorValidate = esFloat(valorConvertir);
        boolean valorTRMValidate = esFloat(trmConversion);
        float valorConvertirF = 0f;
        float valorTRMConversionF = 0f;
        float valorConvertido = 0f;
        String valorConvertidoS = "";
        if (valorValidate || valorTRMValidate){
            valorConvertirF = Float.parseFloat(valorConvertir);
            valorTRMConversionF = Float.parseFloat(trmConversion);
            valorConvertido = valorConvertirF / valorTRMConversionF;
            valorConvertidoS = String.valueOf(valorConvertido);
        }else {
            if (valorValidate != true){
                JOptionPane.showMessageDialog(null,"El valor ingresado no es valido");
            } else if (valorTRMValidate != true) {
                JOptionPane.showMessageDialog(null,"El valor de la trm ingresado no es valido");
            }else{
                JOptionPane.showMessageDialog(null,"Ninguno de los valores ingresados es valido");
            }
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
