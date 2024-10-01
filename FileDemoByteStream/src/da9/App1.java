package da9;

import java.io.FileInputStream;
import java.io.IOException;

public class App1 {

	public static void main(String[] args) throws IOException {
		FileInputStream fin = null;
		fin = new FileInputStream("num.clc");
		int byteRead;
		while (true) {
			byteRead = fin.read();
			if (byteRead == -1)
				break;
			System.out.println((char) byteRead);
			System.out.println(" ");
		}
		fin.close();

		System.out.println("Done.");
	}

}
