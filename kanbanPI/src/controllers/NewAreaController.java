package controllers;

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
import entities.Empresa;

public class NewAreaController {

    @FXML
    private Button cancelarArea;

    @FXML
    private Button criarArea;

    @FXML
    private ImageView editarProjetoDois;

    @FXML
    private ImageView editarProjetoQuatro;

    @FXML
    private ImageView editarProjetoTres;

    @FXML
    private ImageView editarProjetoUm;

    @FXML
    private Label errorNovaArea;

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
    private TextField nomeArea;

    @FXML
    private Label nomeProjetoDois;

    @FXML
    private Label nomeProjetoQuatro;

    @FXML
    private Label nomeProjetoTres;

    @FXML
    private Label nomeProjetoUm;

    @FXML
    private Button novaArea;

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
    private Label tituloCriarNovaArea;

    @FXML
    private Label tituloCriarNovoProjeto;

    @FXML
    private Label tituloCriarNovoUsuario;

    @FXML
    private void cancelarArea(ActionEvent event) {
        nomeArea.clear();
        errorNovaArea.setText("");
        Kanban.telas("selectProject");
    }

    @FXML
    private void criarArea(ActionEvent event) {
        String nome = nomeArea.getText();
        if(nome.equals("")){
            errorNovaArea.setText("Há campos em branco");
            return;
        }
        if (!Metodos.verificarEspacos(nome)) {
            errorNovaArea.setText("Política de uso de espaços inadequada.");
            return;
        }
        Empresa empresaLogada = null;
        for (Empresa empresa:Kanban.empresas) {
            if (empresa == null) {
                continue;
            }            
            if (Kanban.currentUser.equals(empresa.getNome())) {
                empresaLogada = empresa;
            }
        }
        if (empresaLogada == null) {
            errorNovaArea.setText("Erro no Login.");
            return;
        }
        if (empresaLogada.getAreaPorNome(nome) != null) {
            errorNovaArea.setText("Nome já está em uso.");
            return;
        }
        
        
        empresaLogada.criarArea(nome);
        
        errorNovaArea.setText("");
        nomeArea.clear();
        Kanban.telas("selectProject");
    }

}
