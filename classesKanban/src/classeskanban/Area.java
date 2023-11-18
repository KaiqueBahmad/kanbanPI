/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classeskanban;

import java.util.ArrayList;

/**
 *
 * @author kaiqu
 */
public class Area {
    private Empresa pai;
    private String nome;
    private ArrayList<Acao> acoes;
    
    
    public Area(Empresa pai, String nome) {
        this.pai = pai;
        this.nome = nome;
        this.acoes = new ArrayList<>();
    }
    
    public ArrayList<Acao> getAcoes() {
        if (!pai.auth()) {
            return null;
        }
        return this.acoes;
    }
    
    public boolean removerAcao(Acao acaoRemover) {
        if (!pai.auth()) {
            return false;
        }
        for (Acao acao:this.acoes) {
            if (acaoRemover.getNome().equals(acao.getNome())) {
                acoes.remove(acao);
                return true;
            }
        }
        return false;
    }
    
    public boolean addAcao(Acao acaoNova) {
        if (!pai.auth()) {
            return false;
        }
        for (Acao acao:this.acoes) {
            if (acaoNova.getNome().equals(acao.getNome())) {
                return false;
            }
        }
        acoes.add(acaoNova);
        return true;
    }
    
    
    public String getNome() {
        return this.nome;
    }
    
    
}
