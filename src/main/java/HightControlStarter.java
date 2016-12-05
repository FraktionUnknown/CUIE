import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Region;
import javafx.stage.Stage;

/**
 * Created by aggre on 05.12.2016.
 */
public class HightControlStarter extends Application{

        @Override
        public void start(Stage primaryStage) throws Exception {
        Region rootPanel = new HightControlPane();

        Scene scene = new Scene(rootPanel);

        primaryStage.setTitle("Business Control Demo");
        primaryStage.setScene(scene);

        primaryStage.show();
    }

    public static void main(String[] args) {
        Application.launch();
    }
}