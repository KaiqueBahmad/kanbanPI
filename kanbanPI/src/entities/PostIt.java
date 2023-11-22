package entities;

import javafx.collections.ObservableList;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;

public class PostIt {
    private Pane container;
    private Label periodoData;
    private ProgressBar barraProgresso;
    private Label labelProgresso;
    private Label nomeAcao;
    private Label nomeUsuario;
    private Label nomeArea;
    private Label diasRestantes;
    
    public PostIt(Pane origem) {
        ObservableList<Node> children = origem.getChildren();
//        this.periodoData = children.get(2).;
        int  count =  0;
        for (Node item:children) {
            if (item instanceof VBox) {
                for (Node item_:((VBox) item).getChildren()) {
                    System.out.print("\t");
                    System.out.println(item_);
                    count++;
                }
            }
            if (item instanceof Pane) {
                for (Node itempane: ((Pane) item).getChildren()) {

                }
            }
            
        }
        System.out.println(count);
    }
    
}
