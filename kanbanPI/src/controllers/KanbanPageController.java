package controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import kanban.Kanban;

public class KanbanPageController {

    @FXML
    private Pane aFazerDois;

    @FXML
    private ImageView aFazerProximo;

    @FXML
    private Pane aFazerQuatro;

    @FXML
    private Pane aFazerTres;

    @FXML
    private Pane aFazerUm;

    @FXML
    private ImageView deletarAtividade;

    @FXML
    private Pane fazendoDois;

    @FXML
    private ImageView fazendoProximo;

    @FXML
    private Pane fazendoQuatro;

    @FXML
    private Pane fazendoTres;

    @FXML
    private Pane fazendoUm;

    @FXML
    private Pane finalizadoDois;

    @FXML
    private ImageView finalizadoProximo;

    @FXML
    private Pane finalizadoQuatro;

    @FXML
    private Pane finalizadoTres;

    @FXML
    private Pane finalizadoUm;

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
    void aFazerProximo(MouseEvent event) {

    }

    @FXML
    void fazendoProximo(MouseEvent event) {

    }

    @FXML
    void finalizadoProximo(MouseEvent event) {

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
        if (Kanban.loginAdmin) {
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
