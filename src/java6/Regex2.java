package java6;

import java.util.regex.*;

public class Regex2 {

	public static void main(String[] args) {
		Pattern p = Pattern.compile("\\w*");
		Matcher m = p.matcher("abaaaba");
		boolean b = false;
		while(m.find()) {
			System.out.println(m.start() + " " + m.group());
		}
		
		Short s1 = (short)((new Short((short)343)) / (new Short((short)49)));
		if(s1 == 7) {
			System.out.println("Hi");
		}
	
		Integer x = 343;
		int x1 = 343;
		long L343 = 343L;
		if(x.equals(L343)) System.out.println("x.equals(L343)");
		if(x1 == L343) System.out.println("x1  == L343)");
		short s2 = 343/49;
		if(s1 == 7) {
			System.out.println("Hi");
		}


	}
}
