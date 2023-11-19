package entities;
public class Main {
    public static void main(String[] args) {
        Empresa[] empresas = new Empresa[12];
        empresas[0] = new Empresa("Carinha","senha123");
        empresas[0].salvarSenha("senha123");
        empresas[0].criarProjeto("Primeiro Projeto", "Descrição do Projeto");
//        empresas[0].getProjetos()[0]
        empresas[0].criarUsuario("Usuario", "senha2+");
        empresas[0].getProjetos()[0].criarAtividade("atividade","vermelho");
        empresas[0].criarArea("Financeiro");
        empresas[0].getProjetos()[0].getAtividadePorNome("atividade").criarAcao("Acao 1", "Usuario", "Financeiro", 0, 5000);
        empresas[0].getProjetos()[0].getAtividadePorNome("atividade").getAcaoPorNome("Acao 1").aumentarPorcentagem(0.25);
        empresas[0].logout();
        Usuario user = empresas[0].getUsuarioPorNome("Usuario");
        user.salvarSenha("senha2+");
        user.getAcoes().get(0).aumentarPorcentagem(0.35);
        System.out.println(user.getAcoes().get(0).getPorcentagem());
//        user.logout();
        user.getAcoes().get(0).terminar();
        System.out.println(user.getAcoes().get(0).getPorcentagem());
    }
}
