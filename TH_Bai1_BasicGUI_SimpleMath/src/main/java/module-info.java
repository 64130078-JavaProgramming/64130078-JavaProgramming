module th.trandoananh.th_bai1_basicgui_simplemath.th_bai1_basicgui_simplemath {
  requires javafx.controls;
  requires javafx.fxml;

  requires org.controlsfx.controls;
  requires com.dlsc.formsfx;
  requires org.kordamp.bootstrapfx.core;

  opens th.trandoananh.th_bai1_basicgui_simplemath.th_bai1_basicgui_simplemath to javafx.fxml;
  exports th.trandoananh.th_bai1_basicgui_simplemath.th_bai1_basicgui_simplemath;
}