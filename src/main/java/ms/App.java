package ms;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;

import java.io.IOException;

public class App extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        Parent root = FXMLLoader.load(App.class.getResource("view.fxml"));
        stage.setTitle("Client!");
        stage.setScene(new Scene(root, 480, 400));
        stage.show();


    }


    public static void main(String[] args) {
        launch();
    }
}