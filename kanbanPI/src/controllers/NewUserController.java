package controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import kanban.Kanban;

public class NewUserController {

    @FXML
    private Button cancelarUsuario;

    @FXML
    private Button criarUsuario;

    @FXML
    private Label errorUsuario;

    @FXML
    private TextField nomeUsuarioCriado;

    @FXML
    private TextField senhaUsuarioCriado;

    @FXML
    void cancelarUsuario(ActionEvent event) {
        errorUsuario.setText("");
        nomeUsuarioCriado.clear();
        senhaUsuarioCriado.clear();
        Kanban.telas("selectProject");
    }

    @FXML
    void criarUsuario(ActionEvent event) {
        if(nomeUsuarioCriado.getText().equals("") || senhaUsuarioCriado.getText().equals("")){
            errorUsuario.setText("Há campos em branco");
        }
        else{
            //salvar
            errorUsuario.setText("");
            nomeUsuarioCriado.clear();
            senhaUsuarioCriado.clear();
            Kanban.telas("selectProject");


        }
    }

}
