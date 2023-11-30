package controllers;

import entities.Acao;
import entities.Area;
import entities.Atividade;
import entities.Empresa;
import entities.PostIt;
import entities.Usuario;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import javafx.beans.binding.Bindings;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.ListCell;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
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
    @FXML
    private Pane popupNewAction;
    
    @FXML
    private Button novoRelatorio;

    @FXML
    private Label tituloGerarRelatorio;
       
    private ObservableList<String> opcoesAtividade;
    private ObservableList<String> opcoesUsuario;
    private ObservableList<String> opcoesArea;
    private PostIt[][] postIts;
    public static ArrayList<Acao> aFazer;
    public static ArrayList<Acao> fazendo;
    public static ArrayList<Acao> finalizado;
    
    
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
        Kanban.telas("kanbanPage", event);
    }

    @FXML
    private void trocaCor(ActionEvent event) {
        if (atividadeAcao.getSelectionModel().getSelectedItem() == null) {
            atividadeAcao.setStyle("-fx-background-radius:10px;-fx-font-size:25px;-fx-color:#FFFFFF;");
            return;
        }
        String cor = Kanban.empresaAtual().getProjetos()[Kanban.projetoAberto].getAtividadePorNome(atividadeAcao.getSelectionModel().getSelectedItem().toString()).getCor();
        atividadeAcao.setStyle("-fx-background-radius:10px;-fx-font-size:25px;-fx-color:"+cor+";");
    }
    
    @FXML
    private void criarAcao(ActionEvent event) {
        String nome = nomeAcao.getText();
        String prazo = prazoAcao.getText();
        LocalDate data = inicioAcao.getValue();
        System.out.println(atividadeAcao.getSelectionModel().getSelectedItem());
        if (!Metodos.verificarEspacos(nome)) {
            errorNovaAcao.setText("Política de uso de espaços inadequada.");
            return;
        }
        if (nome.equals("") || prazo.equals("")|| data == null || atividadeAcao.getSelectionModel().getSelectedItem() == null || usuarioAcao.getSelectionModel().getSelectedItem() == null || areaAcao.getSelectionModel().getSelectedItem() == null) {
            errorNovaAcao.setText("Há campos em branco");
            return;
        }
        for (Acao ac:Kanban.empresaAtual().getProjetos()[Kanban.projetoAberto].getAtividadePorNome(atividadeAcao.getSelectionModel().getSelectedItem().toString()).getAcoes()) {
            if (nome.equals(ac.getNome())) {
                errorNovaAcao.setText("Já há um ação com esse nome");
                return;
            }
        }
        if (!Metodos.isInteger(prazo)) {
            errorNovaAcao.setText("Prazo não é numérico");
            return;
        }
        int numPrazo = Integer.parseInt(prazo);
        if(numPrazo <= 0){
            // verificar tbm se o prazo é de fato um número (|| isNumeric, isNaN, sla)
           errorNovaAcao.setText("Prazo inválido");
           return;
        }
        long epochData = data.atStartOfDay(ZoneId.systemDefault()).toEpochSecond();
        // salvar informações
        String atividade = atividadeAcao.getSelectionModel().getSelectedItem().toString();
        String usuario = usuarioAcao.getSelectionModel().getSelectedItem().toString();
        String area = areaAcao.getSelectionModel().getSelectedItem().toString();
        Kanban.empresaAtual().getProjetos()[Kanban.projetoAberto].getAtividadePorNome(atividade).criarAcao(nome, usuario, area, epochData, epochData+(numPrazo*24*60*60));
        errorNovaAcao.setText("");
        nomeAcao.clear();
        inicioAcao.getEditor().clear();
        prazoAcao.clear();
        atividadeAcao.getSelectionModel().clearSelection();
        atividadeAcao.setStyle("-fx-background-radius:10px;-fx-font-size:25px;-fx-color:#FFFFFF;");
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
    
    public void definirPostIts(Scene cena) {
        String[] secoes = {"aFazer", "fazendo","finalizado"};
        String[] numerais = {"Um","Dois","Tres","Quatro"};
        this.postIts = new PostIt[secoes.length][numerais.length];
        int i = 0;
        int j = 0;
        for (String secao: secoes) {
            j = 0;
            for (String numero:numerais) {
                postIts[i][j++] = new PostIt(cena, i, j-1);
            }
            i++;
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

    public void loadAtividades() {
        Scene cena = Kanban.sceneKanbanPage;
        aFazer = new ArrayList<>();
        fazendo = new ArrayList<>();
        finalizado = new ArrayList<>();
        for (Atividade at:Kanban.empresaAtual().getProjetos()[Kanban.projetoAberto].getAtividades()) {
            for (Acao ac:at.getAcoes()) {
                float porcentagem = ac.getPorcentagem();
                if (porcentagem <= 0) {
                    aFazer.add(ac);
                }
                if (porcentagem > 0 && porcentagem < 1) {
                    fazendo.add(ac);
                }
                if (porcentagem >= 1) {
                    finalizado.add(ac);
                }
            }
        }
        if (aFazer.size() > 4) {
            aFazerProximo.setOpacity(1);
        } else {
            aFazerProximo.setOpacity(0);
        }
        if (fazendo.size() > 4) {
            fazendoProximo.setOpacity(1);
        } else {
            fazendoProximo.setOpacity(0);
        }
        if (finalizado.size() > 4) {
            finalizadoProximo.setOpacity(1);
        } else {
            finalizadoProximo.setOpacity(0);
        }
        for (PostIt[] i:postIts) {
            for (PostIt postIt:i) {
                postIt.sePreencher();
            }
        }
        
    }
    public void esconderElementos() {
        int opacidade = Kanban.loginAdmin ? 1:0;
        novaAcao.setOpacity(opacidade);
        tituloNovaAcao.setOpacity(opacidade);
        novaAtividade.setOpacity(opacidade);
        tituloNovaAtividade.setOpacity(opacidade);
        deletarAcao.setOpacity(0);
    }

    public void showPopup() {
        popupNewAction.setOpacity(1);
    }

    public void hidePopup() {
        popupNewAction.setOpacity(0);
    }

}
