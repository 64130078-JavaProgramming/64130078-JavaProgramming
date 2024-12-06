package th.trandoananh.th_bai2_basicgui_bmi;

import javafx.fxml.FXML;
import javafx.scene.control.*;

public class BMICalculatorController {
  @FXML
  private TextField txtHeight, txtWeight;

  @FXML
  private RadioButton rbAsian, rbNonAsian;

  @FXML
  private Button btnCalculate;

  @FXML
  private Label lblResult;

  @FXML
  private ToggleGroup group;

  @FXML
  public void initialize() {
    // Thiết lập nhóm RadioButton
    group = new ToggleGroup();
    rbAsian.setToggleGroup(group);
    rbNonAsian.setToggleGroup(group);
  }

  @FXML
  public void calculateBMI() {
    try {
      double height = Double.parseDouble(txtHeight.getText());
      double weight = Double.parseDouble(txtWeight.getText());

      if (height <= 0 || weight <= 0) {
        lblResult.setText("Chiều cao và cân nặng phải lớn hơn 0!");
        return;
      }

      // Tính chỉ số BMI
      double bmi = weight / (height * height);
      String classification;

      // Xác định phân loại theo lựa chọn
      if (rbAsian.isSelected()) {
        if (bmi < 17.50) {
          classification = "Underweight";
        } else if (bmi < 23.00) {
          classification = "Normal weight";
        } else if (bmi < 28.00) {
          classification = "Overweight";
        } else {
          classification = "Obese";
        }
      } else if (rbNonAsian.isSelected()) {
        if (bmi < 18.50) {
          classification = "Underweight";
        } else if (bmi < 25.00) {
          classification = "Normal weight";
        } else if (bmi < 30.00) {
          classification = "Overweight";
        } else {
          classification = "Obese";
        }
      } else {
        lblResult.setText("Hãy chọn nhóm đối tượng!");
        return;
      }

      // Hiển thị kết quả
      lblResult.setText(String.format("BMI: %.2f - %s", bmi, classification));
    } catch (NumberFormatException e) {
      lblResult.setText("Vui lòng nhập số hợp lệ!");
    }
  }
}