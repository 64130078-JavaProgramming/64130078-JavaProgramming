package vn.trandoananh.th_bai5_simpledict;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.util.HashMap;

public class DictionaryController {
  @FXML
  private TextField inputField;
  @FXML
  private Button lookupButton;
  @FXML
  private TextField phoneticField;
  @FXML
  private TextArea resultArea;

  // HashMap lưu dữ liệu từ điển (từ, nghĩa, phiên âm)
  private HashMap<String, WordInfo> dictionary;

  public void initialize() {
    // Khởi tạo dữ liệu từ điển
    dictionary = new HashMap<>();
    dictionary.put("hello", new WordInfo("xin chào", "həˈləʊ"));
    dictionary.put("world", new WordInfo("thế giới", "wɜːld"));
    dictionary.put("java", new WordInfo("ngôn ngữ lập trình", "ˈdʒɑːvə"));
    dictionary.put("dictionary", new WordInfo("từ điển", "ˈdɪkʃənəri"));
    dictionary.put("computer", new WordInfo("máy tính", "kəmˈpjuːtə"));
    dictionary.put("programming", new WordInfo("lập trình", "ˈprəʊɡræmɪŋ"));
    dictionary.put("language", new WordInfo("ngôn ngữ", "ˈlæŋɡwɪdʒ"));
    dictionary.put("science", new WordInfo("khoa học", "ˈsaɪəns"));
    dictionary.put("universe", new WordInfo("vũ trụ", "ˈjuːnɪvɜːs"));
    dictionary.put("education", new WordInfo("giáo dục", "ˌedʒʊˈkeɪʃən"));

    // Gắn sự kiện cho nút "Tra cứu"
    lookupButton.setOnAction(_ -> lookupWord());
  }

  private void lookupWord() {
    String word = inputField.getText().trim().toLowerCase();
    if (dictionary.containsKey(word)) {
      WordInfo info = dictionary.get(word);
      phoneticField.setText(info.getPhonetic());
      resultArea.setText(info.getMeaning());
    } else {
      phoneticField.setText("");
      resultArea.setText("Không tìm thấy từ này trong từ điển.");
    }
  }

  // Lớp lưu trữ thông tin từ
  private static class WordInfo {
    private final String meaning;
    private final String phonetic;

    public WordInfo(String meaning, String phonetic) {
      this.meaning = meaning;
      this.phonetic = phonetic;
    }

    public String getMeaning() {
      return meaning;
    }

    public String getPhonetic() {
      return phonetic;
    }
  }
}