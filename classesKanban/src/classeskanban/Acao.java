package classeskanban;

public class Acao {
    protected Atividade atividadePai;
    protected Usuario usuarioResponsavel;
    protected String nome;
    protected float porcentagem;
    protected long inicio;
    protected long prazo;
    protected long termino;
    
    public Acao(Usuario usuarioResponsavel,Atividade pai, String nome, long inicio, long prazo) {
        this.usuarioResponsavel = usuarioResponsavel;
        this.atividadePai = pai;
        this.nome = nome;
        this.inicio = inicio;
        this.prazo = prazo;
        this.porcentagem = 0;
        this.usuarioResponsavel.addAcao(this);
    }

    public String getNome() {
        return nome;
    }

    public void aumentarPorcentagem(double aumento) {
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
    
    
    
}

