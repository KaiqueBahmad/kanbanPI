/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;

import entities.Projeto;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

/**
 *
 * @author kaiqu
 */
public class Metodos {
    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM");
    
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

    public static String dataDDMM(long data) {
         return sdf.format(new java.util.Date(data * 1000));
    }
    
    public static String tempoRestante(Long prazo){
        long atual = System.currentTimeMillis()/1000;
        
        long p = prazo - atual;
        boolean negativo = false;
        if (p < 0) {
            p = -p;
            negativo = true;
        }
        String f = "";
        
        if(p >= 0 && p < 60){
        f = p + " segundo(s)";   
            
        }else if(p >= 60 && p < 3600){
        f = (p / 60) + " minuto(s)";
            
        }else if(p >= 3600 && p < 86400){
        f = (p / 3600) + " hora(s)";
            
        }else if( p >= 86400 && p < 2629743){
        f = (p / 86400) + " dia(s)";
            
        }else if( p >= 2629743 && p < 31556926){
        f = (p / 2629743) + " mese(s)"; 
            
        }else if( p >= 31556926){
        f = (p / 31556926 ) + " ano(s)";
        
        }
        if (negativo) {
            return "Atrasado a "+f;
        } 
        return "Faltam "+f;
    }
    
    public static String tempoEntre(long inicio, long fim){
        long p = fim - inicio;
        boolean negativo = false;
        if (p < 0) {
            p = -p;
            negativo = true;
        }
        String f = "";
        
        if(p >= 0 && p < 60){
        f = p + " segundo(s)";   
            
        }else if(p >= 60 && p < 3600){
        f = (p / 60) + " minuto(s)";
            
        }else if(p >= 3600 && p < 86400){
        f = (p / 3600) + " hora(s)";
            
        }else if( p >= 86400 && p < 2629743){
        f = (p / 86400) + " dia(s)";
            
        }
        if (negativo) {
            return "-"+f;
        } 
        return f;
    }
    
    public static String formatarPalavra(String str) {
        if (str.isEmpty()) {
            return str;
        }
        String retorno = Character.toString(str.toCharArray()[0]).toUpperCase();
        for (int i = 1; i<str.length();i++) {
            retorno += Character.toString(str.charAt(i)).toLowerCase();
        }
        return retorno;
    }
    
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
    public static void main(String[] args) {
    }
}
