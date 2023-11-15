/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classeskanban;

import java.util.ArrayList;

public class Atividade {
    protected String nome;
    protected String cor;
    protected Projeto pai;
    protected ArrayList<Acao> atividades;
    
    public Atividade(Projeto pai, String nome, String cor) {
        this.atividades = new ArrayList<>(); 
        this.pai = pai;
        this.nome = nome;
        this.cor = cor;
    }
    
//    Adicionar atividade agora Requer passar a atividade já construida    
//    public void adicionarAtividade(String nome, long inicio, long prazo) {
//        this.atividades.add(new Acao(this, nome, inicio, prazo));
//    }
    
    public void adicionarAtividade(Acao atividade) {
        this.atividades.add(atividade);
    }
    
    public Acao getAtividadeByNome(String nome) {
        for (Acao atividade:this.atividades) {
            if (nome.equals(atividade.getNome())) {
                return atividade;
            }
        }
        return null;
    }
    
    public void removeAtividadeByNome(String nome) {
        for (Acao atividade:this.atividades) {
            if (nome.equals(atividade.getNome())) {
                this.atividades.remove(atividade);
            }
        }
    }

    public String getNome() {
        return this.nome;
    }

    public String getCor() {
        return this.cor;
    }

    public Projeto getProjeto() {
        return pai;
    }
    
    public ArrayList<Acao> getAtividades() {
        return this.atividades;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }    
}
