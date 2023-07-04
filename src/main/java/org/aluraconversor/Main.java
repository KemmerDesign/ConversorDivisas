package org.aluraconversor;

import org.aluraconversor.ui.MenuEleccion;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Opt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");
        Object opciones[] = {"Conversor de moneda", "Conversor de temperatura"};
        MenuEleccion menu = new MenuEleccion(opciones,"Escoja lo que desea hacer","Conversor Alura");

    }
}