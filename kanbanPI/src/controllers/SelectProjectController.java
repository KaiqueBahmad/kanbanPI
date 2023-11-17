package controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressIndicator;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import kanban.Kanban;

public class SelectProjectController {

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
    private void editarProjetoDois(MouseEvent event) {
        // verificar se projeto existe
        Kanban.telas("newName");
    }

    @FXML
    private void editarProjetoTres(MouseEvent event) {
        // verificar se projeto existe
        Kanban.telas("newName");
    }

    @FXML
    private void editarProjetoUm(MouseEvent event) {
        // verificar se projeto existe
        Kanban.telas("newName");
    }
    
        @FXML
    private void editarProjetoQuatro(MouseEvent event) {
        // verificar se projeto existe
        Kanban.telas("newName");
    }

    @FXML
    private void excluirProjetoQuatro(MouseEvent event) {
        // verificar se projeto existe
    }

    @FXML
    private void excluirProjetoTres(MouseEvent event) {
        // verificar se projeto existe
    }

    @FXML
    private void excluirProjetoUm(MouseEvent event) {
        // verificar se projeto existe
    }

    @FXML
    private void logout(ActionEvent event) {
        Kanban.telas("loginPage");
    }

    @FXML
    private void novoProjeto(ActionEvent event) {
       // verificar a quantidade de projetos criados
       // Apenas são possíveis até 4 projetos (errorNovoProjeto)
       if (Kanban.loginAdmin) {
            Kanban.telas("createProject");
       }
    }
    
    @FXML
    void novoUsuario(ActionEvent event) {
        if (Kanban.loginAdmin) {
            Kanban.telas("newUser");
       }
    }

    @FXML
    private void projetoDois(MouseEvent event) {
        // verificar se projeto existe
        Kanban.telas("kanbanPage");
    }

    @FXML
    private void projetoQuatro(MouseEvent event) {
        // verificar se projeto existe
        Kanban.telas("kanbanPage");
    }

    @FXML
    private void projetoTres(MouseEvent event) {
        // verificar se projeto existe
        Kanban.telas("kanbanPage");
    }

    @FXML
    private void projetoUm(MouseEvent event) {
        // verificar se projeto existe
        Kanban.telas("kanbanPage");
    }
    
    public void esconderElementos() {
        if (!Kanban.loginAdmin) {
            novoProjeto.setOpacity(0);
            tituloCriarNovoProjeto.setOpacity(0);
            novoUsuario.setOpacity(0);
            tituloCriarNovoUsuario.setOpacity(0);
            editarProjetoUm.setOpacity(0);
            editarProjetoDois.setOpacity(0);
            editarProjetoTres.setOpacity(0);
            editarProjetoQuatro.setOpacity(0);
            excluirProjetoUm.setOpacity(0);
            excluirProjetoDois.setOpacity(0);
            excluirProjetoTres.setOpacity(0);
            excluirProjetoQuatro.setOpacity(0);
        }
    }
}
