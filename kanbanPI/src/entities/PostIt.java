package entities;

import javafx.collections.ObservableList;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;

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
    
    public PostIt(Pane origem) {
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
