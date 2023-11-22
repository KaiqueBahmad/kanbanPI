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
    public static boolean isInteger(String str) {
        if (str == null || str.isEmpty()) {
            return false; // Se a string for nula ou vazia, não é um número inteiro
        }
        boolean pularPrimeiro = false;
        if (str.toCharArray()[0] == '-') {
            pularPrimeiro = true;
        }
        for (char c : str.toCharArray()) {//itera sobre cada caractere na string str, permitindo que você realize operações em cada caractere separadamente dentro do corpo do loop
            if (pularPrimeiro) {
                pularPrimeiro = false;
                continue;
            }
            if (!Character.isDigit(c)) {
                return false; // Se algum caractere não for um dígito, não é um número inteiro
            }
        }

        return true; // Se todos os caracteres forem dígitos, é um número inteiro
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
