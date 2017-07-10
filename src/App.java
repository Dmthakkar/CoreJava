import java.util.*;
public class App {
	public static void main(String[] args) {
		HashMap<Integer,String> p = new HashMap<Integer,String>();
		p.put(7,"A");
		p.put(1,"B");
		p.put(5,"C");
		p.put(1,"D");
		p.remove(1);
		System.out.println(p);

		String[] sa = {"tom ", "jerry "};
		for (int x = 0; x < 3; x++) {
			for (String s : sa) {
				System.out.print(x + " " + s);
				if (x == 1) {
					break;
				}
			}
		}

	}
}
