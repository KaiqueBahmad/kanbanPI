package classeskanban;
//Implementar o levantamento de um Erro para quando for Tentado
//Chamar uma Função e a senhaInformada não seja igual à senha

import java.util.ArrayList;

//Se sobrar Tempo, implementar Criptografia
public class Empresa {
    protected String nome;
    private final String senha;
    private String senhaInformada;
    protected Projeto[] projetos;
    private ArrayList<Usuario> usuarios;
    
    public Empresa(String nome, String senha) {
        this.projetos = new Projeto[4];
        this.usuarios = new ArrayList<>();
        this.nome = nome;
        this.senha = senha;
    }
    
    public boolean auth() {
        return this.senhaInformada.equals(this.senha);
    }
    
    public void salvarSenha(String chave) {
        this.senhaInformada = chave;
    }
    
    public void criarProjeto(String nome, String descricao) {
        if (this.auth()) {
            int i;
            for (i = 0; i < projetos.length; i++) {
                if (projetos[i] == null) {
                    break;
                }
            }
            if (projetos[i] == null) {
                this.projetos[i] = new Projeto(this, nome, descricao);
            }
            
        }
    }
    
    public void cadastrarUsuario(String nome, String senha) {
        for (Usuario usuario: this.usuarios) {
            if (nome.equals(usuario.getNome())) {
                return;
            }
        }
        this.usuarios.add(new Usuario(this, nome, senha));
    }
    
    public ArrayList<Usuario> getUsuarios() {
        return this.usuarios;
    }
    
    public Usuario getUsuarioByNome(String nome) {
        for (Usuario usuario: this.usuarios) {
            if (nome.equals(this.usuarios)) {
                return usuario;
            }
        }
        return null;
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
