package java6;

class Animal {
	static void doStuff() {
		System.out.print("a ");
	}
	
	final public void test(){
		
	}
}
class Dog extends Animal {
	static void doStuff() { // it's a redefinition,
		// not an override
		System.out.print("d ");
	}
	public void test(){
		
	}
	public static void main(String [] args) {
		Animal [] a = {new Animal(), new Dog(), new Animal()};
		for(int x = 0; x < a.length; x++)
			a[x].doStuff(); // invoke the static method
		
		int x;
		if (args[0] != null){
			x = 2;
		}
		//System.out.println(x);
	}
}