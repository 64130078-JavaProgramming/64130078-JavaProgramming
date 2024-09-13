package da;

import java.util.Scanner;

public class BMIapp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float h,m,BMI;
		@SuppressWarnings("resource")
		Scanner bp=new Scanner(System.in);
		System.out.print("Chieu cao (m) = ");
		h = bp.nextFloat();
		System.out.print("Can nang (kg) = ");
		m = bp.nextFloat();
		BMI = m/(h*h);
		if(BMI<18.5) {
			System.out.print("Underweight (Thieu can)");
		}else if(BMI>=18.5 && BMI<=24.9) {
			System.out.print("Normal (Binh thuong)");
		}else if(BMI>=25 && BMI<=29.9) {
			System.out.print("Overweight (Thua can)");
		}else {
			System.out.print("Obese (Beo phi)");
		}
	}

}
