package controllers;

import entities.Projeto;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressIndicator;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import kanban.Kanban;

public class NewNameProjectController {

    @FXML
    private TextField attNomeNovoProjeto;

    @FXML
    private Button attNomeProjeto;

    @FXML
    private Button cancelarProjeto;

    @FXML
    private ImageView editarProjetoDois;

    @FXML
    private ImageView editarProjetoQuatro;

    @FXML
    private ImageView editarProjetoTres;

    @FXML
    private ImageView editarProjetoUm;

    @FXML
    private Label errorEditarNomeProjeto;

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
    private Label tituloCriarNovoProjeto;

    @FXML
    private Label tituloCriarNovoUsuario;
    
    @FXML
    private void attNomeProjeto(ActionEvent event) {
        String novoNome = attNomeNovoProjeto.getText();
        if(novoNome.equals("")){
            errorEditarNomeProjeto.setText("Há campos em branco");
            return;
        }
        for (Projeto proj:Kanban.empresaAtual().getProjetos()) {
            if (null == proj) {
                continue;
            }
            if (novoNome.equals(proj.getNome())) {
                return;
            }
        }
        if (novoNome.equals(Kanban.empresaAtual().getProjetos()[Kanban.projetoAberto])) {
            errorEditarNomeProjeto.setText("Que falta de criatividade.");
            return;
        }
        Kanban.empresaAtual().getProjetos()[Kanban.projetoAberto].mudarNome(novoNome);
        errorEditarNomeProjeto.setText("");
        attNomeNovoProjeto.clear();
        Kanban.telas("selectProject");
    }

    @FXML
    private void cancelarProjeto(ActionEvent event) {
        errorEditarNomeProjeto.setText("");
        attNomeNovoProjeto.clear();
        Kanban.telas("selectProject");
    }

}