package controllers;

import entities.Empresa;
import entities.Projeto;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import kanban.Kanban;
import utils.Metodos;

public class NewActivitController {

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
    private Button cancelarAtividade;

    @FXML
    private ColorPicker corAtividadeCriado;

    @FXML
    private Button criarAtividade;

    @FXML
    private ImageView deletarAcao;

    @FXML
    private Label errorAtividade;

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
    private Button logout;

    @FXML
    private TextField nomeAtividadeCriado;

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
    private void cancelarAtividade(ActionEvent event) {
        errorAtividade.setText("");
        nomeAtividadeCriado.clear();
        corAtividadeCriado.setValue(Color.WHITE);
        Kanban.telas("kanbanPage", event);
    }

    @FXML
    private void criarAtividade(ActionEvent event) {
        if(nomeAtividadeCriado.getText().equals("")){
            errorAtividade.setText("Nome em branco ou cor já utilizada");
            return;
        }
        String nomeAtividade = nomeAtividadeCriado.getText();
        Color cor = corAtividadeCriado.getValue();
        String corHex = String.format( "#%02X%02X%02X",
            (int)( cor.getRed() * 255 ),
            (int)( cor.getGreen() * 255 ),
            (int)( cor.getBlue() * 255 )
        );
        if (!Metodos.verificarEspacos(nomeAtividadeCriado.getText())) {
            errorAtividade.setText("Política de uso de espaços inadequada.");
            return;
        }
        if (Kanban.projetoAberto == -1) {
            errorAtividade.setText("Problemas ao encontrar o projeto.");
            return;
        }
        Projeto projeto = Kanban.empresaAtual().getProjetos()[Kanban.projetoAberto];
        if (projeto.criarAtividade(nomeAtividade, corHex)) {
            errorAtividade.setText("");     
            nomeAtividadeCriado.clear();
            corAtividadeCriado.setValue(Color.WHITE);
            Kanban.telas("kanbanPage", event);
        } else {
            errorAtividade.setText("Já existe uma área com este nome.");
        }
    }
//        @FXML
//    private void criarProjeto(ActionEvent event) {        
//        if(nomeNovoProjeto.getText().equals("") || descricaoNovoProjeto.getText().equals("")){
//            errorNovoProjeto.setText("Há campos em branco");
//            return;
//        }
//        String nomeProjeto = nomeNovoProjeto.getText();
//        String descricaoProjeto=  descricaoNovoProjeto.getText();
//        if (!Metodos.verificarEspacos(nomeNovoProjeto.getText())) {
//            errorNovoProjeto.setText("Política de uso de espaços inadequada.");
//            return;
//        }
//        Empresa empresaLogada = Kanban.empresaAtual();
//        if (empresaLogada == null) {
//            return;
//        }
//        for (Projeto projeto:empresaLogada.getProjetos()) {
//            if (projeto == null) {
//                continue;
//            }
//            if (nomeProjeto.equals(projeto.getNome())) {
//                errorNovoProjeto.setText("Nome já está em uso.");
//                return;
//            }
//        }
//        if (empresaLogada.criarProjeto(nomeProjeto, descricaoProjeto)) {
//            errorNovoProjeto.setText("");
//            nomeNovoProjeto.clear();
//            descricaoNovoProjeto.clear();
//            Kanban.telas("selectProject");
//        } else {
//            errorNovoProjeto.setText("Política de uso de espaços inadequada.");
//        }
//    }
}
