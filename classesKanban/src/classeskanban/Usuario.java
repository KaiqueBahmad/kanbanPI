/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classeskanban;

public class Usuario {
    protected Projeto[] projetos;
    protected String nome;
    protected String senha;
    protected String senhaInformada;
    
    public Usuario(String nome, String senha) {
        this.nome = nome;
        this.senha = senha;
    }
    
    public boolean auth(String chave) {
        return chave.equals(this.senha);
    }
    
    public void salvarSenha(String chave) {
        this.senhaInformada = chave;
    }
    
    public void criarProjeto(String nome, String chave) {
        if (this.auth(this.senhaInformada)) {
            int i = 0;
            for (i = 0; i < projetos.length; i++) {
                if (projetos[i] == null) {
                    break;
                }
            }
            this.projetos[]
        }
    }
    public void renomearProjeto(int id, String novoNome, String chave) {
        if (this.auth(this.senhaInformada)) {
            this.projetos[id].setName(novoNome);
        }
    }
    public Projeto[] getProjetos(String chave) {
        if (this.auth(this.senhaInformada)) {
            return this.projetos;
        }
        return null;
    }
    public void logout() {
        this.senhaInformada = null;
    }   
}
