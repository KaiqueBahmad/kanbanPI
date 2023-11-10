package classeskanban;

public class Atividade {
    protected Departamento pai;
    protected String nome;
    protected float porcentagem;
    protected long inicio;
    protected long prazo;
    protected long termino;
    
    public Atividade(Departamento pai, String nome, long inicio, long prazo) {
        this.pai = pai;
        this.nome = nome;
        this.inicio = inicio;
        this.prazo = prazo;
        this.porcentagem = 0;
    }
    
    public void increasePorcentagem(float aumento) {
        this.pai.getProjeto().atualizarProgresso();
        this.porcentagem += aumento;
    }
    
    public void changeNome(String nome) {
        this.nome = nome;
    }

    public Departamento getDepartamento() {
        return pai;
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

