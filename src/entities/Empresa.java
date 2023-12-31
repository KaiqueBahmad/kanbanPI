package entities;
//Implementar o levantamento de um Erro para quando for Tentado
//Chamar uma Função e a senhaInformada não seja igual à senha

import java.util.ArrayList;
import java.util.Arrays;
import utils.Metodos;

//Se sobrar Tempo, implementar Criptografia
public class Empresa {
    private String nome;
    private final String senha;
    private String senhaInformada;
    private Projeto[] projetos;
    private ArrayList<Usuario> usuarios;
    private ArrayList<Area> areas;
        
    public Empresa(String nome, String senha) {
        this.projetos = new Projeto[4];
        this.usuarios = new ArrayList<>();
        this.areas = new ArrayList<>();
        this.nome = nome;
        this.senha = senha;
        this.senhaInformada = "";
    }
    
    public boolean auth() {
        return this.senhaInformada.equals(this.senha);
    }
    
    public void salvarSenha(String chave) {
        this.senhaInformada = chave;
    }
    
    public boolean criarProjeto(String nome, String descricao) {
        if (this.auth()) {
            for (int i = 0; i < projetos.length; i++) {
                if (projetos[i] == null) {
                    this.projetos[i] = new Projeto(this, nome, descricao);
                    return true;
                }
            }
        }
        return false;
    }
    
    public boolean criarArea(String nome) {
        if (!this.auth()) {
            return false;
        }
        for (int i = 0; i < areas.size(); i++) {
            if (nome.equals(areas.get(i).getNome())) {
                return false;
            }
        }
        this.areas.add(new Area(this, nome));
        return true;
    }
    
    public boolean criarUsuario(String nome, String senha) {
        if (!this.auth()) {
            return false;
        }
        for (Usuario usuario: this.usuarios) {
            if (nome.equals(usuario.getNome())) {
                return false;
            }
        }
        this.usuarios.add(new Usuario(this, nome, senha));
        return true;
    }
    
    public ArrayList<Projeto> getProjetosDo(String nome) {
        ArrayList<Projeto> projetosEncontrados = new ArrayList<>();
        if (!this.auth() && !this.getUsuarioPorNome(nome).auth()) {
            return null;
        }
        for (Projeto projeto:this.projetos) {
            for (Atividade atividade:projeto.getAtividades()) {
                for (Acao acao:atividade.getAcoes()) {
                    if (nome.equals(acao.getUsrResponsavel().getNome())) {
                        projetosEncontrados.add(projeto);
                    }
                }
            }
        }
        return projetosEncontrados;
    }
    
    public ArrayList<Usuario> getUsuarios() {
        return this.usuarios;
    }
    
    public Usuario getUsuarioPorNome(String nome){
        for (Usuario usuario:this.usuarios) {
            if (nome.equals(usuario.getNome())) {
                return usuario;
            }
        }
        return null;
    }
    
    public Area getAreaPorNome(String nome){
        for (Area area:this.areas) {
            if (nome.equals(area.getNome())) {
                return area;
            }
        }
        return null;
    }
    
    public void deletarProjeto(int i) {
        if (!this.auth()) {
            return;
        }
        if (i >= 0 && i < 4) {
            this.projetos[i] = null;
        } else {
            return;
        }
        this.projetos = Metodos.sequenciar(this.projetos);
    }
    public ArrayList<Area> getAreas() {
        return this.areas;
    }
    
    public String getNome() {
        return this.nome;
    }
    
    public Projeto[] getProjetos() {
        return this.projetos;
    }
    public void logout() {
        this.senhaInformada = "";
    }

}
