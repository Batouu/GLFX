package application;




import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
 
public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Hello World!");
        Button btn = new Button();
        Label lb = new Label();
        btn.setText("Say 'Hello World'");
        lb.setText("lorem ipsum lorem ipsum lorem ipsum");
        btn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Hello World!");
            }
        });
        
        GridPane root = new GridPane();
        
        primaryStage.setScene(new Scene(root, 300, 250));
        primaryStage.show();
        GridPane.setRowIndex(btn, 1);
        GridPane.setColumnIndex(btn, 2);
        
        GridPane.setRowIndex(lb, 3);
        GridPane.setColumnIndex(lb, 3);
        root.getChildren().add(btn);
        //root.getChildren().add(lb);
        
        responsive.ResponsiveHandler.addResponsiveToWindow(primaryStage);
        responsive.DeviceType.SMALL.getStylesheet();
        btn.getStyleClass().addAll("visible-ml","visible-l");
        
        System.out.println(root.getWidth());
    }
}
