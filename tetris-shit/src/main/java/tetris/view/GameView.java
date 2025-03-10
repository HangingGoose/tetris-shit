package tetris.view;

import javafx.geometry.Pos;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;

public class GameView extends GridPane {

    View root;

    public GameView(View root) {
        this.root = root;

        initialize();
    }

    private void initialize() {
        this.setBackground(new Background(new BackgroundFill(Color.BLACK, null, null)));

        this.prefWidthProperty().bind(root.widthProperty().divide(3));
        this.prefHeightProperty().bind(this.prefWidthProperty().multiply(2));

        this.layoutXProperty().bind(root.widthProperty().divide(3));

        this.setAlignment(Pos.CENTER);

    }
}
