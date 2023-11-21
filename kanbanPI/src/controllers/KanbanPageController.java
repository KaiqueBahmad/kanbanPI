package controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import kanban.Kanban;

public class KanbanPageController {

    @FXML
    private ProgressBar aFazerBarraPorcentDois;

    @FXML
    private ProgressBar aFazerBarraPorcentQuatro;

    @FXML
    private ProgressBar aFazerBarraPorcentTres;

    @FXML
    private ProgressBar aFazerBarraPorcentUm;

    @FXML
    private Pane aFazerCorEscolhidaBarraDois;

    @FXML
    private Pane aFazerCorEscolhidaBarraQuatro;

    @FXML
    private Pane aFazerCorEscolhidaBarraTres;

    @FXML
    private Pane aFazerCorEscolhidaBarraUm;

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
    private ImageView aFazerMaisDois;

    @FXML
    private ImageView aFazerMaisQuatro;

    @FXML
    private ImageView aFazerMaisTres;

    @FXML
    private ImageView aFazerMaisUm;

    @FXML
    private ImageView aFazerMenosDois;

    @FXML
    private ImageView aFazerMenosQuatro;

    @FXML
    private ImageView aFazerMenosTres;

    @FXML
    private ImageView aFazerMenosUm;

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
    private ImageView aFazerProximo;

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
    private ImageView deletarAcao;

    @FXML
    private Label errorKanbanLixo;

    @FXML
    private ProgressBar fazendoBarraPorcentDois;

    @FXML
    private ProgressBar fazendoBarraPorcentQuatro;

    @FXML
    private ProgressBar fazendoBarraPorcentTres;

    @FXML
    private ProgressBar fazendoBarraPorcentUm;

    @FXML
    private Pane fazendoCorEscolhidaBarraDois;

    @FXML
    private Pane fazendoCorEscolhidaBarraQuatro;

    @FXML
    private Pane fazendoCorEscolhidaBarraTres;

    @FXML
    private Pane fazendoCorEscolhidaBarraUm;

    @FXML
    private Pane fazendoCorEscolhidaDois;

    @FXML
    private Pane fazendoCorEscolhidaQuatro;

    @FXML
    private Pane fazendoCorEscolhidaTres;

    @FXML
    private Pane fazendoCorEscolhidaUm;

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
    private ImageView fazendoMaisDois;

    @FXML
    private ImageView fazendoMaisQuatro;

    @FXML
    private ImageView fazendoMaisTres;

    @FXML
    private ImageView fazendoMaisUm;

    @FXML
    private ImageView fazendoMenosDois;

    @FXML
    private ImageView fazendoMenosQuatro;

    @FXML
    private ImageView fazendoMenosTres;

    @FXML
    private ImageView fazendoMenosUm;

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
    private ImageView fazendoProximo;

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
    private Pane finalizadoCorEscolhidaBarraDois;

    @FXML
    private Pane finalizadoCorEscolhidaBarraQuatro;

    @FXML
    private Pane finalizadoCorEscolhidaBarraTres;

    @FXML
    private Pane finalizadoCorEscolhidaBarraUm;

    @FXML
    private Pane finalizadoCorEscolhidaDois;

    @FXML
    private Pane finalizadoCorEscolhidaQuatro;

    @FXML
    private Pane finalizadoCorEscolhidaTres;

    @FXML
    private Pane finalizadoCorEscolhidaUm;

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
    private ImageView finalizadoMaisDois;

    @FXML
    private ImageView finalizadoMaisQuatro;

    @FXML
    private ImageView finalizadoMaisTres;

    @FXML
    private ImageView finalizadoMaisUm;

    @FXML
    private ImageView finalizadoMenosDois;

    @FXML
    private ImageView finalizadoMenosQuatro;

    @FXML
    private ImageView finalizadoMenosTres;

    @FXML
    private ImageView finalizadoMenosUm;

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
    private ImageView finalizadoProximo;

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
    private Button logout;

