package da;

import java.util.Scanner;

public class OddEvenApp {
	public static void main(String[] args) {
		int a;
		@SuppressWarnings("resource")
		Scanner bp = new Scanner(System.in);
		System.out.println("Enter an integer: ");
		a = bp.nextInt();
		if(a%2==0) {
			System.out.printf("%d is even",a);
		}else {
			System.out.printf("%d is odd",a);
		}
	}
}
