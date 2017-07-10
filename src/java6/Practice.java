package java6;

class SuperClass{
	/*SuperClass(){
		System.out.println("SuperClass Constructor");
	}*/
	SuperClass(int x){
		System.out.println("SuperClass Constructor with x :"+x);
	}
	
	public static Object test1(){
		System.out.println("SuperClass Test1");
		return null;
	}
}

public class Practice extends SuperClass{

	public Practice(int x){
		super(x);
		System.out.println("Practice Constructor with x "+x);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SuperClass c = new Practice(1);
		c.test1();
		test1();
	}
	
	public static Integer test1(){
		System.out.println("Practice Test1");
		return 1;
	}
	
	void methodA(){
		int x = 7;
		System.out.println("Hi Testing it");
	}

}
