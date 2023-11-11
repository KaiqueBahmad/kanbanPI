package classeskanban;

public class Atividade {
    protected Departamento departamentoResponsavel;
    protected Usuario usuarioResponsavel;
    protected String nome;
    protected float porcentagem;
    protected long inicio;
    protected long prazo;
    protected long termino;
    
    public Atividade(Usuario usuarioResponsavel,Departamento pai, String nome, long inicio, long prazo) {
        this.usuarioResponsavel = usuarioResponsavel;
        this.departamentoResponsavel = pai;
        this.nome = nome;   
        this.inicio = inicio;
        this.prazo = prazo;
        this.porcentagem = 0;
        this.usuarioResponsavel.adicionarAtividade(this);
        this.departamentoResponsavel.adicionarAtividade(this);
    }
    
    public void increasePorcentagem(float aumento) {
        this.porcentagem += aumento;
        this.departamentoResponsavel.getProjeto().atualizarProgresso();
    }
    
    public void changeNome(String nome) {
        this.nome = nome;
    }

    public Departamento getDepartamento() {
        return departamentoResponsavel;
    }

    public String getNome() {
        return nome;
    }

    public float getPorcentagem() {
        return porcentagem;
    }

    public long getInicio() {
        return inicio;
    }

    public long getPrazo() {
        return prazo;
    }

    public long getTermino() {
        return termino;
    }

    public void setTermino(long termino) {
        this.termino = termino;
    }
    
    
    
}

