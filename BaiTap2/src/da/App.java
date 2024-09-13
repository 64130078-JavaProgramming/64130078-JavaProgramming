package da;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// Khai bao cac bien can thiet
		int a,b,tong;
		// Chuan bi cho nhap du lieu
		Scanner banPhim=new Scanner(System.in);
		// Nhap du lieu
			//-in HD cho User
			System.out.println("------ CT TINH TONG 2 SO NGUYEN ------");
			System.out.print("a = ");
			// Doi nguoi dung nhap, lay du lieu va cat vao bien a
			a = banPhim.nextInt();
			// Doi nguoi dung nhap, lay du lieu va cat vao bien b
			System.out.println("b = ");
			b = banPhim.nextInt();
			
			// Tinh tong
			tong =  a + b;
			
			// Xuat ket qua
			System.out.print("Tong la = " + tong);
	}

}
