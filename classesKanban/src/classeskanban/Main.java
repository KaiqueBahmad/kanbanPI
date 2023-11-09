/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classeskanban;

/**
 *
 * @author aluno
 */
public class Main {
    public static void main(String[] args) {
        Usuario[] users = new Usuario[12];
        users[0] = new Usuario("Carinha","senha123");
        users[0].criarProjeto("Primeiro Projeto");
        users[0].getProjetos()[0].cadastrarDepartamento("Financeiro","Amarelo");
        users[0].getProjetos()[0].getDepartamentoByNome("Financeiro").adicionarAtividade("Atividade 1", 1200, 3600);
        users[0].getProjetos()[0].getDepartamentoByNome("Financeiro").getAtividadeByName("Atividade 1").increasePercentage(0.1);
        System.out.println(users[0].getProjetos()[0].getProgresso());
    }
}
