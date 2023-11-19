package controllers;

import entities.Empresa;
import entities.Usuario;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressIndicator;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import kanban.Kanban;
import utils.Metodos;

public class NewUserController {

    @FXML
    private Button cancelarUsuario;

    @FXML
    private Button criarUsuario;

    @FXML
    private ImageView editarProjetoDois;

    @FXML
    private ImageView editarProjetoQuatro;

    @FXML
    private ImageView editarProjetoTres;

    @FXML
    private ImageView editarProjetoUm;

    @FXML
    private Label errorNovoProjeto;

    @FXML
    private Label errorUsuario;

    @FXML
    private ImageView excluirProjetoDois;

    @FXML
    private ImageView excluirProjetoQuatro;

    @FXML
    private ImageView excluirProjetoTres;

    @FXML
    private ImageView excluirProjetoUm;

    @FXML
    private Button logout;

    @FXML
    private Label nomeProjetoDois;

    @FXML
    private Label nomeProjetoQuatro;

    @FXML
    private Label nomeProjetoTres;

    @FXML
    private Label nomeProjetoUm;

    @FXML
    private TextField nomeUsuarioCriado;

    @FXML
    private Button novoProjeto;

    @FXML
    private Button novoUsuario;

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
    private Pane projetoDois;

    @FXML
    private Pane projetoQuatro;

    @FXML
    private Pane projetoTres;

    @FXML
    private Pane projetoUm;

    @FXML
    private TextField senhaUsuarioCriado;

    @FXML
    private Label tituloCriarNovoProjeto;

    @FXML
    private Label tituloCriarNovoUsuario;

    @FXML
    private void cancelarUsuario(ActionEvent event) {
        errorUsuario.setText("");
        nomeUsuarioCriado.clear();
        senhaUsuarioCriado.clear();
        Kanban.telas("selectProject");
    }

    @FXML
    private void criarUsuario(ActionEvent event) {
        if(nomeUsuarioCriado.getText().equals("") || senhaUsuarioCriado.getText().equals("")){
            errorUsuario.setText("Há campos em branco");
            return;
        }
        if (!Metodos.verificarEspacos(nomeUsuarioCriado.getText())) {
            errorUsuario.setText("Política de uso de espaços inadequada.");
            return;
        }
        Empresa empresaLogada = null;
        for (Empresa empresa:Kanban.empresas) {
            if (empresa == null) {
                continue;
            }
            
            if (nomeUsuarioCriado.getText().equals(empresa.getNome())) {
                errorUsuario.setText("Nome já está em uso.");
                return;
            }
            for (Usuario user:empresa.getUsuarios()) {
                if (nomeUsuarioCriado.getText().equals(user.getNome())) {
                    errorUsuario.setText("Nome já está em uso.");
                    return;
                }
            }
            if (Kanban.currentUser.equals(empresa.getNome())) {
                empresaLogada = empresa;
            }
        }
        if (empresaLogada == null) {
            errorUsuario.setText("Erro no Login.");
            return;
        }
        
        empresaLogada.criarUsuario(nomeUsuarioCriado.getText(), senhaUsuarioCriado.getText());
        
        errorUsuario.setText("");
        nomeUsuarioCriado.clear();
        senhaUsuarioCriado.clear();
        Kanban.telas("selectProject");
    }

}
