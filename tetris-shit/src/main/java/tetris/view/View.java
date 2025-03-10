package tetris.view;

import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class View extends Pane {
    private Stage stage;
    private GameView gameView;

    public View(Stage stage) {
        this.stage = stage;

        initialize();

        gameView = new GameView(this);
        this.getChildren().add(gameView);
    }

    private void initialize() {
        this.setBackground(new Background(new BackgroundFill(Color.WHITE, null, null)));

        this.prefWidthProperty().bind(stage.widthProperty());
        this.prefHeightProperty().bind(stage.heightProperty());
    }
}
