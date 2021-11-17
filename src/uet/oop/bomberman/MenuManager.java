package uet.oop.bomberman;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import uet.oop.bomberman.menubutton.Bomberbutton;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

public class MenuManager {
   private Stage primaryStage;
   private AnchorPane menuPane;
   private Scene menuScene;

    public void start() throws IOException {
        menuPane = new AnchorPane();
        menuScene = new Scene(menuPane, 860, 546);

        InputStream is = Files.newInputStream(Paths.get("res/backgr/backgr.png"));
        Image image = new Image(is);
        is.close();

        ImageView imageView = new ImageView(image);
        imageView.setFitHeight(546);
        imageView.setFitWidth(860);

        menuPane.getChildren().addAll(imageView);
        primaryStage = new Stage();

        primaryStage.setScene(menuScene);
    }

    public Stage getMenuStage() {
        return primaryStage;
    }
}
