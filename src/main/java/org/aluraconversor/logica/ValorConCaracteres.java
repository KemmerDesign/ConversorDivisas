package org.aluraconversor.logica;

/**
 * Esta execpcion se usa para lanzar un mensaje en el caso que el input que se
 * recibe traiga character.
 * @version 1.0
 * @author Kemmer Alexander Torres Gomez
 */
public class ValorConCaracteres extends Exception{
    /**
     * Instancia un manejador de excepciones sin parametros
     *
     */
    public ValorConCaracteres(){
        super("El valor ingresado con tiene caractes de texto, este valor no esta permitido");
    }
}
