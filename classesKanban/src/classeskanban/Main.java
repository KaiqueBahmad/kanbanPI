package classeskanban;
public class Main {
    public static void main(String[] args) {
        Usuario[] users = new Usuario[12];
        users[0] = new Usuario("Carinha","senha123");
        users[0].salvarSenha("senha123");
        users[0].criarProjeto("Primeiro Projeto");
        users[0].getProjetos()[0].cadastrarDepartamento("Financeiro","Amarelo");
        users[0].getProjetos()[0].getDepartamentoByNome("Financeiro").adicionarAtividade("Atividade 1", 1200, 3600);
        users[0].getProjetos()[0].getDepartamentoByNome("Financeiro").getAtividadeByNome("Atividade 1").increasePorcentagem(0.1f);
        users[0].getProjetos()[0].atualizarProgresso();
        System.out.println(users[0].getProjetos()[0].getPorcentagem());
    }
}
