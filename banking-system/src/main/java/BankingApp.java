import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class BankingApp extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Banking System - GUI Test");
        
        Label label = new Label("Banking System GUI is Working!\nJavaFX is running in Codespace.\n\nNext: Add login and dashboard views.");
        label.setStyle("-fx-font-size: 16px; -fx-padding: 20px; -fx-text-alignment: center;");
        
        StackPane root = new StackPane();
        root.getChildren().add(label);
        
        Scene scene = new Scene(root, 600, 400);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    public static void main(String[] args) {
        System.out.println("Launching Banking System GUI...");
        launch(args);
    }
}
