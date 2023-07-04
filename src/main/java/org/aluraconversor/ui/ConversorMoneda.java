package org.aluraconversor.ui;

import org.aluraconversor.logica.ConversorMonedaLogica;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ConversorMoneda extends JFrame {
    private JRadioButton rbtnDolar;
    private JRadioButton rbtnEuro;
    private JRadioButton rbtnLibra;
    private JRadioButton rbtnYen;
    private JRadioButton rbtnWon;
    private JTextField txtfValorAConvertir;
    private JButton convertirButton;
    private JButton limpiarButton;
    private JTextField txtfTRMDolar;
    private JTextField txtfTRMEuro;
    private JTextField txtfTRMLibra;
    private JTextField txtfTRMYen;
    private JTextField txtfTRMWon;
    private JTextField txtfValorDolar;
    private JTextField txtfValorEuro;
    private JTextField txtfValorLibra;
    private JTextField txtfValorYen;
    private JTextField txtfValorWon;
    private JLabel txtTitulo;
    private JLabel textValorConvertir;
    private JLabel txtDolar;
    private JLabel textEuro;
    private JLabel textLibra;
    private JLabel txtWon;
    private JPanel panelFirts;

    public ConversorMoneda(){
        super("Conversor de moneda ALURA");
        setContentPane(panelFirts);
        inicioTXTField();
        convertirButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String valorAConvertir = txtfValorAConvertir.getText();
                txtfValorDolar.setText(
                        enableTRM("USD",valorAConvertir,"4500",txtfTRMDolar);
                );
                txtfValorEuro.setText(
                        "EUR "+ConversorMonedaLogica.convertir(valorAConvertir,"4500")
                );
                txtfValorLibra.setText(
                        "LIBRA "+ConversorMonedaLogica.convertir(valorAConvertir, "5280")
                );
                txtfValorYen.setText(
                        "YEN "+ConversorMonedaLogica.convertir(valorAConvertir,"28.77")
                );
                txtfValorWon.setText(
                        "WON "+ConversorMonedaLogica.convertir(valorAConvertir,"3.21")
                );
            }
        });
    }
    public String enableTRM(String monedaAcronimo,JTextField valorConvertir,JTextField trmSistema,JRadioButton button, JTextField trmManual){
        boolean isSelected = button.isSelected();
        if(isSelected) {
            trmManual.setEnabled(true);
            return monedaAcronimo+ConversorMonedaLogica.convertir(
                    valorConvertir.getText(),trmManual.getText()
            );
        }else{
            trmManual.setEnabled(false);
            return monedaAcronimo+ConversorMonedaLogica.convertir(
                    valorConvertir.getText(),trmSistema.getText()
            );
        }
    }
    public void inicioTXTField(){
        txtfTRMDolar.setEnabled(false);
        txtfTRMEuro.setEnabled(false);
        txtfTRMLibra.setEnabled(false);
        txtfTRMYen.setEnabled(false);
        txtfTRMWon.setEnabled(false);
    }

}
