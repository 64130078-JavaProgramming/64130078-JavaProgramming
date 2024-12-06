package th.trandoananh.th_bai1_basicgui_simplemath.th_bai1_basicgui_simplemath;

import javafx.fxml.FXML;
import javafx.scene.control.*;

public class CalculatorController {
  @FXML
  private TextField txtA;

  @FXML
  private TextField txtB;

  @FXML
  private RadioButton rbAdd, rbSubtract, rbMultiply, rbDivide;

  @FXML
  private Button btnCalculate;

  @FXML
  private Label lblResult;

  @FXML
  private ToggleGroup operationGroup;

  @FXML
  public void initialize() {
    // Đảm bảo chỉ chọn một phép toán
    operationGroup = new ToggleGroup();
    rbAdd.setToggleGroup(operationGroup);
    rbSubtract.setToggleGroup(operationGroup);
    rbMultiply.setToggleGroup(operationGroup);
    rbDivide.setToggleGroup(operationGroup);
  }

  @FXML
  public void calculate() {
    try {
      double a = Double.parseDouble(txtA.getText());
      double b = Double.parseDouble(txtB.getText());
      String result;

      if (rbAdd.isSelected()) {
        result = String.valueOf(a + b);
      } else if (rbSubtract.isSelected()) {
        result = String.valueOf(a - b);
      } else if (rbMultiply.isSelected()) {
        result = String.valueOf(a * b);
      } else if (rbDivide.isSelected()) {
        if (b == 0) {
          result = "Không thể chia cho 0!";
        } else {
          result = String.valueOf(a / b);
        }
      } else {
        result = "Chọn một phép toán!";
      }

      lblResult.setText(result);
    } catch (NumberFormatException e) {
      lblResult.setText("Vui lòng nhập số hợp lệ!");
    }
  }
}