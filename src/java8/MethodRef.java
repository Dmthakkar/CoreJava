package java8;

import java.util.ArrayList;
import java.util.List;

public class MethodRef {
	public static void main(String argsp[]){
		List names = new ArrayList();

		names.add("Mahesh");
		names.add("Suresh");
		names.add("Ramesh");
		names.add("Naresh");
		names.add("Kalpesh");

		names.forEach(System.out::println);
	}
}