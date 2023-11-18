/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classeskanban;
import java.util.ArrayList;

/**
 *
 * @author aluno
 */
public class Projeto {
    private Empresa pai;
    private String nome;
    private String descricao;
    private float porcentagem;
    private ArrayList<Atividade> atividades;
    
    public Projeto(Empresa pai, String nome, String descricao) {
        this.atividades = new ArrayList<>();
        this.pai = pai;
        this.porcentagem = 0;
        this.nome = nome;
        this.descricao = descricao;
    }
    
    public boolean mudarNome(String novoNome) {
        for (Projeto projeto:this.pai.getProjetos()) {
            if (novoNome.equals(projeto.getNome())) {
                return false;
            }
        }
        this.nome = novoNome;
        return true;
    }
    public boolean criarAtividade(String nome, String cor) {
        for (Atividade atividade:atividades) {
            if (nome.equals(atividade.getNome())) {
                System.out.println("Já existe uma Atividade com esse Nome");
                return false;
            }
        }
        atividades.add(new Atividade(this, nome, cor));
        return true;
    }
    public void atualizarPorcentagem() {
        int i = 0;
        float soma = 0;
        for (i = 0; i < this.atividades.size(); i++) {
            soma += atividades.get(i).getPorcentagem();
        }
        if (i > 0) {
            this.porcentagem = soma / (float) i;
        } else {
            this.porcentagem = 0;
        }
    }

    public Empresa getEmpresa() {
        return pai;
    }
    
    public float getPorcentagem() {
        return this.porcentagem;
    }
    
    public ArrayList<Atividade> getAtividades() {
        return this.atividades;
    }
    
    public String getNome() {
        return this.nome;
    }

    public Atividade getAtividadePorNome(String nome) {
        if (!pai.auth()) {
            return null;
        }
        for (Atividade at:this.atividades) {
            if (nome.equals(at.getNome())) {
                return at;
            }
        }
        return null;
    }
}
