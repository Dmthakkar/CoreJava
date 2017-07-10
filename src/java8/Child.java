package java8;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Optional;

class A{
	A(){
		System.out.println("A");
	}
}

class B{
	B(){
		System.out.println("B");	
	}
}
	

public class Child extends A {
	Child(A car, float f){
		System.out.println("C");
	}
	
	public static void main(String args[]){
		new Child(new A(),5.0f);
	}
	
}
