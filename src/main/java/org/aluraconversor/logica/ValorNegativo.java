package org.aluraconversor.logica;

/**
 * Esta excepcion maneja un posible uso de valores negativos.
 * @version 1.0
 * @author kemmeralexandertorresgomez
 */
public class ValorNegativo extends Exception {
    /**
     * Ingresa un String para imprimir el mensaje que va a salir cuando
     * la excepcion se lance.
     * @param mensaje
     */
    public ValorNegativo(String mensaje){
        super(mensaje);
    }
}
