package kanban;

import controllers.CreateProjectController;
import controllers.KanbanPageController;
import controllers.NewActionController;
import controllers.NewActivitController;
import controllers.NewAreaController;
import controllers.NewUserController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import entities.Empresa;
import entities.Usuario;
import controllers.SelectProjectController;
import javafx.scene.Cursor;

public class Kanban extends Application {
    private static Stage telaSelecionada;
    private static Scene sceneSelectProject;
    private static SelectProjectController controllerSelectProject;
    private static Scene sceneCreateProject;
    public static CreateProjectController controllerCreateProject;
    private static Scene sceneKanbanPage;
    private static KanbanPageController controllerKanbanPage;
    private static Scene sceneNewNameProject;
    private static Scene sceneNewAction;
    public static NewActionController controllerNewAction;
    private static Scene sceneLoginPage;
    private static Scene sceneNewActivit;
    public static NewActivitController controllerNewActivity;
    private static Scene sceneNewUser;
    public static NewUserController controllerNewUser;
    private static Scene sceneNewArea;
    public static NewAreaController controllerNewArea;
    public static Empresa[] empresas;
    public static String currentUser;
    public static int projetoAberto;
    public static boolean loginAdmin;

    public static Empresa empresaAtual() {
        if (loginAdmin) {
            for (Empresa emp:empresas) {
                if (currentUser.equals(emp.getNome())) {
                    return emp;
                }
            }
        } else {
            for (Empresa emp:empresas) {
                if (emp != null && emp.getUsuarioPorNome(currentUser) != null) {
                    return emp;
                }
            }
        }
        
        return null;
    }

    @Override
    public void start(Stage stage) throws Exception {
        telaSelecionada = stage;
        empresas = new Empresa[32];
        loginAdmin = false;
        
        Parent fxmlLoginPage = FXMLLoader.load(getClass().getResource("../views/loginPage.fxml"));
        sceneLoginPage = new Scene(fxmlLoginPage,  1535, 800);
        
        FXMLLoader fxmlSelectProject = new FXMLLoader(getClass().getResource("../views/selectProject.fxml"));
        sceneSelectProject = new Scene(fxmlSelectProject.load(),  1535, 800);
        controllerSelectProject = fxmlSelectProject.getController();
        
        
        FXMLLoader fxmlcreateProject = new FXMLLoader(getClass().getResource("../views/createProject.fxml"));
        sceneCreateProject = new Scene(fxmlcreateProject.load(),  1535, 800);
        controllerCreateProject = fxmlcreateProject.getController();        
        
        FXMLLoader fxmlKanbanPage = new FXMLLoader(getClass().getResource("../views/kanbanPage.fxml"));
        sceneKanbanPage = new Scene(fxmlKanbanPage.load(),  1535, 800);
        controllerKanbanPage = fxmlKanbanPage.getController();
        
        Parent fxmlNewNameProject = FXMLLoader.load(getClass().getResource("../views/newNameProject.fxml"));
        sceneNewNameProject = new Scene(fxmlNewNameProject,  1535, 800);
        
        FXMLLoader fxmlNewAction = new FXMLLoader(getClass().getResource("../views/newAction.fxml"));
        sceneNewAction = new Scene(fxmlNewAction.load(),  1535, 800);
        controllerNewAction = fxmlNewAction.getController();
        
        
        FXMLLoader fxmlNewActivit = new FXMLLoader(getClass().getResource("../views/newActivit.fxml"));
        sceneNewActivit = new Scene(fxmlNewActivit.load(),  1535, 800);
        controllerNewActivity = fxmlNewActivit.getController();
        
        FXMLLoader fxmlNewUser = new FXMLLoader(getClass().getResource("../views/newUser.fxml"));
        sceneNewUser = new Scene(fxmlNewUser.load(),  1535, 800);
        controllerNewUser = fxmlNewUser.getController();
        
        
        
        FXMLLoader fxmlNewArea = new FXMLLoader(getClass().getResource("../views/newArea.fxml"));
        sceneNewArea = new Scene(fxmlNewArea.load(),  1535, 800);
        controllerNewArea = fxmlNewArea.getController();
        
        stage.setScene(sceneLoginPage);
        stage.show();
    }
    
    public static void telas(String tela){
        switch(tela){
            case "selectProject" -> {
                controllerSelectProject.esconderElementos();
                controllerSelectProject.loadProjetos();
                telaSelecionada.setScene(sceneSelectProject);
                projetoAberto = -1;
            }
            case "createProject" -> {
                controllerCreateProject.esconderElementos();
                controllerCreateProject.loadProjetos();
                telaSelecionada.setScene(sceneCreateProject);
            }
            case "kanbanPage" -> {
                controllerKanbanPage.esconderElementos();
//                controllerKanbanPage.loadAtividades();
                telaSelecionada.setScene(sceneKanbanPage);
            }
            case "newName" -> telaSelecionada.setScene(sceneNewNameProject);
            case "newAction" -> {
                controllerNewAction.loadAreasLista();
                controllerNewAction.loadUsuariosLista();
                controllerNewAction.loadAtividadesLista();
                telaSelecionada.setScene(sceneNewAction);
            }
            case "loginPage" -> telaSelecionada.setScene(sceneLoginPage);
            case "newActivit" -> {
                telaSelecionada.setScene(sceneNewActivit);
            }
            case "newUser" -> {
                controllerNewUser.esconderElementos();
                controllerNewUser.loadProjetos();
                telaSelecionada.setScene(sceneNewUser);
            }
            case "newArea" -> {
                controllerNewArea.esconderElementos();
                controllerNewArea.loadProjetos();
                telaSelecionada.setScene(sceneNewArea);
            }
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
