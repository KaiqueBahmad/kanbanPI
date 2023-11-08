/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML.java to edit this template
 */
package kanban;

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
    
    @Override
    public void start(Stage stage) throws Exception {
        URL telaSelectProject = new File("./src/views/selectProject.fxml").toURI().toURL();
        URL telaCreateProject = new File("./src/views/createProject.fxml").toURI().toURL();
        Parent selectProject = FXMLLoader.load(telaSelectProject);
        Parent createProject = FXMLLoader.load(telaCreateProject);
        
        Scene tela1 = new Scene(createProject, 500, 500);
        
        stage.setScene(tela1);
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
