package controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressIndicator;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import kanban.Kanban;

public class CreateProjectController {

    @FXML
    private Button cancelarProjeto;

    @FXML
    private Button criarProjeto;

    @FXML
    private TextArea descricaoNovoProjeto;

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
    private ImageView excluirProjetoDois;

    @FXML
    private ImageView excluirProjetoQuatro;

    @FXML
    private ImageView excluirProjetoTres;

    @FXML
    private ImageView excluirProjetoUm;

    @FXML
    private TextField nomeNovoProjeto;

    @FXML
    private Label nomeProjetoDois;

    @FXML
    private Label nomeProjetoQuatro;

    @FXML
    private Label nomeProjetoTres;

    @FXML
    private Label nomeProjetoUm;

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
    private void cancelarProjeto(ActionEvent event) {
        errorNovoProjeto.setText("");
        nomeNovoProjeto.clear();
        descricaoNovoProjeto.clear();
        Kanban.telas("selectProject");
    }

    @FXML
    private void criarProjeto(ActionEvent event) {
        if(nomeNovoProjeto.getText().equals("") || descricaoNovoProjeto.getText().equals("")){
            errorNovoProjeto.setText("Há campos em branco");
        }
        else{
            // salvar nome e descrição
            errorNovoProjeto.setText("");
            nomeNovoProjeto.clear();
            descricaoNovoProjeto.clear();
            Kanban.telas("selectProject");
        }
    }

}
