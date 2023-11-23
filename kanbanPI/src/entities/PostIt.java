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
    private int coluna;
    private int pos;
    
    
    public PostIt(Pane origem, int coluna, int pos) {
        this.coluna = coluna;
        this.pos = pos;
        this.container = origem;
        ObservableList<Node> origemLista = origem.getChildren();
        if (origemLista.get(0) instanceof Pane sub) {
                this.sideColor = sub;
        }
        if (origemLista.get(1) instanceof Pane) {
            Pane sub = (Pane) origem.getChildren().get(1);
            this.middleColor = sub;
            if (sub.getChildren().get(0) instanceof VBox sub_) {
                if (sub_.getChildren().get(0) instanceof Label label) {
                    this.periodoData = label;
                }
            }
        }
        if (origemLista.get(2) instanceof ProgressBar progressBar) {
            this.barraProgresso = progressBar;
        }
        if (origemLista.get(3) instanceof Label label) {
            this.labelProgresso = label;
        }
        
        if (origemLista.get(4) instanceof ImageView img) {
            this.menos = img;
        }
        if (origemLista.get(3) instanceof ImageView img) {
            this.mais = img;
        }
        
        if (origemLista.get(6) instanceof VBox vbox) {
            if (vbox.getChildren().get(0) instanceof Label label) {
                this.nomeAcao = label;
            }
        }
        if (origemLista.get(7) instanceof VBox vbox) {
            if (vbox.getChildren().get(0) instanceof Label label) {
                this.nomeUsuario = label;
            }
        }
        if (origemLista.get(8) instanceof VBox vbox) {
            if (vbox.getChildren().get(0) instanceof Label label) {
                this.nomeArea = label;
            }
        }
        if (origemLista.get(9) instanceof VBox vbox) {
            if (vbox.getChildren().get(0) instanceof Label label) {
                this.diasRestantes = label;
            }
        }    
    }
    
    public void sePreencher() {
        Acao myData = null;
        switch (coluna) {
            case 0:
                if (KanbanPageController.aFazer.size() < 4*Kanban.paginaAFazer + this.pos + 1) {
                    return;
                }
                myData = KanbanPageController.aFazer.get(4*Kanban.paginaAFazer + this.pos);
                break;
            case 1:
                if (KanbanPageController.fazendo.size() <= 4*Kanban.paginaFazendo + this.pos + 1) {
                    return;
                }
                myData = KanbanPageController.fazendo.get(4*Kanban.paginaFazendo + this.pos);
                break;
            case 2:
                if (KanbanPageController.finalizado.size() <= 4*Kanban.paginaFinalizado + this.pos + 1) {
                    return;
                }
                myData = KanbanPageController.finalizado.get(4*Kanban.paginaFinalizado + this.pos);
                break;
        }
        System.out.println(coluna);
        System.out.println(myData.getAtividade().getCor());
        if (myData == null) {
            return;
        }
        container.setOpacity(1);
        this.container.setStyle("-fx-border-color:" + myData.getAtividade().getCor()+";-fx-border-width:3px;"+"-fx-background-color: #E6E6E6" );
        this.middleColor.setStyle("-fx-background-color:"+myData.getAtividade().getCor()+";");
        nomeAcao.setText(myData.getNome());
        nomeArea.setText(myData.getArea().getNome());
        nomeUsuario.setText(myData.getUsrResponsavel().getNome());
        this.sideColor.setStyle("-fx-background-color:"+myData.getAtividade().getCor()+";");
        this.barraProgresso.setProgress(myData.getPorcentagem());
        int porcentagem = (int) (myData.getPorcentagem()*100);
        this.labelProgresso.setText(Integer.toString(porcentagem)+"%");
        
    }
    
    public void checkup() {
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
