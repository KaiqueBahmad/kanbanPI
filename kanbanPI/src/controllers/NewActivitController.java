package controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.MenuButton;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import kanban.Kanban;

public class NewActivitController {

    @FXML
    private Button cancelarAtividade;

    @FXML
    private Button criarAtividade;

    @FXML
    private ImageView deletarAtividade;

    @FXML
    private MenuButton departamentoAtividade;

    @FXML
    private DatePicker inicioAtividade;

    @FXML
    private TextField nomeAtividade;

    @FXML
    private TextField prazoAtividade;

    @FXML
    void cancelarAtividade(ActionEvent event) {
        nomeAtividade.clear();
        inicioAtividade.getEditor().clear();
        prazoAtividade.clear();
        // tirar departamento
        Kanban.telas("kanbanPage");
    }

    @FXML
    void criarAtividade(ActionEvent event) {

    }

}
