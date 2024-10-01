package da10;

import java.io.FileWriter;
import java.io.IOException;

public class App {
	public static void main(String[] args) throws IOException {
		// Tao file van ban, ghi vao
		FileWriter fw;
		fw = new FileWriter("songque.txt");
		fw.write("Sông quê nước chảy đôi bờ...");
		fw.write("Để anh 9 dại 10 khờ thương em");

		fw.flush();
		fw.close();
	}
}
