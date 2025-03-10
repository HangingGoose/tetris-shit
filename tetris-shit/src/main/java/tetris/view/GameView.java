package tetris.view;

import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.geometry.VPos;
import javafx.scene.control.Button;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class GameView extends GridPane {

    private View root;

    private final int NUM_ROWS = 20;
    private final int NUM_COLS = 10;

    public GameView(View root) {
        this.root = root;

        initializePane();
    }

    private void initializePane() {
        this.setBackground(new Background(new BackgroundFill(Color.BLACK, null, null)));

        this.prefWidthProperty().bind(root.widthProperty().divide(2));
        this.prefHeightProperty().bind(this.prefWidthProperty().multiply(2));

        this.layoutXProperty().bind(root.widthProperty().divide(4));

        this.setHgap(0);
        this.setVgap(0);

        this.setPadding(Insets.EMPTY);

        for (int x = 0; x < NUM_COLS; x++) {
            ColumnConstraints cc = new ColumnConstraints();
            cc.setPercentWidth(100.0 / NUM_COLS);
            cc.setHgrow(Priority.ALWAYS);
            this.getColumnConstraints().add(cc);
        }

        for (int y = 0; y < NUM_ROWS; y++) {
            RowConstraints rc = new RowConstraints();
            rc.setPercentHeight(100.0 / NUM_ROWS);
            rc.setVgrow(Priority.ALWAYS);
            this.getRowConstraints().add(rc);
        }

        for (int x = 0; x < NUM_COLS; x++) {
            for (int y = 0; y < NUM_ROWS; y++) {
                this.add(createCell(), x, y);
            }
        }
    }

    private StackPane createCell() {
        StackPane cell = new StackPane();
        cell.setBackground(new Background(new BackgroundFill(Color.BLACK, null, null)));

        cell.setStyle("-fx-border-color: darkgray; -fx-border-width: 0.5;");

        return cell;
    }
}
