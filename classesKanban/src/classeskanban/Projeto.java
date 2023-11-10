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
    private Usuario pai;
    private ArrayList<Departamento> departamentos;
    
    public Projeto(Usuario pai, String nome) {
        this.departamentos = new ArrayList<>();
        this.pai = pai;
        this.porcentagem = 0;
        this.nome = nome;
    }
    
    public void atualizarProgresso() {
        float soma = 0;
        int numAtividades = 0;
        for (Departamento departamento:departamentos) {
            for (Atividade atividade:departamento.getAtividades()) {
                soma += atividade.getPorcentagem();
                numAtividades++;
            }
        }
        this.porcentagem = soma / (float) numAtividades;
    }
    
    public void cadastrarDepartamento(String nome, String cor) {
        boolean jaExiste = false;
        for (Departamento departamento:departamentos) {
            if (nome.equals(departamento.getNome())) {
                jaExiste = true;
            }
        }
        if (!jaExiste) {
            this.departamentos.add(new Departamento(this, nome, cor));
        }
    }
    
    public Atividade getAtividadeByNome(String nome) {
        for (Departamento departamento:this.departamentos) {
            for (Atividade atividade:departamento.getAtividades()) {
                if (nome.equals(atividade.getNome())) {
                    return atividade;
                }
            }
        }
        return null;
    }
    
    public Departamento getDepartamentoByNome(String nome) {
        for (Departamento departamento:this.departamentos) {
            if (nome.equals(departamento.getNome())) {
                return departamento;
            }
        }
        return null;
    }
    
    public void changeDepartamentoOfAtividade(String departamentoNome, String atividade) {
        //Encontra a atividade a ser mudada de departamento (Pelo Nome)
        Atividade alvo = this.getAtividadeByNome(atividade);
        alvo.getDepartamento().removeAtividadeByNome(atividade);
        for (Departamento departamento:this.departamentos) {
            if (departamentoNome.equals(departamento.getNome())) {
                departamento.adicionarAtividade(alvo);
            }
        }
    }
    
    public ArrayList<Departamento> getDepartamentos() {
        return this.departamentos;
    }
    
    public float getPorcentagem() {
        return this.porcentagem;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
