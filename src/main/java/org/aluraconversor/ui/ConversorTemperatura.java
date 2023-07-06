package org.aluraconversor.ui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ConversorTemperatura extends JFrame{
    private JTextField textCentigradosInputA;
    private JTextField textCentigradoToFarenheit;
    private JTextField textCentigradoToKelvin;
    private JTextField textFarenheitInputA;
    private JTextField textFarenheitToCentigrado;
    private JTextField textFarenheitToKelvin;
    private JTextField textKelvinInputA;
    private JTextField textKelvinToCentigrados;
    private JTextField textKelvinToFarenheit;
    private JButton convertirButton;
    private JButton limpiarButton;
    private JButton inicioButton;
    private JPanel jpPrincipal;

    public ConversorTemperatura() {
        super("Conversor Moneda");
        setContentPane(jpPrincipal);
        convertirButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(textCentigradosInputA.getText().isEmpty()){
                    textCentigradosInputA.setText("");
                }else{
                    float centigradoValue = Float.parseFloat(textCentigradosInputA.getText());
                    float farenheit = (centigradoValue * (9/5))+32;
                    float kelvin = (float) (centigradoValue + 273.15);
                    textCentigradoToFarenheit.setText(Float.toString(farenheit));
                    textCentigradoToFarenheit.setEnabled(false);
                    textCentigradoToKelvin.setText(Float.toString(kelvin));
                    textCentigradoToKelvin.setEnabled(false);
                }
                if(textFarenheitInputA.getText().isEmpty()){
                    textFarenheitInputA.setText("");
                }else{
                    float farenheitValue = Float.parseFloat(textFarenheitInputA.getText());
                    float centigrado = (farenheitValue -32)* (9/5);
                    float kelvin = (float) ((farenheitValue - 32) * 5/9 + 273.15);
                    textFarenheitToCentigrado.setText(Float.toString(centigrado));
                    textFarenheitToCentigrado.setEnabled(false);
                    textFarenheitToKelvin.setText(Float.toString(kelvin));
                    textFarenheitToKelvin.setEnabled(false);
                }
                if(textKelvinInputA.getText().isEmpty()){
                    textKelvinInputA.setText("");
                }else{
                    float kelvinValue = Float.parseFloat(textKelvinInputA.getText());
                    float centigrado = (float) (kelvinValue - 273.15);
                    float farenheit = (float) (kelvinValue - 273.15) * 9/5 + 32 ;
                    textKelvinToCentigrados.setText(Float.toString(centigrado));
                    textKelvinToCentigrados.setEnabled(false);
                    textKelvinToFarenheit.setText(Float.toString(farenheit));
                    textKelvinToFarenheit.setEnabled(false);
                }
            }
        });
        limpiarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                    textCentigradosInputA.setText("");
                    textCentigradoToFarenheit.setText("");
                    textCentigradoToKelvin.setText("");
                    textFarenheitInputA.setText("");
                    textFarenheitToCentigrado.setText("");
                    textFarenheitToKelvin.setText("");
                    textKelvinInputA.setText("");
                    textKelvinToCentigrados.setText("");
                    textKelvinToFarenheit.setText("");

            }
        });
        inicioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Object opciones[] = {"Conversor de moneda", "Conversor de temperatura"};
                dispose();
                MenuEleccion menu = new MenuEleccion(opciones,"Escoja lo que desea hacer","Conversor Alura");

            }
        });
    }


}
