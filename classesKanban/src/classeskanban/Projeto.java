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
    private float porcentagem;
    private String nome;
    private String descricao;
    private Empresa pai;
    private ArrayList<Atividade> atividades;
    
    public Projeto(Empresa pai, String nome, String descricao) {
        this.atividades = new ArrayList<>();
        this.pai = pai;
        this.porcentagem = 0;
        this.nome = nome;
        this.descricao = descricao;
    }
    
    public void criarAtividade(String nome, String cor) {
        for (Atividade atividade:atividades) {
            if (nome.equals(atividade.getNome())) {
                System.out.println("Já existe uma Atividade com esse Nome");
                return;
            }
        }
        atividades.add(new Atividade(this, nome, cor));
    }
    
    
}
