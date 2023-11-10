/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML.java to edit this template
 */
package kanban;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author aluno
 */
public class Kanban extends Application {
    private static Stage telaSelecionada;
    private static Scene sceneSelectProject;
    private static Scene sceneCreateProject;
    private static Scene sceneKanbanPage;
    private static Scene sceneNewNameProject;
    private static Scene sceneNewActivit;
    private static Scene sceneLoginPage;
    
    @Override
    public void start(Stage stage) throws Exception {
        telaSelecionada = stage;
        
        Parent fxmlLoginPage = FXMLLoader.load(getClass().getResource("../views/loginPage.fxml"));
        sceneLoginPage = new Scene(fxmlLoginPage,  1535, 800);
        
        Parent fxmlSelectProject = FXMLLoader.load(getClass().getResource("../views/selectProject.fxml"));
        sceneSelectProject = new Scene(fxmlSelectProject,  1535, 800);
        
        Parent fxmlcreateProject = FXMLLoader.load(getClass().getResource("../views/createProject.fxml"));
        sceneCreateProject = new Scene(fxmlcreateProject,  1535, 800);    
        
        Parent fxmlKanbanPage = FXMLLoader.load(getClass().getResource("../views/kanbanPage.fxml"));
        sceneKanbanPage = new Scene(fxmlKanbanPage,  1535, 800);
        
        Parent fxmlNewNameProject = FXMLLoader.load(getClass().getResource("../views/newNameProject.fxml"));
        sceneNewNameProject = new Scene(fxmlNewNameProject,  1535, 800);
        
        Parent fxmlNewActivit = FXMLLoader.load(getClass().getResource("../views/newActivit.fxml"));
        sceneNewActivit = new Scene(fxmlNewActivit,  1535, 800);
        
        stage.setScene(sceneLoginPage);
        stage.show();
    }
    
    public static void telas(String tela){
        switch(tela){
            case "selectProject" -> telaSelecionada.setScene(sceneSelectProject);
            case "createProject" -> telaSelecionada.setScene(sceneCreateProject);
            case "kanbanPage" -> telaSelecionada.setScene(sceneKanbanPage);
            case "newName" -> telaSelecionada.setScene(sceneNewNameProject);
            case "newActivit" -> telaSelecionada.setScene(sceneNewActivit);
            case "loginPage" -> telaSelecionada.setScene(sceneLoginPage);
        }            
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
