/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classeskanban;

import java.util.ArrayList;

public class Departamento {
    protected String nome;
    protected String cor;
    protected Projeto pai;
    protected ArrayList<Atividade> atividades;
    
    public Departamento(Projeto pai, String nome, String cor) {
        this.atividades = new ArrayList<>(); 
        this.pai = pai;
        this.nome = nome;
        this.cor = cor;
    }
    
    public void adicionarAtividade(String nome, long inicio, long prazo) {
        this.atividades.add(new Atividade(this, nome, inicio, prazo));
    }
    
    public void adicionarAtividade(Atividade atividade) {
        this.atividades.add(atividade);
    }
    
    public Atividade getAtividadeByNome(String nome) {
        for (Atividade atividade:this.atividades) {
            if (nome.equals(atividade.getNome())) {
                return atividade;
            }
        }
        return null;
    }
    
    public void removeAtividadeByNome(String nome) {
        for (Atividade atividade:this.atividades) {
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
    
    public ArrayList<Atividade> getAtividades() {
        return this.atividades;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
    
    
}
