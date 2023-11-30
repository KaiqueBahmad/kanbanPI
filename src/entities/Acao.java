package entities;

import java.time.Instant;
import java.util.ArrayList;
import utils.Metodos;

public class Acao {
    private Atividade atividadePai;
    private Usuario usuarioResponsavel;
    private Area areaResponsavel;
    private String nome;
    private float porcentagem;
    private long inicio;
    private long prazo;
    private long termino;
    private ArrayList<String> historico;
    private long ultimaMudanca;
    
    public Acao(Usuario usuarioResponsavel, Area areaResponsavel, Atividade pai, String nome, long inicio, long prazo) {
        this.historico = new ArrayList<>();
        this.usuarioResponsavel = usuarioResponsavel;
        this.areaResponsavel = areaResponsavel;
        this.atividadePai = pai;
        this.nome = nome;
        this.inicio = inicio;
        this.ultimaMudanca = inicio;
        this.prazo = prazo;
        this.porcentagem = 0;
    }

    public Atividade getAtividade() {
        return this.atividadePai;
    }
    
    public Area getArea() {
        return this.areaResponsavel;
    }
    
    public Usuario getUsrResponsavel() {
        return this.usuarioResponsavel;
    }
    
    public String getNome() {
        return nome;
    }

    public void aumentarPorcentagem(double aumento) {
        if (!this.usuarioResponsavel.auth() && !this.atividadePai.getProjeto().getEmpresa().auth()) {
            return;
        }
        float inicial = this.porcentagem;
        this.porcentagem += aumento;
        if ((Math.floor(this.porcentagem)) >= 1) {
            this.porcentagem = 1;
            this.terminar();
        }
        if (Math.round(this.porcentagem*100) <= 0) {
            this.porcentagem = 0;
        }
        this.atividadePai.atualizarPorcentagem();
        if (Math.abs(aumento) > 0) {
            long atual = System.currentTimeMillis()/1000;
            if (this.porcentagem == 0 || this.porcentagem == 1) {
                historico.add(Metodos.tempoEntre(ultimaMudanca, atual)+" no Fazendo");
                this.ultimaMudanca = atual;
            } else if (this.porcentagem > 0 && this.porcentagem < 1 && (inicial == 0 || inicial == 1)) {
                if (inicial == 1) {
                    historico.add(Metodos.tempoEntre(ultimaMudanca, atual)+" no Finalizado");
                    this.ultimaMudanca = atual;
                } else if (inicial == 0) {
                    historico.add(Metodos.tempoEntre(ultimaMudanca, atual)+" no A Fazer");
                    this.ultimaMudanca = atual;
                }
            }
        }
    }
    
    public ArrayList<String> getHistorico() {
        if (this.usuarioResponsavel.auth() || this.atividadePai.getProjeto().getEmpresa().auth()) {
            return (ArrayList<String>)this.historico.clone();
        }
        return null;
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

    public void terminar() {
        if (!this.usuarioResponsavel.auth() && !this.atividadePai.getProjeto().getEmpresa().auth()) {
            return;
        }
        this.porcentagem = 1;
        this.termino = Instant.now().getEpochSecond();
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

