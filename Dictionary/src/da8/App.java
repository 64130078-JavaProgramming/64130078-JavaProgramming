package da8;

import java.util.HashMap;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		System.out.println("Nhập 1 từ tiếng Anh: ");
		Scanner sc = new Scanner(System.in);
		HashMap<String, String> dictionary = new HashMap<>();
		dictionary.put("Hello", "Chào");
		dictionary.put("Year", "Năm");
		dictionary.put("Car", "Xe hơi");
		dictionary.put("Plane", "Máy bay");
		dictionary.put("Month", "Tháng");
		dictionary.put("Day", "Ngày");
		dictionary.put("Sun", "Mặt trời");
		dictionary.put("Moon", "Mặt trăng");
		dictionary.put("Mars", "Hỏa Tinh");
		dictionary.put("Saturn", "Thổ Tinh");
		sc.close();
	}

}
