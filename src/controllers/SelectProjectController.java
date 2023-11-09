package controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import kanban.Kanban;

public class SelectProjectController {

    @FXML
    private Button logout;

    @FXML
    private Button novoProjeto;

    @FXML
    private void logout(ActionEvent event) {

    }

    @FXML
    private void novoProjeto(ActionEvent event) {
        System.out.println("clicou");
        Kanban.telas("createProjct");
    }

}
