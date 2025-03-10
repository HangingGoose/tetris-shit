package tetris;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import tetris.presenter.Presenter;
import tetris.view.View;

public class Main extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        View view = new View(stage);
        Presenter presenter = new Presenter(view);

        Scene scene = new Scene(view);

        stage.setTitle("Kkr Tetris");
        stage.setMaximized(true);
        stage.setResizable(false);
        stage.initStyle(StageStyle.DECORATED);
        stage.setMinWidth(750);
        stage.setMinHeight(500);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}