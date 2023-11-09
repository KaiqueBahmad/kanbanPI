package controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressIndicator;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import kanban.Kanban;

public class SelectProjectController {

    @FXML
    private ImageView editarProjetoDois;

    @FXML
    private ImageView editarProjetoQuatro;

    @FXML
    private ImageView editarProjetoTres;

    @FXML
    private ImageView editarProjetoUm;

    @FXML
    private ImageView excluirProjetoDois;

    @FXML
    private ImageView excluirProjetoQuatro;

    @FXML
    private ImageView excluirProjetoTres;

    @FXML
    private ImageView excluirProjetoUm;

    @FXML
    private Button logout;

    @FXML
    private Label nomeProjetoDois;

    @FXML
    private Label nomeProjetoQuatro;

    @FXML
    private Label nomeProjetoTres;

    @FXML
    private Label nomeProjetoUm;

    @FXML
    private Button novoProjeto;

    @FXML
    private Label numPostProjetoDois;

    @FXML
    private Label numPostProjetoQuatro;

    @FXML
    private Label numPostProjetoTres;

    @FXML
    private Label numPostProjetoUm;

    @FXML
    private ProgressIndicator progressoTotalDois;

    @FXML
    private ProgressIndicator progressoTotalQuatro;

    @FXML
    private ProgressIndicator progressoTotalTres;

    @FXML
    private ProgressIndicator progressoTotalUm;

    @FXML
    private Pane projetoDois;

    @FXML
    private Pane projetoQuatro;

    @FXML
    private Pane projetoTres;

    @FXML
    private Pane projetoUm;

    @FXML
    void editarProjetoDois(MouseEvent event) {

    }

    @FXML
    void editarProjetoTres(MouseEvent event) {

    }

    @FXML
    void editarProjetoUm(MouseEvent event) {

    }

    @FXML
    void excluirProjetoQuatro(MouseEvent event) {

    }

    @FXML
    void excluirProjetoTres(MouseEvent event) {

    }

    @FXML
    void excluirProjetoUm(MouseEvent event) {

    }

    @FXML
    void logout(ActionEvent event) {

    }

    @FXML
    void novoProjeto(ActionEvent event) {
        Kanban.telas("createProject");
    }

    @FXML
    void projetoDois(MouseEvent event) {

    }

    @FXML
    void projetoQuatro(MouseEvent event) {

    }

    @FXML
    void projetoTres(MouseEvent event) {

    }

    @FXML
    void projetoUm(MouseEvent event) {

    }

}