    @FXML
    private Button novaAcao;

    @FXML
    private Button novaAtividade;

    @FXML
    private Label tituloNovaAcao;

    @FXML
    private Label tituloNovaAtividade;

    @FXML
    private Button voltarProjetos;
    
    @FXML
    private void aFazerMaisDois(MouseEvent event) {

    }

    @FXML
    private void aFazerMaisQuatro(MouseEvent event) {

    }

    @FXML
    private void aFazerMaisTres(MouseEvent event) {

    }

    @FXML
    private void aFazerMaisUm(MouseEvent event) {

    }

    @FXML
    private void aFazerMenosDois(MouseEvent event) {

    }

    @FXML
    private void aFazerMenosQuatro(MouseEvent event) {

    }

    @FXML
    private void aFazerMenosTres(MouseEvent event) {

    }

    @FXML
    private void aFazerMenosUm(MouseEvent event) {

    }

    @FXML
    private void aFazerProximo(MouseEvent event) {

    }
    
    @FXML
    private void deletarAcao(MouseEvent event) {
        errorKanbanLixo.setText("Selecione o Post-it que deseja excluir");
        
        //retirar qnd clicar em algum post-it
    }

    @FXML
    private void fazendoMaisDois(MouseEvent event) {

    }

    @FXML
    private void fazendoMaisQuatro(MouseEvent event) {

    }

    @FXML
    private void fazendoMaisTres(MouseEvent event) {

    }

    @FXML
    private void fazendoMaisUm(MouseEvent event) {

    }

    @FXML
    private void fazendoMenosDois(MouseEvent event) {

    }

    @FXML
    private void fazendoMenosQuatro(MouseEvent event) {

    }

    @FXML
    private void fazendoMenosTres(MouseEvent event) {

    }

    @FXML
    private void fazendoMenosUm(MouseEvent event) {

    }

    @FXML
    private void fazendoProximo(MouseEvent event) {

    }

    @FXML
    private void finalizadoMaisDois(MouseEvent event) {

    }

    @FXML
    private void finalizadoMaisQuatro(MouseEvent event) {

    }

    @FXML
    private void finalizadoMaisTres(MouseEvent event) {

    }

    @FXML
    private void finalizadoMenosDois(MouseEvent event) {

    }

    @FXML
    private void finalizadoMenosQuatro(MouseEvent event) {

    }

    @FXML
    private void finalizadoMenosTres(MouseEvent event) {

    }

    @FXML
    private void finalizadoMenosUm(MouseEvent event) {

    }

    @FXML
    private void finalizadoProximo(MouseEvent event) {

    }

    @FXML
    private void logout(ActionEvent event) {
        errorKanbanLixo.setText("");
        if (Kanban.loginAdmin) {
            Kanban.empresaAtual().logout();
        } else {
            Kanban.empresaAtual().getUsuarioPorNome(Kanban.currentUser).logout();
        }
        Kanban.telas("loginPage");
    }

    @FXML
    private void novaAcao(ActionEvent event) {
        if (Kanban.loginAdmin) {
            errorKanbanLixo.setText("");
            Kanban.telas("newAction");
       }
        
    }
    
    @FXML
    private void novaAtividade(ActionEvent event) {
        if (Kanban.loginAdmin) {
            errorKanbanLixo.setText("");
            Kanban.telas("newActivit");
       }
        
    }

    @FXML
    private void voltarProjetos(ActionEvent event) {
        errorKanbanLixo.setText("");
        Kanban.telas("selectProject");
    }
    
    public void esconderElementos() {
        int opacidade = Kanban.loginAdmin ? 1:0;
        novaAcao.setOpacity(opacidade);
        tituloNovaAcao.setOpacity(opacidade);
        novaAtividade.setOpacity(opacidade);
        tituloNovaAtividade.setOpacity(opacidade);
        deletarAcao.setOpacity(opacidade);
    }

    public void loadAtividades() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
