package java6;

import java.util.Calendar;
import java.util.Date;
import java.util.Formatter;
import java.util.Locale;
import java.util.Map;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.SortedSet;
import java.util.TreeSet;

public class IkmTest {

/*	public enum Element{
		HELIUM("He","Gas"),MAG("Mg","Solid");
		private Element(String a,String b){
			
		}
	}
*/	
	static class Helper{
		private int data = 5;
		public void bump (int inc){
			inc++;
			data = data + inc;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Helper h = new Helper();
		int data = 2;
		h.bump(data);
		System.out.println(h.data + "  " + data);
		
//		Integer a = new Integer("9876543220");
		
	//	Boolean ab = Boolean.parseBoolean(true);
		Long al = 9876543210L;
		//Byte aby = Byte.parseByte(121);
		//Character ac = new Character("C");
		System.out.println(al);

//		System.out.println(Element.HELIUM.toString(), );
		
		String f = "first";
		String second = new String ("first");
		System.out.println(f.equals(second));
		System.out.println(second == "false");
		
		
		SortedSet<Element> s = new TreeSet<Element>();
		s.add(new Element(15));
		s.add(new Element(10));
		s.add(new Element(25));
		s.add(new Element(10));
		System.out.println(s.first() + " " + s.size());
		int x = 1 - 3;
		x = x%2;
		System.out.println("x is :" + x);
		
		StringBuilder sb = new StringBuilder("buffering");
		sb.replace(2, 7, "BUFFER");
		System.out.println("sb is " + sb);
		sb.delete(2, 4);
		System.out.println("sb2 is " + sb);
		String s2 = sb.substring(1,5);
		System.out.println("s2 is " + s2);
		
		try{
			Date dt = new SimpleDateFormat("yyyy-mm-dd").parse("2012-01-15");
			Calendar ac = Calendar.getInstance();
			ac.setTime(dt);
			System.out.println(ac.get(ac.MONTH));
		}catch(Exception e){
			
		}
		
		Integer ii1 = new Integer(1);
		Integer ii2 = ii1;
		ii1 +=1;
		System.out.println(ii1);
		System.out.println(ii2);
		
		File f2 = new File("abvc.txt");
		f2.delete();
		
		try{
		String names = Calendar.getInstance().getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, Locale.ENGLISH);
		System.out.println(names.toString());
		}catch(Exception e){
			
		}
		
		String sA = "A";
		String sB = "B";
		String sN = null;
		StringBuffer ssub = new StringBuffer("C");
		Formatter fmt = new Formatter(ssub);
		
		fmt.format("%s%s", sA, sB);
		System.out.println("fmt : " + fmt);
		
		fmt.format("%-2s", sB);
		System.out.println("fmt : " + fmt);
		
		fmt.format("%b", sN);
		System.out.println(fmt);
		
		byte c1[] = {10,20,30,40,50};
		ByteArrayOutputStream bA = new ByteArrayOutputStream(10);
		bA.write(c1,0,4);
		System.out.println(bA.size());
		
		int p = -1;
		p = p >>> 32;
		System.out.println(p+"1");
		p = p >>> 0;
		System.out.println(p+"2");
		
		p = p >> 32;
		System.out.println(p+"3");
		
		p = p >> 1;
		System.out.println(p+"4");
		
		p = p >>> 1;
		System.out.println(p+"5");
	}
}

class Element implements Comparable{
	int id;
	Element (int id){
		this.id = id;
	}
	
	public int compareTo(Object obj){
		Element e = (Element)obj;
		return this.id - e.id;
	}
	
	public String toString(){
		return "" + this.id;
	}
}