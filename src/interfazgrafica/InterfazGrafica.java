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
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.shape.StrokeLineCap;
public class InterfazGrafica extends Application {

    @Override
    //el nombre d elo que esta en parentresis define la escena(variable stage)
    public void start(Stage stage) throws Exception {
        //comtiene informacion
        Pane panel = new Pane();
        Canvas canvas = new Canvas (300,300);
        panel.getChildren().add(canvas);
        Scene scene = new Scene(panel,300,300,Color.ANTIQUEWHITE);
            //obtener lapiz para dibujar sobre el tablero (canvas)
            GraphicsContext gc = canvas.getGraphicsContext2D();
            
            //titulo
            stage.setTitle("Ejemplo Canvas");
            //establecerlo y mostrarlo
            stage.setScene(scene);
            stage.show();
            
            // dibujar rectangulo posicion x,y,ancho, largo
                //primero color luego construccion
            gc.setFill(Color.RED);
            gc.fillRect(10, 10, 20, 20);
            
//            //dibujar ovalo
//            gc.setFill(Color.AZURE);
//            gc.fillOval(20, 20, 15, 15);
//            //dibujar linea(xinicial,yinicial,xfinal,yfinal)
//            gc.strokeLine(0, 25,45 , 0);
//            //dinujar poligono 
//                double xpoints [] = {10,30,20,10};
//                double ypoints [] = {30,30,15,30};
//                //conjuntox, conjuntoy, cuantos puntois voy a dibujar
//                gc.strokePolygon(xpoints, ypoints, xpoints.length);
//                gc.strokeRect(30,30, 15, 15);
//            
    }
    public static void main(String[] args) {
        Application.launch(args);
    }

    /**
     * @param args the command line arguments
     */
  
}
