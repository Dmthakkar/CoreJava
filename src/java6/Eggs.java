package java6;

class Dozens {
	int[] dz = {1,2,3,4,5,6,7,8,9,10,11,12};
}
public class Eggs {
	public static void main(String[] args) {
		
		String pw;
		if(pw == "ABc"){
			
		}		
		
		Dozens [] da = new Dozens[3];
		da[0] = new Dozens();
		Dozens d = new Dozens();
		da[1] = d;
		d = null;
		da[1] = null;
		for (Dozens d1 : da){
			System.out.println(d1);
		}
		// do stuff
	}
}