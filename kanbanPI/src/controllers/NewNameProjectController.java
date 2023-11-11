package controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressIndicator;
import javafx.scene.control.TextField;
import kanban.Kanban;

public class NewNameProjectController {

    @FXML
    private TextField attNomeNovoProjeto;

    @FXML
    private Button attNomeProjeto;

    @FXML
    private Button cancelarProjeto;

    @FXML
    private Label nomeProjetoDois;

    @FXML
    private Label nomeProjetoQuatro;

    @FXML
    private Label nomeProjetoTres;

    @FXML
    private Label nomeProjetoUm;

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
    private void attNomeProjeto(ActionEvent event) {
        // salvar o novo nome (attNomeNovoProjeto)

    }

    @FXML
    private void cancelarProjeto(ActionEvent event) {
        attNomeNovoProjeto.clear();
        Kanban.telas("selectProject");
    }

}