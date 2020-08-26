import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CustomMenuItem;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Box;
import javafx.stage.Stage;

public class MineSweeper extends Application {
    public static void main(String[] args) {
        launch( args );
    }

    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("Mine Sweep");

        Box box = new Box();
        GridPane gridPane = new GridPane();
        gridPane.setGridLinesVisible(true);


        BorderPane borderPane = new BorderPane( );

        Button start = new Button("START" );
        Button show = new Button("SHOW");

        Label score = new Label("00" );
        score.minWidth( 200 );

        GridPane gridPane1 = new GridPane();
        gridPane.setAlignment( Pos.TOP_CENTER );
        gridPane1.setAlignment( Pos.CENTER );
        gridPane1.add( start, 0, 0 );
        gridPane1.add( score, 1, 0 );
        gridPane1.add( show, 2, 0 );

        Insets insets = new Insets(0 );
        BorderPane.setMargin( gridPane, insets );
        BorderPane.setMargin( gridPane1, insets );
        score.setAlignment( Pos.TOP_CENTER );
        for ( int i = 0; i < 10; i++ ) {
            for ( int j = 0; j < 10; j++ ) {
                Button button = new Button("?");
                gridPane.add(button, i, j);
            }
        }

        borderPane.setCenter( gridPane );
        borderPane.setTop( gridPane1 );
        gridPane.setPrefWidth( borderPane.getPrefWidth() );
        gridPane1.setPrefWidth( borderPane.getPrefWidth() );
        gridPane1.paddingProperty().setValue( insets );
        Scene scene = new Scene( borderPane, 300, 400);

        stage.setScene(scene);
        stage.show();
    }

}
