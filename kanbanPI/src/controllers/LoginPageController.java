package controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import kanban.Kanban;

public class LoginPageController {

    @FXML
    private PasswordField cadastroConfirmarSenhaEmpresa;

    @FXML
    private TextField cadastroNomeEmpresa;

    @FXML
    private PasswordField cadastroSenhaEmpresa;

    @FXML
    private TextField entrarNomeEmpresa;

    @FXML
    private PasswordField entrarSenhaEmpresa;

    @FXML
    private Button entrarUsuario;

    @FXML
    private Label errorCadastro;

    @FXML
    private Label errorEntrar;

    @FXML
    private Button novoCadastro;

    @FXML
    private void entrarUsuario(ActionEvent event) {
        if(entrarNomeEmpresa.getText().equals("") || entrarSenhaEmpresa.getText().equals("")) {
            errorEntrar.setText("Há campos em branco");
        }
        else{
            // Empresa não encontrada
            // Senha inválida
            // verificar se nome empresa existe e dps verificar se senha bate
            errorEntrar.setText("");
            entrarNomeEmpresa.clear();
            entrarSenhaEmpresa.clear();
            Kanban.telas("selectProject");
        }
    }

    @FXML
    private void novoCadastro(ActionEvent event) {
        if(cadastroNomeEmpresa.getText().equals("") || cadastroSenhaEmpresa.getText().equals("") || cadastroConfirmarSenhaEmpresa.getText().equals("")) {
            errorCadastro.setText("Há campos em branco");
            // proibir espaços sequenciais, no inicio e no fim
        }
        else{
            //salvar nome e senha
            errorCadastro.setText("");
            cadastroNomeEmpresa.clear();
            cadastroSenhaEmpresa.clear();
            cadastroConfirmarSenhaEmpresa.clear();
        }

    }

}
