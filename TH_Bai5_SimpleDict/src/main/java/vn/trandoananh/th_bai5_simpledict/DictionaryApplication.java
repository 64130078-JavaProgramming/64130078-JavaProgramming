package vn.trandoananh.th_bai5_simpledict;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class DictionaryApplication extends Application {
  @Override
  public void start(Stage stage) throws IOException {
    FXMLLoader fxmlLoader = new FXMLLoader(DictionaryApplication.class.getResource("dictionary.fxml"));
    Scene scene = new Scene(fxmlLoader.load(), 400, 500);
    stage.setTitle("Từ điển đơn giản");
    stage.setScene(scene);
    stage.show();
  }

  public static void main(String[] args) {
    launch(args);
  }
}