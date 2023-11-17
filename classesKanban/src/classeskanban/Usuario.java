package classeskanban;

import java.util.ArrayList;

/**
 * @author Kaique Bahmad Tavares <kaiquebahmadt@gmail.com>
 * @date 10/11/2023
 * @brief Class Usuario
 */
public class Usuario {
    protected ArrayList<Acao> acoes;
    protected Empresa pai;
    protected String nome;
    private String senha;
    private String senhaSalva;
    
    public Usuario(Empresa pai, String nome,String senha) {
        this.acoes = new ArrayList<>(); 
        this.pai = pai;
        this.nome = nome;
        this.senha = senha;
    }
    
    public void addAcao(Acao acao) {
        this.acoes.add(acao);
    }

    public String getNome() {
        return this.nome;
    }
    
    public ArrayList<Acao> getAcoes() {
        return this.acoes;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
