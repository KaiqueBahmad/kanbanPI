package controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import kanban.Kanban;

public class NewDepartmentController {

    @FXML
    private Button cancelarDepartamento;

    @FXML
    private ColorPicker corDepartamentoCriado;

    @FXML
    private Button criarDepartamento;

    @FXML
    private Label errorDepartamento;

    @FXML
    private TextField nomeDepartamentoCriado;

    @FXML
    private void cancelarDepartamento(ActionEvent event) {
        errorDepartamento.setText("");
        nomeDepartamentoCriado.clear();
        corDepartamentoCriado.setValue(Color.WHITE);
        Kanban.telas("kanbanPage");
    }

    @FXML
    private void criarDepartamento(ActionEvent event) {
        if(nomeDepartamentoCriado.getText().equals("")){
            // verificar também se a cor já não é utilizada em outro departamento
            errorDepartamento.setText("Nome em branco ou cor já utilizada");
        }
        else{
            //salvar cor e nome do departamento
            errorDepartamento.setText("");
            nomeDepartamentoCriado.clear();
            corDepartamentoCriado.setValue(Color.WHITE);
            Kanban.telas("kanbanPage");
        }
        

    }

}
