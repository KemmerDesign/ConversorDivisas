package org.aluraconversor.ui;
import javax.swing.*;
import java.awt.*;

public class MenuEleccion {
    private Object[] opciones ;
    private String accion ;
    private String tituloMenu;

    public MenuEleccion(Object[] opciones, String accion, String tituloMenu) {
        this.opciones = opciones;
        this.accion = accion;
        this.tituloMenu = tituloMenu;
        menuInput();
    }

    private void menuInput(){
        Object opcion = JOptionPane.showInputDialog(null,this.accion,this.tituloMenu,JOptionPane.QUESTION_MESSAGE,null,opciones,opciones[0]);
        if(opcion.equals("Conversor de moneda")){
            SwingUtilities.invokeLater(new Runnable() {
                @Override
                public void run() {
                    JFrame frame = new ConversorMoneda();
                    Dimension maxSize = new Dimension(824,406);
                    frame.setSize(823,405);
                    frame.setMaximumSize(maxSize);
                    frame.setVisible(true);
                }
            });
        }
    }

    public void setOpciones(Object[] opciones) {
        this.opciones = opciones;
    }

    public void setAccion(String accion) {
        this.accion = accion;
    }

    public void setTituloMenu(String tituloMenu) {
        this.tituloMenu = tituloMenu;
    }
}
