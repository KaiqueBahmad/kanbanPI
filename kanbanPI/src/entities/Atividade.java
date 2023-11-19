package entities;

import java.util.ArrayList;

public class Atividade {
    private Projeto pai;
    private String nome;
    private String cor;
    private float porcentagem;
    private ArrayList<Acao> acoes;
    
    public Atividade(Projeto pai, String nome, String cor) {
        this.pai = pai;
        this.nome = nome;
        this.cor = cor;
        this.acoes = new ArrayList<>(); 
    }
    
    public void atualizarPorcentagem() {
        int count  = 0;
        float soma = 0;
        for (Acao acao:this.acoes) {
            soma += acao.getPorcentagem();
            count++;
        }
        if (count > 0) {
            this.porcentagem = soma / (float) count;
        } else {
            this.porcentagem = 0;
        }
        this.pai.atualizarPorcentagem();
    }
    
    public boolean criarAcao(String nome, String nomeUsuario, String nomeArea, long inicio, long prazo) {
        if (!this.pai.getEmpresa().auth()) {
            return false;
        }
        
        for (Acao ac:this.acoes) {
            if (nome.equals(ac.getNome())) {
                return false;
            }
        }
        
        Usuario usuario = this.pai.getEmpresa().getUsuarioPorNome(nomeUsuario);
        Area area = this.pai.getEmpresa().getAreaPorNome(nomeArea);
        
        Acao acao = new Acao(usuario, area, this, nome, inicio, prazo);
        usuario.addAcao(this.pai.getEmpresa(), acao);
        area.addAcao(acao);
        this.acoes.add(acao);
        return true;
    }
    
    public Acao getAcaoPorNome(String nome) {
        for (Acao acao:this.acoes) {
            if (nome.equals(acao.getNome())) {
                if (this.pai.getEmpresa().auth() || acao.getUsrResponsavel().auth()) {
                    return acao;
                }
            }
        }
        return null;
        
    }
    
    public boolean removerAcaoPorNome(String nome) {
        if (!this.pai.getEmpresa().auth()) {
            return false;
        }
        for (Acao acao:acoes) {
            if (nome.equals(acao.getNome())) {
                if (acao.desvincular(this.pai.getEmpresa())) {
                    acoes.remove(acao);
                    return true;
                }
            }
        }
        return false;
        
        
    }
    
    public float getPorcentagem() {
        return this.porcentagem;
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
}
