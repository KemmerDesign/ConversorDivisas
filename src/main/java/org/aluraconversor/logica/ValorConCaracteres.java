package org.aluraconversor.logica;

public class ValorConCaracteres extends Exception{
    public ValorConCaracteres(){
        super("El valor ingresado con tiene caractes de texto, este valor no esta permitido");
    }
}
