package th.trandoananh.th_bai1_basicgui_simplemath.th_bai1_basicgui_simplemath;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class CalculatorApplication extends Application {
  @Override
  public void start(Stage stage) throws IOException {
    FXMLLoader fxmlLoader = new FXMLLoader(CalculatorApplication.class.getResource("calculator.fxml"));
    Scene scene = new Scene(fxmlLoader.load(), 400, 600);
    stage.setTitle("Calculator App");
    stage.setScene(scene);
    stage.show();
  }

  public static void main(String[] args) {
    launch(args);
  }
}