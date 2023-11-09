/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML.java to edit this template
 */
package kanban;

import controllers.SelectProjectController;
import java.io.File;
import java.net.URL;
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
    
//    private SelectProjectController SelectProjectController;
//    private SelectProjectController CreateProjectController;
    
    @Override
    public void start(Stage stage) throws Exception {
        telaSelecionada = stage;
        
        Parent fxmlSelectProject = FXMLLoader.load(getClass().getResource("../views/selectProject.fxml"));
        sceneSelectProject = new Scene(fxmlSelectProject,  1535, 800);
        
        Parent fxmlcreateProject = FXMLLoader.load(getClass().getResource("../views/createProject.fxml"));
        sceneCreateProject = new Scene(fxmlcreateProject,  1535, 800);        
        
//        SelectProjectController = selectProject.getController();;
//        CreateProjectController = selectProject.getController();
        
        stage.setScene(sceneSelectProject);
        stage.show();
    }
    
    public static void telas(String tela){
        System.out.println(tela);
        switch(tela){
            case "selectProject" -> telaSelecionada.setScene(sceneSelectProject);
            case "createProject" -> telaSelecionada.setScene(sceneCreateProject);
        }            
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
