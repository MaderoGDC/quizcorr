/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfazgrafica;

/**
 *
 * @author Estudiante
 */
import javafx.stage.Stage;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.canvas.Canvas;
public class InterfazGrafica extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        Pane panel = new Pane();
        Canvas canvas = new Canvas (300,300);
        panel.getChildren().add(canvas);
        Scene scene = new Scene(panel,300,300);
            stage.setTitle("Ejemplo Canvas");
            stage.setScene(scene);
            stage.show();
    }
    public static void main(String[] args) {
        Application.launch(args);
    }

    /**
     * @param args the command line arguments
     */
  
}
