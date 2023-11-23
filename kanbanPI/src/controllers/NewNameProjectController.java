package controllers;

import entities.Empresa;
import entities.Projeto;
import java.util.Arrays;
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
        if (!Metodos.verificarEspacos(novoNome)) {
            errorEditarNomeProjeto.setText("Politica de uso de espaços inadequada");
            return;
        }
        if (!Kanban.empresaAtual().getProjetos()[Kanban.projetoAberto].mudarNome(novoNome)) {
            errorEditarNomeProjeto.setText("Que falta de criatividade");
            return;
        }
        errorEditarNomeProjeto.setText("");
        attNomeNovoProjeto.clear();
        Kanban.telas("selectProject", event);
    }

    @FXML
    private void cancelarProjeto(ActionEvent event) {
        errorEditarNomeProjeto.setText("");
        attNomeNovoProjeto.clear();
        Kanban.telas("selectProject", event);
    }

    public void loadProjetos() {
        Pane[] projetos = {projetoUm, projetoDois, projetoTres, projetoQuatro};
        Label[] projetoNomes = {nomeProjetoUm, nomeProjetoDois, nomeProjetoTres, nomeProjetoQuatro};
        Label[] projetoQtdAcoes = {numPostProjetoUm, numPostProjetoDois, numPostProjetoTres, numPostProjetoQuatro};
        ProgressIndicator[] projetoProgressos = {progressoTotalUm, progressoTotalDois, progressoTotalTres, progressoTotalQuatro};
        ImageView[] projetosExcluir = {excluirProjetoUm, excluirProjetoDois, excluirProjetoTres, excluirProjetoQuatro};
        ImageView[] projetosEditar = {editarProjetoUm, editarProjetoDois, editarProjetoTres, editarProjetoQuatro};
        Empresa empresa = Kanban.empresaAtual();
        Projeto[] projetosE = empresa.getProjetos();
        for (int i = 0; i < 4; i++) {
            if (projetosE[i] == null) {
                projetos[i].setOpacity(0);
                continue;
            }
            projetos[i].setOpacity(1);
            projetoNomes[i].setText(projetosE[i].getNome());
            int numPostIts = projetosE[i].numAcoes();
            if (numPostIts == 1) {
                String mensagem = Integer.toString(numPostIts)+" post-it";
                projetoQtdAcoes[i].setText(mensagem);
            } else {
                String mensagem = Integer.toString(numPostIts)+" post-its";
                projetoQtdAcoes[i].setText(mensagem);
            }
            projetoProgressos[i].setProgress(projetosE[i].getPorcentagem());
            projetosExcluir[i].setOpacity(1);
            projetosEditar[i].setOpacity(1);
        }
    }

}