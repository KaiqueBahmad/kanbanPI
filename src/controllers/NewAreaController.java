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
import entities.Projeto;

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
        Kanban.telas("selectProject", event);
    }

    @FXML
    private void criarArea(ActionEvent event) {
        String nome = nomeArea.getText();
        nome = Metodos.formatarPalavra(nome);
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
//        Kanban.newActionController.atualizarLista();
                
        errorNovaArea.setText("");
        nomeArea.clear();
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
