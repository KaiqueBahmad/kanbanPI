/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;

import entities.Projeto;
import java.util.ArrayList;

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
    
    public static String[] getPageofArray(int p, ArrayList<String>vet) {
        String mosVet[] = new String[4]; 

        int c = (p - 1) * 4;
        int f = Math.min(c + 4, vet.size());

        for (int i = c; i < f; i++) {
            mosVet[i - c] = vet.get(i);
        }

       return mosVet;
    }

    
    //Entra [null, null, projeto1, projeto2]
    //Sai [projeto1, projeto2, null, null]
    public static Projeto[] sequenciar(Projeto[] projetos) {
        Projeto[] sequenciado = new Projeto[projetos.length];
        int j = 0;
        for (int i = 0; i < sequenciado.length; i++) {
            if (projetos[i] != null) {
                sequenciado[j++] = projetos[i];
            }
        }
        return sequenciado;
    }
    
}
