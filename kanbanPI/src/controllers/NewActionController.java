package controllers;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.ListCell;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import kanban.Kanban;

public class NewActionController {

    @FXML
    private ProgressBar aFazerBarraPorcentDois;

    @FXML
    private ProgressBar aFazerBarraPorcentQuatro;

    @FXML
    private ProgressBar aFazerBarraPorcentTres;

    @FXML
    private ProgressBar aFazerBarraPorcentUm;

    @FXML
    private Pane aFazerCorEscolhidaDois;

    @FXML
    private Pane aFazerCorEscolhidaQuatro;

    @FXML
    private Pane aFazerCorEscolhidaTres;

    @FXML
    private Pane aFazerCorEscolhidaUm;

    @FXML
    private Label aFazerDescricaoDois;

    @FXML
    private Label aFazerDescricaoQuatro;

    @FXML
    private Label aFazerDescricaoTres;

    @FXML
    private Label aFazerDescricaoUm;

    @FXML
    private Pane aFazerDois;

    @FXML
    private Label aFazerInicioFimDois;

    @FXML
    private Label aFazerInicioFimQuatro;

    @FXML
    private Label aFazerInicioFimTres;

    @FXML
    private Label aFazerInicioFimUm;

    @FXML
    private Label aFazerNomeDois;

    @FXML
    private Label aFazerNomeQuatro;

    @FXML
    private Label aFazerNomeTres;

    @FXML
    private Label aFazerNomeUm;

    @FXML
    private Label aFazerPorcentDois;

    @FXML
    private Label aFazerPorcentQuatro;

    @FXML
    private Label aFazerPorcentTres;

    @FXML
    private Label aFazerPorcentUm;

    @FXML
    private Pane aFazerQuatro;

    @FXML
    private Pane aFazerTres;

    @FXML
    private Pane aFazerUm;

    @FXML
    private Label aFazerUsuarioDois;

    @FXML
    private Label aFazerUsuarioQuatro;

    @FXML
    private Label aFazerUsuarioTres;

    @FXML
    private Label aFazerUsuarioUm;

    @FXML
    private ComboBox atividadeAcao;

    @FXML
    private Button cancelarAcao;

    @FXML
    private Button criarAcao;

    @FXML
    private ImageView deletarAcao;

    @FXML
    private Label errorNovaAcao;

    @FXML
    private ProgressBar fazendoBarraPorcentDois;

    @FXML
    private ProgressBar fazendoBarraPorcentQuatro;

    @FXML
    private ProgressBar fazendoBarraPorcentTres;

    @FXML
    private ProgressBar fazendoBarraPorcentUm;

    @FXML
    private Label fazendoDescricaoDois;

    @FXML
    private Label fazendoDescricaoQuatro;

    @FXML
    private Label fazendoDescricaoTres;

    @FXML
    private Label fazendoDescricaoUm;

    @FXML
    private Pane fazendoDois;

    @FXML
    private Label fazendoInicioFimDois;

    @FXML
    private Label fazendoInicioFimQuatro;

    @FXML
    private Label fazendoInicioFimTres;

    @FXML
    private Label fazendoInicioFimUm;

    @FXML
    private Label fazendoNomeDois;

    @FXML
    private Label fazendoNomeQuatro;

    @FXML
    private Label fazendoNomeTres;

    @FXML
    private Label fazendoNomeUm;

    @FXML
    private Label fazendoPorcentDois;

    @FXML
    private Label fazendoPorcentQuatro;

    @FXML
    private Label fazendoPorcentTres;

    @FXML
    private Label fazendoPorcentUm;

    @FXML
    private Pane fazendoQuatro;

    @FXML
    private Pane fazendoTres;

    @FXML
    private Pane fazendoUm;

    @FXML
    private Label fazendoUsuarioDois;

    @FXML
    private Label fazendoUsuarioQuatro;

    @FXML
    private Label fazendoUsuarioTres;

    @FXML
    private Label fazendoUsuarioUm;

    @FXML
    private ProgressBar finalizadoBarraPorcentDois;

    @FXML
    private ProgressBar finalizadoBarraPorcentQuatro;

    @FXML
    private ProgressBar finalizadoBarraPorcentTres;

    @FXML
    private ProgressBar finalizadoBarraPorcentUm;

    @FXML
    private Label finalizadoDescricaoDois;

    @FXML
    private Label finalizadoDescricaoQuatro;

    @FXML
    private Label finalizadoDescricaoTres;

    @FXML
    private Label finalizadoDescricaoUm;

