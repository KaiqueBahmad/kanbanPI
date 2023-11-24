package entities;

import controllers.KanbanPageController;
import javafx.collections.ObservableList;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import kanban.Kanban;
import controllers.KanbanPageController;
import entities.Atividade;
import javafx.scene.Cursor;
import javafx.scene.Scene;

public class PostIt {
    private Pane container;
    private Pane sideColor;
    private Pane middleColor;
    private Label periodoData;
    private ProgressBar barraProgresso;
    private Label labelProgresso;
    private Label nomeAcao;
    private Label nomeUsuario;
    private Label nomeArea;
    private Label diasRestantes;
    private ImageView mais;
    private ImageView menos;
    private Acao myData;
    private int coluna;
    private int pos;
    private static String[] secoes = {"#aFazer", "#fazendo","#finalizado"};
    private static String[] numerais = {"Um","Dois","Tres","Quatro"};
    
    
    public PostIt(Scene cena, int coluna, int pos) {
        this.coluna = coluna;
        this.pos = pos;
        myData = null;
        this.container = (Pane) cena.lookup(secoes[coluna]+numerais[pos]);
        this.sideColor = (Pane) cena.lookup(secoes[coluna]+"CorEscolhida"+numerais[pos]);
        this.middleColor = (Pane) cena.lookup(secoes[coluna]+"CorEscolhidaBarra"+numerais[pos]);
        this.periodoData = (Label) cena.lookup(secoes[coluna]+"InicioFim"+numerais[pos]);
        this.barraProgresso = (ProgressBar) cena.lookup(secoes[coluna]+"BarraPorcent"+numerais[pos]);
        this.labelProgresso = (Label) cena.lookup(secoes[coluna]+"Porcent"+numerais[pos]);
        this.nomeAcao = (Label) cena.lookup(secoes[coluna]+"Nome"+numerais[pos]);
        this.nomeUsuario = (Label) cena.lookup(secoes[coluna]+"Usuario"+numerais[pos]);
        this.nomeArea = (Label) cena.lookup(secoes[coluna]+"Area"+numerais[pos]);
        this.diasRestantes = (Label) cena.lookup(secoes[coluna]+"Duracao"+numerais[pos]);
        this.mais = (ImageView) cena.lookup(secoes[coluna]+"Mais"+numerais[pos]);
        this.menos = (ImageView) cena.lookup(secoes[coluna]+"Menos"+numerais[pos]); 
        this.barraProgresso.setOpacity(1);
    }
    
    public Acao getData() {
        return this.myData;
    }
    
    public void sePreencher() {
        switch (coluna) {
            case 0:
                if (KanbanPageController.aFazer.size() <= 4*Kanban.paginaAFazer + this.pos) {
                    seEsconder();
                    return;
                }
                myData = KanbanPageController.aFazer.get(4*Kanban.paginaAFazer + this.pos);
                break;
            case 1:
                if (KanbanPageController.fazendo.size() <= 4*Kanban.paginaFazendo + this.pos) {
                    seEsconder();
                    return;
                }
                myData = KanbanPageController.fazendo.get(4*Kanban.paginaFazendo + this.pos);
                break;
            case 2:
                if (KanbanPageController.finalizado.size() <= 4*Kanban.paginaFinalizado + this.pos) {
                    seEsconder();
                    return;
                }
                myData = KanbanPageController.finalizado.get(4*Kanban.paginaFinalizado + this.pos);
                break;
        }
        if (Kanban.empresaAtual().auth() || myData.getUsrResponsavel().auth()) {
            this.menos.setOpacity(1);
            this.menos.setCursor(Cursor.HAND);
            this.mais.setOpacity(1);
            this.mais.setCursor(Cursor.HAND);
        } else {
            this.menos.setOpacity(0);
            this.menos.setCursor(Cursor.DEFAULT);
            this.mais.setOpacity(0);
            this.mais.setCursor(Cursor.DEFAULT);
        }

        this.container.setStyle("-fx-border-color:" + myData.getAtividade().getCor()+";-fx-border-width:3px;"+"-fx-background-color: #E6E6E6" );
        this.middleColor.setStyle("-fx-background-color:"+myData.getAtividade().getCor()+";");
        nomeAcao.setText(myData.getNome());
        nomeArea.setText(myData.getArea().getNome());
        nomeUsuario.setText(myData.getUsrResponsavel().getNome());
        this.sideColor.setStyle("-fx-background-color:"+myData.getAtividade().getCor()+";");
        this.barraProgresso.setProgress(myData.getPorcentagem());
        int porcentagem = Math.round(myData.getPorcentagem()*100);
        this.labelProgresso.setText(Integer.toString(porcentagem)+"%");
        container.setOpacity(1);
        
    }
    
    public void seEsconder() {
        this.container.setOpacity(0);
        this.menos.setOpacity(0);
        this.menos.setCursor(Cursor.DEFAULT);
        this.mais.setOpacity(0);
        this.mais.setCursor(Cursor.DEFAULT);
    }
    
    public void checkup() {
        System.out.println("Chekup "+coluna+"|"+pos);
        System.out.println(container);
        System.out.println(sideColor);
        System.out.println(middleColor);
        System.out.println(periodoData);
        System.out.println(barraProgresso);
        System.out.println(labelProgresso);
        System.out.println(nomeAcao);
        System.out.println(nomeUsuario);
        System.out.println(nomeArea);
        System.out.println(diasRestantes);
    }
}
