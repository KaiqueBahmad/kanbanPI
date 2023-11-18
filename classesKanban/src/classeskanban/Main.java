package classeskanban;
public class Main {
    public static void main(String[] args) {
        Empresa[] empresas = new Empresa[12];
        empresas[0] = new Empresa("Carinha","senha123");
        empresas[0].salvarSenha("senha123");
        empresas[0].criarProjeto("Primeiro Projeto", "Descrição do Projeto");
//        empresas[0].getProjetos()[0]
        empresas[0].criarUsuario("Usuario", "senha2+");
        empresas[0].getProjetos()[0].criarAtividade("atividade","vermelho");
    }
}