    @FXML
    private Pane finalizadoDois;

    @FXML
    private Label finalizadoInicioFimDois;

    @FXML
    private Label finalizadoInicioFimQuatro;

    @FXML
    private Label finalizadoInicioFimTres;

    @FXML
    private Label finalizadoInicioFimUm;

    @FXML
    private ImageView finalizadoMaisQuatro;

    @FXML
    private ImageView finalizadoMaisTres;

    @FXML
    private ImageView finalizadoMaisUm;

    @FXML
    private Label finalizadoNomeDois;

    @FXML
    private Label finalizadoNomeQuatro;

    @FXML
    private Label finalizadoNomeTres;

    @FXML
    private Label finalizadoNomeUm;

    @FXML
    private Label finalizadoPorcentDois;

    @FXML
    private Label finalizadoPorcentQuatro;

    @FXML
    private Label finalizadoPorcentTres;

    @FXML
    private Label finalizadoPorcentUm;

    @FXML
    private Pane finalizadoQuatro;

    @FXML
    private Pane finalizadoTres;

    @FXML
    private Pane finalizadoUm;

    @FXML
    private Label finalizadoUsuarioDois;

    @FXML
    private Label finalizadoUsuarioQuatro;

    @FXML
    private Label finalizadoUsuarioTres;

    @FXML
    private Label finalizadoUsuarioUm;

    @FXML
    private DatePicker inicioAcao;

    @FXML
    private Button logout;

    @FXML
    private TextField nomeAcao;

    @FXML
    private Button novaAcao;

    @FXML
    private Button novaAtividade;

    @FXML
    private TextField prazoAcao;

    @FXML
    private Label tituloNovaAcao;

    @FXML
    private Label tituloNovaAtividade;

    @FXML
    private ComboBox usuarioAcao;

    @FXML
    private Button voltarProjetos;

    @FXML
    private void cancelarAcao(ActionEvent event) {
        errorNovaAcao.setText("");
        nomeAcao.clear();
        inicioAcao.getEditor().clear();
        prazoAcao.clear();
        atividadeAcao.getSelectionModel().clearSelection();
        atividadeAcao.setButtonCell(new ListCell<String>() {
            @Override
            protected void updateItem(String item, boolean empty) {
                super.updateItem(item, empty) ;
                if (empty || item == null) {
                    setText("Atividade");
                } else {
                    setText(item);
                }
            }
        });
        usuarioAcao.getSelectionModel().clearSelection();
        usuarioAcao.setButtonCell(new ListCell<String>() {
            @Override
            protected void updateItem(String item, boolean empty) {
                super.updateItem(item, empty) ;
                if (empty || item == null) {
                    setText("Usuário responsável");
                } else {
                    setText(item);
                }
            }
        });
        Kanban.telas("kanbanPage");
    }

    @FXML
    private void criarAcao(ActionEvent event) {
        if(nomeAcao.getText().equals("") || prazoAcao.getText().equals("")){
            // verificar tbm os outros campos
            // verificar se o prazo n está com número negativo
            errorNovaAcao.setText("Há campos em branco");
        }
        else{
            //salvar tudo
            errorNovaAcao.setText("");
            nomeAcao.clear();
            inicioAcao.getEditor().clear();
            prazoAcao.clear();
            atividadeAcao.getSelectionModel().clearSelection();
            atividadeAcao.setButtonCell(new ListCell<String>() {
                @Override
                protected void updateItem(String item, boolean empty) {
                    super.updateItem(item, empty) ;
                    if (empty || item == null) {
                        setText("Atividade");
                    } else {
                        setText(item);
                    }
                }
            });
            usuarioAcao.getSelectionModel().clearSelection();
            usuarioAcao.setButtonCell(new ListCell<String>() {
                @Override
                protected void updateItem(String item, boolean empty) {
                    super.updateItem(item, empty) ;
                    if (empty || item == null) {
                        setText("Usuário responsável");
                    } else {
                        setText(item);
                    }
                }
            });
            //atualizar tela do kanban
            Kanban.telas("kanbanPage");
        }
    }
    
    
    @FXML
    public void initialize() {
        // forma de adicionar opções na combo box
        ObservableList<String> opcoesDept = FXCollections.observableArrayList("Opção 1", "Opção 2", "Opção 3");
        atividadeAcao.setItems(opcoesDept);
        
        ObservableList<String> opcoesUser = FXCollections.observableArrayList("user 1", "user 2", "user 3");
        usuarioAcao.setItems(opcoesUser);
        opcoesUser.add("user 4");
    }

}
