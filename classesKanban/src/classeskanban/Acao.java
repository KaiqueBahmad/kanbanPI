package classeskanban;

public class Acao {
    private Atividade atividadePai;
    private Usuario usuarioResponsavel;
    private Area areaResponsavel;
    private String nome;
    private float porcentagem;
    private long inicio;
    private long prazo;
    private long termino;
    
    public Acao(Usuario usuarioResponsavel, Area areaResponsavel, Atividade pai, String nome, long inicio, long prazo) {
        this.usuarioResponsavel = usuarioResponsavel;
        this.areaResponsavel = areaResponsavel;
        this.atividadePai = pai;
        this.nome = nome;
        this.inicio = inicio;
        this.prazo = prazo;
        this.porcentagem = 0;
    }

    public Usuario getUsrResponsavel(Empresa emp) {
        if (!emp.auth()) {
            return null;
        }
        return this.usuarioResponsavel;
    }
    
    public String getNome() {
        return nome;
    }

    public void aumentarPorcentagem(double aumento) {
        if (!this.usuarioResponsavel.auth()) {
            return;
        }
        this.porcentagem += aumento;
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

    public boolean desvincular(Empresa emp) {
        if (!emp.auth()) {
            return false;
        }
        this.areaResponsavel.removerAcao(this);
        this.usuarioResponsavel.removerAcaoPorNome(this.nome);
        this.areaResponsavel = null;
        this.usuarioResponsavel = null;
        this.atividadePai = null;
        return true;
        
    }
}

