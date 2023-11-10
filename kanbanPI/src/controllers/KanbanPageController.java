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
    private void voltarProjetos(ActionEvent event) {
        Kanban.telas("selectProject");
    }

}
