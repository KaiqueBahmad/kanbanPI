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
import java.util.ArrayList;
import java.util.function.Function;
import javafx.event.EventHandler;
import javafx.scene.Cursor;
import javafx.scene.Scene;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;

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
    protected static String[] secoes = {"#aFazer", "#fazendo","#finalizado"};
    protected static String[] numerais = {"Um","Dois","Tres","Quatro"};
    public static boolean selecionando;
    public static ArrayList<Acao> selecionados;
    
    public PostIt(Scene cena, int coluna, int pos) {
        this.coluna = coluna;
        this.pos = pos;
        PostIt.selecionando = false;
        PostIt.selecionados = new ArrayList<>();
        myData = null;
        this.container = (Pane) cena.lookup(secoes[coluna]+numerais[pos]);
        EventHandler<MouseEvent> funcao = (e)-> {
            if (e.getButton() != MouseButton.SECONDARY) {
                return;
            }
            PostIt me = Kanban.controllerKanbanPage.postIts[this.coluna][this.pos];
            if (estaSelecionado(me.myData)) {
                removerDaSelecao(myData);
                this.container.setStyle("-fx-border-color: "+me.myData.getAtividade().getCor()+";-fx-border-width:3px;"+"-fx-background-color: #E6E6E6" );
            } else if (me.getData() != null) {
                this.container.setStyle("-fx-border-color: #FF0000;-fx-border-width:3px;"+"-fx-background-color: #E6E6E6" );
                addSelecao(me.getData());
            }
            Kanban.controllerKanbanPage.loadAtividades();
        };
        this.container.onMouseClickedProperty().set(funcao);
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
        EventHandler<MouseEvent> funcaoSoma = (e)-> {
            if (e.getButton() != MouseButton.PRIMARY) {
                return;
            }
            if (Kanban.controllerKanbanPage.postIts[this.coluna][this.pos].getData() != null) {
		Kanban.controllerKanbanPage.postIts[this.coluna][this.pos].getData().aumentarPorcentagem(0.05);
		cancelarSelecao();
            }
        };
        this.mais.onMouseClickedProperty().set(funcaoSoma);
        this.menos = (ImageView) cena.lookup(secoes[coluna]+"Menos"+numerais[pos]);
        EventHandler<MouseEvent> funcaoMenos = (e)-> {
            if (e.getButton() != MouseButton.PRIMARY) {
                return;
            }
            if (Kanban.controllerKanbanPage.postIts[this.coluna][this.pos].getData() != null) {
		Kanban.controllerKanbanPage.postIts[this.coluna][this.pos].getData().aumentarPorcentagem(-0.05);
		cancelarSelecao();
            }
        };
        this.menos.onMouseClickedProperty().set(funcaoMenos);
        this.barraProgresso.setOpacity(1);
    }
    
    private static boolean estaSelecionado(Acao target) {
        return PostIt.selecionados.contains(target);
    }
    
    private static void removerDaSelecao(Acao target) {
        if (estaSelecionado(target)) {
            PostIt.selecionados.remove(target);
            if (PostIt.selecionados.size() == 0) {
                selecionando = false;
            }
        }
    }
    
    public static void cancelarSelecao() {
        PostIt.selecionando = false;
        PostIt.selecionados = new ArrayList<>();;
        Kanban.controllerKanbanPage.loadAtividades();
    }
    
    public static void deletarAcoes() {
        for (Acao ac:selecionados) {
            ac.getAtividade().removerAcaoPorNome(ac.getNome());
        }
        cancelarSelecao();
    }
    
    private static void addSelecao(Acao target) {
        if (!estaSelecionado(target)) {
            PostIt.selecionados.add(target);
            selecionando = true;
        }
    }
    
    public Acao getData() {
        return this.myData;
    }
    
    public void sePreencher() {
        switch (coluna) {
            case 0:
                if (KanbanPageController.aFazer.size() <= 4*Kanban.paginaAFazer + this.pos) {
                    seEsconder();
                    myData = null;
                    return;
                }
                myData = KanbanPageController.aFazer.get(4*Kanban.paginaAFazer + this.pos);
                break;
            case 1:
                if (KanbanPageController.fazendo.size() <= 4*Kanban.paginaFazendo + this.pos) {
                    seEsconder();
                    myData = null;
                    return;
                }
                myData = KanbanPageController.fazendo.get(4*Kanban.paginaFazendo + this.pos);
                break;
            case 2:
                if (KanbanPageController.finalizado.size() <= 4*Kanban.paginaFinalizado + this.pos) {
                    seEsconder();
                    myData = null;
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
        if (estaSelecionado(this.myData)) {
            this.container.setStyle("-fx-border-color: #FF0000;-fx-border-width:3px;"+"-fx-background-color: #E6E6E6" );
        } else {
            this.container.setStyle("-fx-border-color:" + myData.getAtividade().getCor()+";-fx-border-width:3px;"+"-fx-background-color: #E6E6E6" );
        }
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

interface autoExcluir {
    void excluir(MouseEvent e);
}
