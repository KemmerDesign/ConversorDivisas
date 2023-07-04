package org.aluraconversor.logica;
/*Con esta excepcion se busca manejar posibles valores negativos*/
public class ValorNegativo extends Exception {
    public ValorNegativo(String mensaje){
        super(mensaje);
    }
}
