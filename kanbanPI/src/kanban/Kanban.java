package kanban;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import entities.Empresa;
import controllers.SelectProjectController;
public class Kanban extends Application {
    private static Stage telaSelecionada;
    private static Scene sceneSelectProject;
    private static SelectProjectController controllerSelectProject;
    private static Scene sceneCreateProject;
    private static Scene sceneKanbanPage;
    private static Scene sceneNewNameProject;
    private static Scene sceneNewActivit;
    private static Scene sceneLoginPage;
    private static Scene sceneNewDepartment;
    private static Scene sceneNewUser;
    public static Empresa[] empresas;
    //public static Usuario[] usuarios;
    public static boolean loginAdmin;

    @Override
    public void start(Stage stage) throws Exception {
        telaSelecionada = stage;
        empresas = new Empresa[16];
        loginAdmin = false;
        
        Parent fxmlLoginPage = FXMLLoader.load(getClass().getResource("../views/loginPage.fxml"));
        sceneLoginPage = new Scene(fxmlLoginPage,  1535, 800);
        
        FXMLLoader fxmlSelectProject = new FXMLLoader(getClass().getResource("../views/selectProject.fxml"));
        sceneSelectProject = new Scene(fxmlSelectProject.load(),  1535, 800);
        controllerSelectProject = fxmlSelectProject.getController();
        
        Parent fxmlcreateProject = FXMLLoader.load(getClass().getResource("../views/createProject.fxml"));
        sceneCreateProject = new Scene(fxmlcreateProject,  1535, 800);    
        
        Parent fxmlKanbanPage = FXMLLoader.load(getClass().getResource("../views/kanbanPage.fxml"));
        sceneKanbanPage = new Scene(fxmlKanbanPage,  1535, 800);
        
        Parent fxmlNewNameProject = FXMLLoader.load(getClass().getResource("../views/newNameProject.fxml"));
        sceneNewNameProject = new Scene(fxmlNewNameProject,  1535, 800);
        
        Parent fxmlNewActivit = FXMLLoader.load(getClass().getResource("../views/newActivit.fxml"));
        sceneNewActivit = new Scene(fxmlNewActivit,  1535, 800);
        
        Parent fxmlNewDepartment = FXMLLoader.load(getClass().getResource("../views/newDepartment.fxml"));
        sceneNewDepartment = new Scene(fxmlNewDepartment,  1535, 800);
        
        Parent fxmlNewUser = FXMLLoader.load(getClass().getResource("../views/newUser.fxml"));
        sceneNewUser = new Scene(fxmlNewUser,  1535, 800);
        
        stage.setScene(sceneLoginPage);
        stage.show();
        
        
    }
    
    
    
    public static void telas(String tela){
        switch(tela){
            case "selectProject" -> {
                telaSelecionada.setScene(sceneSelectProject);
                controllerSelectProject.esconderElementos();
            }
            case "createProject" -> telaSelecionada.setScene(sceneCreateProject);
            case "kanbanPage" -> telaSelecionada.setScene(sceneKanbanPage);
            case "newName" -> telaSelecionada.setScene(sceneNewNameProject);
            case "newActivit" -> telaSelecionada.setScene(sceneNewActivit);
            case "loginPage" -> telaSelecionada.setScene(sceneLoginPage);
            case "newDepartment" -> telaSelecionada.setScene(sceneNewDepartment);
            case "newUser" -> telaSelecionada.setScene(sceneNewUser);
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
