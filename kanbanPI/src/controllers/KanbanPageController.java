package controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import kanban.Kanban;

public class KanbanPageController {

    @FXML
    private ImageView deletarAtividade;

    @FXML
    private Button logout;

    @FXML
    private Button novaAtividade;

    @FXML
    private Button novoDepartamento;

    @FXML
    private Button novoUsuario;

    @FXML
    private Button voltarProjetos;

    @FXML
    private void logout(ActionEvent event) {
        Kanban.telas("loginPage");
    }

    @FXML
    private void novaAtividade(ActionEvent event) {
        Kanban.telas("newActivit");
    }
    
    @FXML
    private void novoDepartamento(ActionEvent event) {
        Kanban.telas("newDepartment");
    }

    @FXML
    private void novoUsuario(ActionEvent event) {
        Kanban.telas("newUser");
    }

    @FXML
    private void voltarProjetos(ActionEvent event) {
        Kanban.telas("selectProject");
    }

}
