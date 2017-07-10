package java8;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.time.Month;
import java.time.Period;
import java.time.YearMonth;
import java.util.Optional;
import java.util.stream.Stream;

public class Examjava8 {

	int x = 6;
	public static void main(String[] args) {
		
		int x = 5;
		//x = !x;
		x = x >> 1;
		
		//System.out.println("Testing");
		
		String a = null;
		Optional<String> b = Optional.empty();
		try{
			System.out.println(a.length());
			System.out.println(b.orElse("").length());
			
		}catch(Exception ex){
			System.out.println(a);
		}finally{
			a = "String";
			System.out.println(a.length());
			b = Optional.ofNullable("");
			System.out.println(b.get().length());
		}
		
		YearMonth ym1 = YearMonth.now();
		YearMonth ym2 = YearMonth.of(2016, Month.FEBRUARY);
		
		System.out.println(ym1.minus(Period.ofMonths(4)).getMonthValue());
		
		String str = "abc";
		String str1 = new String("abc");
		System.out.println(str1.matches(str));
		
		

	}
	
	

		
}

class Indices{
	public Indices(String s){
		
	}
	
}