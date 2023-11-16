package controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
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
    private Label tituloNovaAtividade;

    @FXML
    private Label tituloNovoDepartamento;

    @FXML
    private Label tituloNovoUsuario;

    @FXML
    private Button voltarProjetos;

    @FXML
    private void logout(ActionEvent event) {
        Kanban.telas("loginPage");
    }

    @FXML
    private void novaAtividade(ActionEvent event) {
        if (Kanban.loginAdmin) {
            Kanban.telas("newActivit");
       }
        
    }
    
    @FXML
    private void novoDepartamento(ActionEvent event) {
        if (Kanban.loginAdmin) {
            Kanban.telas("newDepartment");
       }
        
    }

    @FXML
    private void novoUsuario(ActionEvent event) {
        if (Kanban.loginAdmin) {
            Kanban.telas("newUser");
       }
        
    }

    @FXML
    private void voltarProjetos(ActionEvent event) {
        Kanban.telas("selectProject");
    }
    
    public void esconderElementos() {
        if (!Kanban.loginAdmin) {
            tituloNovaAtividade.setOpacity(0);
            tituloNovoDepartamento.setOpacity(0);
            tituloNovoUsuario.setOpacity(0);
            novaAtividade.setOpacity(0);
            novoDepartamento.setOpacity(0);
            novoUsuario.setOpacity(0);
            deletarAtividade.setOpacity(0);
        }
    }

}
