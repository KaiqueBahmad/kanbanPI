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
    
    private SelectProjectController SelectProjectController;
    private SelectProjectController CreateProjectController;
    
    @Override
    public void start(Stage stage) throws Exception {
        telaSelecionada = stage;
        
        URL telaSelectProject = new File("./src/views/selectProject.fxml").toURI().toURL();
        URL telaCreateProject = new File("./src/views/createProject.fxml").toURI().toURL();
        
        FXMLLoader selectProject = new FXMLLoader(telaSelectProject);
        FXMLLoader createProject = new FXMLLoader(telaCreateProject);
        
        Parent AAselectProject = selectProject.load();
        Parent AAcreateProject = createProject.load();
        
        sceneSelectProject = new Scene(AAselectProject,  1535, 800);
        SelectProjectController = selectProject.getController();
        sceneCreateProject = new Scene(AAcreateProject,  1535, 800);
        CreateProjectController = selectProject.getController();
        
        stage.setScene(sceneSelectProject);
        stage.show();
    }
    
    public static void telas(String tela){
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
