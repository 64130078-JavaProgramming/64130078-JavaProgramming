package th.trandoananh.th_bai2_basicgui_bmi;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class BMICalculatorApplication extends Application {
  @Override
  public void start(Stage stage) throws IOException {
    FXMLLoader fxmlLoader = new FXMLLoader(BMICalculatorApplication.class.getResource("bmi_calculator.fxml"));
    Scene scene = new Scene(fxmlLoader.load(), 400, 600);
    stage.setTitle("BMI Calculator");
    stage.setScene(scene);
    stage.show();
  }

  public static void main(String[] args) {
    launch(args);
  }
}