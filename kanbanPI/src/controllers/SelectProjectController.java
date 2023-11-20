package controllers;

import entities.Empresa;
import entities.Projeto;
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
        if (Kanban.loginAdmin) {
            Kanban.empresaAtual().logout();
        } else {
            Kanban.empresaAtual().getUsuarioPorNome(Kanban.currentUser).logout();
        }
        Kanban.telas("loginPage");
    }
    
    @FXML
    private void novaArea(ActionEvent event) {
        if (Kanban.loginAdmin) {
            Kanban.telas("newArea");
       }
    }

    @FXML
    private void novoProjeto(ActionEvent event) {
       // verificar a quantidade de projetos criados
       // Apenas são possíveis até 4 projetos (errorNovoProjeto)
       // trocar opacidade e cursor (projeto, editar e excluir)
       if (Kanban.loginAdmin) {
            Kanban.telas("createProject");
       }
    }
    
    @FXML
    private void novoUsuario(ActionEvent event) {
        if (Kanban.loginAdmin) {
            Kanban.telas("newUser");
       }
    }
    
    @FXML
    private void projetoUm(MouseEvent event) {
        if (Kanban.empresaAtual().getProjetos()[0] != null) {
            Kanban.telas("kanbanPage");
            Kanban.projetoAberto = 0;
        }
    }
    
    @FXML
    private void projetoDois(MouseEvent event) {
        if (Kanban.empresaAtual().getProjetos()[1] != null) {
            Kanban.telas("kanbanPage");
            Kanban.projetoAberto = 1;
        }
    }
    @FXML
    private void projetoTres(MouseEvent event) {
        if (Kanban.empresaAtual().getProjetos()[2] != null) {
            Kanban.telas("kanbanPage");
            Kanban.projetoAberto = 2;
        }
    }
    @FXML
    private void projetoQuatro(MouseEvent event) {
        if (Kanban.empresaAtual().getProjetos()[3] != null) {
            Kanban.telas("kanbanPage");
            Kanban.projetoAberto = 3;
        }
    }

    

    
    
    public void esconderElementos() {
        int opacidade = Kanban.loginAdmin ? 1:0;
        novoProjeto.setOpacity(opacidade);
        tituloCriarNovoProjeto.setOpacity(opacidade);
        novoUsuario.setOpacity(opacidade);
        tituloCriarNovoUsuario.setOpacity(opacidade);
        novaArea.setOpacity(opacidade);
        tituloCriarNovaArea.setOpacity(opacidade);
        editarProjetoUm.setOpacity(opacidade);
        excluirProjetoUm.setOpacity(opacidade);        
        opacidade = 0;
        editarProjetoDois.setOpacity(opacidade);
        editarProjetoTres.setOpacity(opacidade);
        editarProjetoQuatro.setOpacity(opacidade);
        excluirProjetoDois.setOpacity(opacidade);
        excluirProjetoTres.setOpacity(opacidade);
        excluirProjetoQuatro.setOpacity(opacidade);
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
            int opacidade = projetosE[i] != null ? 1:0;
            projetos[i].setOpacity(opacidade);
            projetosExcluir[i].setOpacity(opacidade);
            projetosEditar[i].setOpacity(opacidade);
            if (projetosE[i] == null) {
                continue;
            }
            
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
            
        }
    }
}
