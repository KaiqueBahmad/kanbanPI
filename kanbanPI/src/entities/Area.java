package entities;
import java.util.ArrayList;

public class Area {
    private Empresa empresa;
    private String nome;
    private ArrayList<Acao> acoes;
    
    
    public Area(Empresa empresa, String nome) {
        this.empresa = empresa;
        this.nome = nome;
        this.acoes = new ArrayList<>();
    }
    
    public ArrayList<Acao> getAcoes() {
        return this.acoes;
    }
    
    public boolean removerAcao(Acao acaoRemover) {
        if (!empresa.auth()) {
            return false;
        }
        for (Acao acao:this.acoes) {
            if (acaoRemover.getNome().equals(acao.getNome())) {
                acoes.remove(acao);
                return true;
            }
        }
        return false;
    }
    
    public boolean addAcao(Acao acaoNova) {
        if (!empresa.auth()) {
            return false;
        }
        for (Acao acao:this.acoes) {
            if (acaoNova.getNome().equals(acao.getNome())) {
                return false;
            }
        }
        acoes.add(acaoNova);
        return true;
    }
    
    
    public String getNome() {
        return this.nome;
    }
    
    
}
