package java6;

public class Autoboxing_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long i = 10;
		short s = (short)7000000;
		new Autoboxing_test().autoboxingTest((int)i);
	}
	
	public void autoboxingTest(int i){
		System.out.println("mint");
	}
/*	public void autoboxingTest(Integer i){
		System.out.println("mInteger");
	}
	public void autoboxingTest(long l){
		System.out.println("mlong");
	}
	public void autoboxingTest(Long l){
		System.out.println("mLong");
	}
	public void autoboxingTest(Object o){
		System.out.println("mObject");
	}
	public void autoboxingTest(int...  i){
		System.out.println("mVararg");
	}*/
}
