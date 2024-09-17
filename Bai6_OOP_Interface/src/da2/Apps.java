package da2;

public class Apps {

	public static void main(String[] args) {
		Cat c = new Cat("Tam the",false);
		Dog d = new Dog("Bull",true);
		System.out.println(c.toString());
		System.out.println(d.toString());
		
		IAnimal c1 = new Cat("Tam the I",false);
		IAnimal d1 = new Dog("Bull I",true);
		System.out.println(c1.toString());
		System.out.println(d1.toString());
	}

}
