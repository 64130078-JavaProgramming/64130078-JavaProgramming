package da10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class App3Net {
	public static void main(String[] args) throws IOException {
		@SuppressWarnings("deprecation")
		URL url = new URL("https://ntu.edu.vn/default.aspx");
		URLConnection connection = url.openConnection();
		InputStream in = connection.getInputStream();
		InputStreamReader ir = new InputStreamReader(in);
		BufferedReader bufRead = new BufferedReader(ir);
		String line;
		while (true) {
			line = bufRead.readLine();
			if (line == null)
				break;
			System.out.println(line);
		}
	}
}
