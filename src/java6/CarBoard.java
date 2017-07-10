package java6;

public class CarBoard {
	Short story = 200;
	CarBoard go(CarBoard cb) {
		cb = null;
		return cb;
	}
	public static void main(String[] args) {
		CarBoard c1 = new CarBoard();
		CarBoard c2 = new CarBoard();
		CarBoard c3 = c1.go(c2);
		c1 = null;
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		// do Stuff
	}

}
