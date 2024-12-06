module th.trandoananh.th_bai2_basicgui_bmi {
  requires javafx.controls;
  requires javafx.fxml;


  opens th.trandoananh.th_bai2_basicgui_bmi to javafx.fxml;
  exports th.trandoananh.th_bai2_basicgui_bmi;
}