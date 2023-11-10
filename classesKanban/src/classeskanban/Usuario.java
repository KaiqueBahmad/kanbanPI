package classeskanban;
//Implementar o levantamento de um Erro para quando for Tentado
//Chamar uma Função e a senhaInformada não seja igual à senha
//Se sobrar Tempo, implementar Criptografia
public class Usuario {
    protected String nome;
    private final String senha;
    private String senhaInformada;
    protected Projeto[] projetos;
    
    public Usuario(String nome, String senha) {
        this.projetos = new Projeto[4];
        this.nome = nome;
        this.senha = senha;
    }
    
    public boolean auth() {
        return this.senhaInformada.equals(this.senha);
    }
    
    public void salvarSenha(String chave) {
        this.senhaInformada = chave;
    }
    
    public void criarProjeto(String nome) {
        if (this.auth()) {
            int i;
            for (i = 0; i < projetos.length; i++) {
                if (projetos[i] == null) {
                    break;
                }
            }
            if (i < projetos.length - 1 || projetos[projetos.length - 1] != null) {
                this.projetos[i] = new Projeto(this, nome);
            }
            
        }
    }
    public void renomearProjeto(int id, String novoNome) {
        if (this.auth()) {
            this.projetos[id].setNome(novoNome);
        }
    }
    public Projeto[] getProjetos() {
        if (this.auth()) {
            return this.projetos;
        }
        return null;
    }
    public void logout() {
        this.senhaInformada = null;
    }
}
