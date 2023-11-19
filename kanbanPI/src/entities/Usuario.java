package entities;

import java.util.ArrayList;

/**
 * @author Kaique Bahmad Tavares <kaiquebahmadt@gmail.com>
 * @date 10/11/2023
 * @brief Class Usuario
 */
public class Usuario {
    private Empresa pai;
    private String nome;
    private String senha;
    private String senhaInformada;
    private ArrayList<Acao> acoes;
    
    public Usuario(Empresa pai, String nome,String senha) {
        this.acoes = new ArrayList<>(); 
        this.pai = pai;
        this.nome = nome;
        this.senha = senha;
        this.senhaInformada = "";
    }
    
    public boolean auth() {
        return this.senha.equals(this.senhaInformada);
    }
    
    public boolean removerAcaoPorNome(String nome) {
        if (!this.auth() && !this.pai.auth()) {
            return false;
        }
        for (Acao acao:this.acoes) {
            if (nome.equals(acao.getNome())) {
                acoes.remove(acao);
                return true;
            }
        }
        return false;
    }
    
    public void salvarSenha(String chave) {
        this.senhaInformada = chave;
    }
    
    
    
    public boolean addAcao(Empresa empresa, Acao acao) {
        if (!this.auth() && !this.pai.auth()) {
            return false;
        }
        this.acoes.add(acao);
        return true;
    }

    public String getNome() {
        return this.nome;
    }
    
    public ArrayList<Acao> getAcoes() {
        return this.acoes;
    }
    
    public void logout() {
        this.senhaInformada = "";
    }
}
