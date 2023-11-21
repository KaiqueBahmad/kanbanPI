/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;

/**
 *
 * @author kaiqu
 */
public class Metodos {
    public static boolean verificarEspacos(String str) {
        String trimmedString = str.trim();
        boolean x = true;
        String finalString = trimmedString.replaceAll("\\s+", " ");
        if(!str.equals(finalString)){
            x = false;
        }
        return x;
    }

    public static boolean jaEstaNaLista(String nome, String[] lista) {
        for (String item:lista) {
            if (nome.equals(item)) {
                return true;
            }
        }
        return false;
    }
}
