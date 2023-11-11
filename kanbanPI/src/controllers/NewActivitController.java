package controllers;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.ListCell;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import kanban.Kanban;

public class NewActivitController {

    @FXML
    private Button cancelarAtividade;

    @FXML
    private Button criarAtividade;

    @FXML
    private ImageView deletarAtividade;

    @FXML
    private ComboBox departamentoAtividade;

    @FXML
    private DatePicker inicioAtividade;

    @FXML
    private TextField nomeAtividade;

    @FXML
    private TextField prazoAtividade;

    @FXML
    private ComboBox usuarioAtividade;

    @FXML
    private void cancelarAtividade(ActionEvent event) {
        nomeAtividade.clear();
        inicioAtividade.getEditor().clear();
        prazoAtividade.clear();
        departamentoAtividade.getSelectionModel().clearSelection();
        departamentoAtividade.setButtonCell(new ListCell<String>() {
            @Override
            protected void updateItem(String item, boolean empty) {
                super.updateItem(item, empty) ;
                if (empty || item == null) {
                    setText("Departamento");
                } else {
                    setText(item);
                }
            }
        });
        usuarioAtividade.getSelectionModel().clearSelection();
        usuarioAtividade.setButtonCell(new ListCell<String>() {
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
        usuarioAtividade.setPromptText("Usuário responsável");
        Kanban.telas("kanbanPage");
    }

    @FXML
    private void criarAtividade(ActionEvent event) {
        //salvar tudo
        nomeAtividade.clear();
        inicioAtividade.getEditor().clear();
        prazoAtividade.clear();
        departamentoAtividade.getSelectionModel().clearSelection();
        departamentoAtividade.setButtonCell(new ListCell<String>() {
            @Override
            protected void updateItem(String item, boolean empty) {
                super.updateItem(item, empty) ;
                if (empty || item == null) {
                    setText("Departamento");
                } else {
                    setText(item);
                }
            }
        });
        usuarioAtividade.getSelectionModel().clearSelection();
        usuarioAtividade.setButtonCell(new ListCell<String>() {
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
    
    
    @FXML
    public void initialize() {
        // forma de adicionar opções na combo box
        ObservableList<String> opcoesDept = FXCollections.observableArrayList("Opção 1", "Opção 2", "Opção 3");
        departamentoAtividade.setItems(opcoesDept);
        
        ObservableList<String> opcoesUser = FXCollections.observableArrayList("user 1", "user 2", "user 3");
        usuarioAtividade.setItems(opcoesUser);
        opcoesUser.add("user 4");
    }

}
