package com.example.appbmi_javafx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class BMIController {
  @FXML
  TextField txtChieuCao, txtCanNang;
  @FXML
  Label lblKQ;
  public void kiemTra(ActionEvent event){
    float chieuCao = Float.parseFloat(txtChieuCao.getText());
    float canNang = Float.parseFloat(txtCanNang.getText());
    try{
      float BMI = canNang / (chieuCao * chieuCao);
      if(BMI < 18.5f){
        lblKQ.setText("Thiếu cân");
      } else if(BMI >= 18.5f && BMI < 24.9f){
        lblKQ.setText("Bình thường");
      } else if(BMI >= 24.9f && BMI <= 29.9f){
        lblKQ.setText("Thừa cân");
      } else {
        lblKQ.setText("Béo phì");
      }
    }catch(NumberFormatException exception){
      lblKQ.setText("Nhập sai định dạng");
    }
  }
}
