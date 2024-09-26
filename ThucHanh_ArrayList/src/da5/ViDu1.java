package da5;

import java.util.ArrayList;
import java.util.List;

public class ViDu1 {

	@SuppressWarnings("removal")
	public static void main(String[] args) {
		List<String> listObj = new ArrayList<String>();
		System.out.println("The size is: " + listObj.size());
		for(int ctr = 1; ctr <= 10; ctr++) {
			listObj.add("Value is: " + new Integer(ctr));
		}
	}
}
