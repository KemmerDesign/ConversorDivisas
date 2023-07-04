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
    private JButton inicioButton;
    private JTextField txtUSDtoCOP;
    private JTextField txtEURtoCOP;
    private JTextField txtGBPtoCOP;
    private JTextField txtJPYtoCOP;
    private JTextField txtKRWtoCOP;
    private JButton convertirUnitariosAPesosButton;
    private JRadioButton radioBtnUSDtoCOP;
    private JRadioButton radioBtnEURtoCOP;
    private JRadioButton radioBtnGBPtoCOP;
    private JRadioButton radioBtnJPYtoCOP;
    private JRadioButton radioBtnKRWtoCOP;

    public ConversorMoneda(){
        super("Conversor de moneda ALURA");
        setContentPane(panelFirts);
        inicioTXTField();
        convertirButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String valorAConvertir = txtfValorAConvertir.getText();
                txtfValorDolar.setText(
                        enableTRM(valorAConvertir,"4100",rbtnDolar,txtfTRMDolar)
                );
                txtfValorEuro.setText(
                        enableTRM(valorAConvertir,"4500",rbtnEuro,txtfTRMEuro)
                );
                txtfValorLibra.setText(
                        enableTRM(valorAConvertir,"5300",rbtnLibra,txtfTRMLibra)
                );
                txtfValorYen.setText(
                        enableTRM(valorAConvertir,"28.78",rbtnYen,txtfTRMYen)
                );
                txtfValorWon.setText(
                        enableTRM(valorAConvertir,"3.21",rbtnWon,txtfTRMWon)
                );
            }

        });
        rbtnDolar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtfTRMDolar.setEnabled(true);
            }
        });
        rbtnEuro.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtfTRMEuro.setEnabled(true);
            }
        });
        rbtnLibra.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtfTRMLibra.setEnabled(true);
            }
        });
        rbtnYen.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtfTRMYen.setEnabled(true);
            }
        });
        rbtnWon.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtfTRMWon.setEnabled(true);
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
        limpiarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtfValorAConvertir.setText("");
                txtfTRMDolar.setText("");
                txtfTRMDolar.setEnabled(false);
                rbtnDolar.setEnabled(false);
                txtfValorDolar.setText("");

                txtfTRMEuro.setText("");
                txtfTRMEuro.setEnabled(false);
                rbtnEuro.setEnabled(false);
                txtfValorEuro.setText("");

                txtfTRMLibra.setText("");
                txtfTRMLibra.setEnabled(false);
                rbtnLibra.setEnabled(false);
                txtfValorLibra.setText("");

                txtfTRMYen.setText("");
                txtfTRMYen.setEnabled(false);
                rbtnYen.setEnabled(false);
                txtfValorYen.setText("");

                txtfTRMWon.setText("");
                txtfTRMWon.setEnabled(false);
                rbtnWon.setEnabled(false);
                txtfValorWon.setText("");
            }
        });

        convertirUnitariosAPesosButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(txtfValorDolar.getText().isEmpty()){
                    txtfValorDolar.setText("");
                }else {
                    txtUSDtoCOP.setText(
                            enableTRMto(txtfValorDolar.getText(),"4200",radioBtnUSDtoCOP,txtfTRMDolar)
                    );
                    txtUSDtoCOP.setEnabled(false);
                }
                if(txtfValorEuro.getText().isEmpty()){
                    txtfValorEuro.setText("");
                }else {
                    txtEURtoCOP.setText(
                            enableTRMto(txtfValorEuro.getText(),"4200",radioBtnEURtoCOP,txtfTRMEuro)
                    );
                    txtEURtoCOP.setEnabled(false);
                }
                if(txtfValorLibra.getText().isEmpty()){
                    txtfValorLibra.setText("");
                }else {
                    txtGBPtoCOP.setText(
                            enableTRMto(txtfValorLibra.getText(),"4200",radioBtnGBPtoCOP,txtfTRMLibra)
                    );
                    txtGBPtoCOP.setEnabled(false);
                }
                if(txtfValorYen.getText().isEmpty()){
                    txtfValorYen.setText("");
                }else {
                    txtJPYtoCOP.setText(
                            enableTRMto(txtfValorYen.getText(),"4200",radioBtnJPYtoCOP,txtfTRMYen)
                    );
                    txtJPYtoCOP.setEnabled(false);
                }
                if(txtfValorWon.getText().isEmpty()){
                    txtfValorWon.setText("");
                }else {
                    txtKRWtoCOP.setText(
                            enableTRMto(txtfValorWon.getText(),"4200",radioBtnKRWtoCOP,txtfTRMWon)
                    );
                    txtKRWtoCOP.setEnabled(false);
                }
            }
        });
    }
    public String enableTRM( String valorConvertir, String trmSistema, JRadioButton button, JTextField trmManual){
        boolean isSelected = button.isSelected();
        if(isSelected) {
            trmManual.setEnabled(true);
            return ConversorMonedaLogica.convertirA(
                    valorConvertir,trmManual.getText()
            );
        }else{
            trmManual.setEnabled(false);
            return ConversorMonedaLogica.convertirA(
                    valorConvertir,trmSistema
            );
        }
    }

    public String enableTRMto( String valorConvertir, String trmSistema, JRadioButton button, JTextField trmManual){
        boolean isSelected = button.isSelected();
        if(isSelected) {
            trmManual.setEnabled(true);
            return ConversorMonedaLogica.convertirB(
                    valorConvertir,trmManual.getText()
            );
        }else{
            trmManual.setEnabled(false);
            return ConversorMonedaLogica.convertirB(
                    valorConvertir,trmSistema
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
