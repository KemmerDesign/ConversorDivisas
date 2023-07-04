package org.aluraconversor.ui;

import javax.swing.*;

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
    }


}