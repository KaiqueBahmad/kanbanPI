package controllers;

import entities.Empresa;
import entities.Projeto;
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
    private Button novaArea;
    
    @FXML
    private Label tituloCriarNovaArea;
    
    @FXML
    private void cancelarUsuario(ActionEvent event) {
        errorUsuario.setText("");
        nomeUsuarioCriado.clear();
        senhaUsuarioCriado.clear();
        Kanban.telas("selectProject", event);
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
        Kanban.telas("selectProject", event);
    }

    public void esconderElementos() {
        int opacidade = Kanban.loginAdmin ? 1:0;
        novoProjeto.setOpacity(opacidade);
        tituloCriarNovoProjeto.setOpacity(opacidade);
        novoUsuario.setOpacity(opacidade);
        tituloCriarNovoUsuario.setOpacity(opacidade);
        novaArea.setOpacity(opacidade);
        tituloCriarNovaArea.setOpacity(opacidade);
        opacidade = 0;
        editarProjetoUm.setOpacity(opacidade);
        excluirProjetoUm.setOpacity(opacidade);        
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
