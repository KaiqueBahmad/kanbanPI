package classeskanban;

import java.util.ArrayList;

public class Atividade {
    protected String nome;
    protected String cor;
    protected Projeto pai;
    protected ArrayList<Acao> acoes;    
    
    public Atividade(Projeto pai, String nome, String cor) {
        this.acoes = new ArrayList<>(); 
        this.pai = pai;
        this.nome = nome;
        this.cor = cor;
    }

    public void addAcao(Acao acao) {
        this.acoes.add(acao);
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
    
    public ArrayList<Acao> getAcoes() {
        return this.acoes;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }    
}
