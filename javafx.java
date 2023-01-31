import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.control.Button;
import javafx.scene.layout.Flowpane;
import javafx.stage.Stage;
public class main extends Application{
    /**
     * @param stage
     */
    public void start(Stage stage){
        stage.setTitle("HTML");
        stage.setHeight(500);
        Scene scene = new Scene(new Group());
        Flowpane flow  = new Flowpane();
        flow.setVgap(8);
        flow.setHgap(4);
        flow.setPrefWrapLenght(300);
        for(int i =0; i<10;i++){
            flow.getChildren().add(new Button("asdf"));
        }
        scene.setRoot(flow);
        stage.setScene(scene);
        stage.show();
 
 public static void main(String[] args) {
    launch(args);
 }

}