package controllers;

import entities.Area;
import entities.Atividade;
import entities.Empresa;
import entities.Usuario;
import java.time.LocalDate;
import java.time.ZoneId;
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
import utils.Metodos;

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
    private ComboBox areaAcao;

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
       
    private ObservableList<String> opcoesAtividade;
    private ObservableList<String> opcoesUsuario;
    private ObservableList<String> opcoesArea;
    
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
        areaAcao.getSelectionModel().clearSelection();
        areaAcao.setButtonCell(new ListCell<String>() {
            @Override
            protected void updateItem(String item, boolean empty) {
                super.updateItem(item, empty) ;
                if (empty || item == null) {
                    setText("Área");
                } else {
                    setText(item);
                }
            }
        });
        Kanban.telas("kanbanPage");
    }

    @FXML
    private void criarAcao(ActionEvent event) {
//        if(nomeAcao.getText().equals("") || prazoAcao.getText().equals("")){
//            // verificar tbm os outros campos
//            // verificar se o prazo n está com número negativo
//            errorNovaAcao.setText("Há campos em branco");
//        }
        
        String nome = nomeAcao.getText();
        String prazo = prazoAcao.getText();
        LocalDate data = inicioAcao.getValue();
//        long data = inicioAcao.getValue().toEpochDay();
        if (nome.equals("") || prazo.equals("")|| data == null) {
            errorNovaAcao.setText("Há campos em branco");
        }
        long epochData = data.atStartOfDay(ZoneId.systemDefault()).toEpochSecond();
        System.out.println(epochData);
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
        areaAcao.getSelectionModel().clearSelection();
        areaAcao.setButtonCell(new ListCell<String>() {
            @Override
            protected void updateItem(String item, boolean empty) {
                super.updateItem(item, empty) ;
                if (empty || item == null) {
                    setText("Área");
                } else {
                    setText(item);
                }
            }
        });
        //atualizar tela do kanban
        Kanban.telas("kanbanPage");

    }
//    Programar essa parada aqui
//    public void atualizarListaArea() {
//        Empresa empresaLogada = null;
//        if (!Kanban.loginAdmin) {
//            return;
//        }
//        for (Empresa empresa:Kanban.empresas) {
//            if (empresa == null) {
//                continue;
//            }
//            if (Kanban.currentUser.equals(empresa.getNome())) {
//                empresaLogada = empresa;
//            }
//        }
//        
//        for (Area area:empresaLogada.getAreas()) {
//            if (!Metodos.jaEstaNaLista(area.getNome(), opcoesAreaArray)) {
//                opcoesArea.add(area.getNome());
//                for (String item:opcoesAreaArray) {
//                    item = area.getNome();
//                }
//            }
//        }
//    }
    
    public void loadAreasLista() {
        Empresa empresaLogada = null;
        if (!Kanban.loginAdmin) {
            return;
        }
        for (Empresa empresa:Kanban.empresas) {
            if (empresa == null) {
                continue;
            }
            if (Kanban.currentUser.equals(empresa.getNome())) {
                empresaLogada = empresa;
            }
        }
        opcoesArea.clear();
        for (Area area:empresaLogada.getAreas()) {
            opcoesArea.add(area.getNome());
        }
    }
    
    public void loadUsuariosLista() {
        Empresa empresaLogada = null;
        if (!Kanban.loginAdmin) {
            return;
        }
        for (Empresa empresa:Kanban.empresas) {
            if (empresa == null) {
                continue;
            }
            if (Kanban.currentUser.equals(empresa.getNome())) {
                empresaLogada = empresa;
            }
        }
        opcoesUsuario.clear();
        for (Usuario user:empresaLogada.getUsuarios()) {
            opcoesUsuario.add(user.getNome());
        }
    }
    
    public void loadAtividadesLista() {
        Empresa empresaLogada = null;
        if (!Kanban.loginAdmin) {
            return;
        }
        Empresa empresa = Kanban.empresaAtual();
        opcoesAtividade.clear();
        for (Atividade at:empresa.getProjetos()[Kanban.projetoAberto].getAtividades()) {
            opcoesAtividade.add(at.getNome());
        }
    }
    
    @FXML
    public void initialize() {
        // forma de adicionar opções na combo box
        opcoesAtividade = FXCollections.observableArrayList();
        opcoesUsuario = FXCollections.observableArrayList();
        opcoesArea = FXCollections.observableArrayList();
        areaAcao.setItems(opcoesArea);
        usuarioAcao.setItems(opcoesUsuario);
        atividadeAcao.setItems(opcoesAtividade);
    }
}
